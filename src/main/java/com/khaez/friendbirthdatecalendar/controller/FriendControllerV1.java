package com.khaez.friendbirthdatecalendar.controller;

import com.khaez.friendbirthdatecalendar.service.IAuthService;
import com.khaez.friendbirthdatecalendar.service.IFriendService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/v1/friend")
public class FriendControllerV1 {

    private final IFriendService friendService;
    private final IAuthService authService;
}
