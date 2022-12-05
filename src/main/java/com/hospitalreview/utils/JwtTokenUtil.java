package com.hospitalreview.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtTokenUtil {

    // secret를 사용하여 token을 parser
    private static Claims extractClaims(String token, String key) {
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
    }

    // token 사용기간이 유효한지 Check
    public static boolean isExpired(String token, String key) {
        Date expiredDate = extractClaims(token, key).getExpiration(); // expire timestamp를 return함
        return expiredDate.before(new Date()); // 현재보다 전인지 check를 합니다.
    }

    public static String createToken(String userName, String key, long expireTime) {
        Claims claims = Jwts.claims();  // 일종의 map
        claims.put("userName", userName);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
    }
}
