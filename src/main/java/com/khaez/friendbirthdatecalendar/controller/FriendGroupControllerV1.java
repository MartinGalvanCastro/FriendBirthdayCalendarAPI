package com.khaez.friendbirthdatecalendar.controller;

import com.khaez.friendbirthdatecalendar.service.IFriendGroupService;
import com.khaez.friendbirthdatecalendar.service.IFriendService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/v1/friendgroup")
public class FriendGroupControllerV1 {

    private final IFriendGroupService friendGroupService;
    private final IFriendService friendService;
}
