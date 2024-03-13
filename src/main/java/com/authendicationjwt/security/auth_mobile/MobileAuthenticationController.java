package com.authendicationjwt.security.auth_mobile;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class MobileAuthenticationController {

    private final MobileAuthenticationService service;

    @PostMapping("/mobileregister")
    public ResponseEntity<MobileAuthenticationResponse> register(
            @RequestBody MobileRegisterRequest request
    ){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/mobileauthenticate")
    public ResponseEntity<MobileAuthenticationResponse> authenticate(
            @RequestBody MobileAuthenticationRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));
    }
}
