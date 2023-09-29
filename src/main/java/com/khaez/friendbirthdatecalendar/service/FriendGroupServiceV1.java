package com.khaez.friendbirthdatecalendar.service;

import com.khaez.friendbirthdatecalendar.model.dbschema.FriendGroup;
import com.khaez.friendbirthdatecalendar.repository.FriendGroupRepo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class FriendGroupServiceV1 implements IFriendGroupService {

    private final FriendGroupRepo repo;

    @Override
    public List<FriendGroup> getAllFriendGroups() {
        return null;
    }

    @Override
    public FriendGroup getFriendGroupById(Long id) {
        return null;
    }

    @Override
    public FriendGroup createFriendGroup() {
        return null;
    }

    @Override
    public FriendGroup modifyFriendGroup(Long id) {
        return null;
    }

    @Override
    public void deleteFriendGroup() {}
}
