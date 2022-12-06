# 프로젝트 설명
이 프로젝트는 Sping Boot Security를 이용한 인증을 구현한 예제 프로젝트입니다.  
Token이 잘 발행되는지, 발행된 Token을 이용해 인증을 시도했을 때 유효한 Token인지 잘못된 Token인지 확인하는 기능을 구현합니다. 

# Endpoints
- `Post` /api/v1/users/login : 단순 토큰 발급
- `Post` /api/v1/reviews : 토큰 인증

# 실행방법
1. http://localhost:8080/api/v1/users/login 를 호출하여 Token 발행
2. http://localhost:8080/api/v1/reviews 를 호출할 때, Header에 Authorization에 `Bearer <Token>`을 넣어서 요청