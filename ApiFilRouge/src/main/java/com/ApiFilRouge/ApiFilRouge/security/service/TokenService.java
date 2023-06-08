package com.ApiFilRouge.ApiFilRouge.security.service;

import com.ApiFilRouge.ApiFilRouge.security.entity.response.TokenResponse;

public interface TokenService {
    TokenResponse getRefreshToken(String refresh_token);
    TokenResponse getToken(String username, String password);
}
