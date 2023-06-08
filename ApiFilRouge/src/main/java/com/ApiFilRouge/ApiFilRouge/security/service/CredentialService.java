package com.ApiFilRouge.ApiFilRouge.security.service;

import com.ApiFilRouge.ApiFilRouge.security.entity.Credential;

public interface CredentialService {

    Credential saveCredential(Credential credential);

    Credential findCredentialByUsername(String username);

}