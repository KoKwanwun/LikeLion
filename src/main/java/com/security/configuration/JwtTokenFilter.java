package com.security.configuration;

import com.security.service.UserService;
import com.security.utils.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
public class JwtTokenFilter extends OncePerRequestFilter {

    private final UserService userService;
    private final String secretKey;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        // 토큰이 없거나, Bearer 로 시작하지 않을 경우
        if(authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")){
            filterChain.doFilter(request, response);
            return;
        }

        // token 분리
        String token;
        try {
            token = authorizationHeader.split(" ")[1];
        } catch (Exception e) {
            log.error("token 추출에 실패했습니다.");
            filterChain.doFilter(request, response);
            return;
        }

        // 토큰 기간 만료의 경우
        if(JwtTokenUtil.isExpired(token, secretKey)){
            filterChain.doFilter(request, response);
            return;
        }

        // message 가져오기
        String message = JwtTokenUtil.getMessage(token, secretKey);

        // 권한 부여, Role 바인딩
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(message, null, List.of(new SimpleGrantedAuthority("MESSAGE")));
        authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);  // 권한 부여
        filterChain.doFilter(request, response);
    }
}
