package com.khaez.friendbirthdatecalendar.repository;

import com.khaez.friendbirthdatecalendar.model.dbschema.Friend;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepo extends MongoRepository<Friend, Long> {}
