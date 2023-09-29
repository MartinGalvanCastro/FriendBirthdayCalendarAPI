package com.khaez.friendbirthdatecalendar.service;

import com.khaez.friendbirthdatecalendar.model.dbschema.Friend;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class FriendServiceV1 implements IFriendService {
    @Override
    public List<Friend> getAllFriends() {
        return null;
    }

    @Override
    public Friend getFriendById(Long id) {
        return null;
    }

    @Override
    public Friend createFriend() {
        return null;
    }

    @Override
    public Friend updateFriend(Long id) {
        return null;
    }

    @Override
    public void deleteFriend(Long id) {}
}
