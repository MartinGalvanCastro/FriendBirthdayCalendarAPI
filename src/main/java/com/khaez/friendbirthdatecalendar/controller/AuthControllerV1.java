package com.khaez.friendbirthdatecalendar.controller;

import com.khaez.friendbirthdatecalendar.model.dto.ForgotDTO;
import com.khaez.friendbirthdatecalendar.model.dto.LoginDTO;
import com.khaez.friendbirthdatecalendar.model.dto.ResetDTO;
import com.khaez.friendbirthdatecalendar.model.dto.SignUpDTO;
import com.khaez.friendbirthdatecalendar.service.IAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Auth Controller V1 class TODO: All implementation */
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/v1/auth")
public class AuthControllerV1 {

    private final IAuthService authService;

    /**
     * POST Request for login Should return an auth token? (May be in cookies or header)
     *
     * @param loginDTO, login payload
     */
    @PostMapping("/login")
    public void login(LoginDTO loginDTO) {}

    /** POST Request for logout Should invalidate auth token */
    @PostMapping("/logout")
    public void logout() {}

    /**
     * POST Request for Signup Should return an auth token (May be in cookies or header)
     *
     * @param signUpDTO, Sign up payload
     */
    @PostMapping("/signup")
    public void login(SignUpDTO signUpDTO) {}

    /**
     * POST Request for logout Should invalidate auth token
     *
     * @param forgotDTO, forgot payload
     */
    @PostMapping("/forgot")
    public void logout(ForgotDTO forgotDTO) {}

    /**
     * POST Request for reset password Should invalidate auth token
     *
     * @param resetDTO, ResetPayload
     */
    @PostMapping("/reset")
    public void logout(ResetDTO resetDTO) {}
}
