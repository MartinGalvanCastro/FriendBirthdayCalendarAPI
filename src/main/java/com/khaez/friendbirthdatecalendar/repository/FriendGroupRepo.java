package com.khaez.friendbirthdatecalendar.repository;

import com.khaez.friendbirthdatecalendar.model.dbschema.FriendGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendGroupRepo extends MongoRepository<FriendGroup, Long> {}
