package com.example.greeting_app.security;

import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;

public class JwtSecretKey {
    public static SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor("sdkfdlsjfdslfjkkllk".getBytes());
    }
}
