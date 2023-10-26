package com.agency.spy.registration.infrastructure.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {
    private final String SECRET_KEY = "009e66d1d4255e90d623b89ba0f42724ccb68e735fad2bb8cd267a61b13a1311";
    private final Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);

    public String create(String email) {
        return JWT.create()
            .withSubject(email)
            .withIssuer("spy_agency")
            .withIssuedAt(new Date())
            .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15)))
            .sign(algorithm);
    }

    public boolean isValid(String jwt) {
        try {
            JWT.require(algorithm)
                .build()
                .verify(jwt);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }

    public String getEmail(String jwt) {
        return JWT.require(algorithm)
            .build()
            .verify(jwt)
            .getSubject();
    }
}
