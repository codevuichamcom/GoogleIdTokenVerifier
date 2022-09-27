package com.example.login;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final GoogleHelper googleHelper;

    @PostMapping("/info")
    public Payload getInfo(@RequestBody TokenRequest tokenRequest) throws GeneralSecurityException, IOException {
        return googleHelper.getInfo(tokenRequest);
    }
}
