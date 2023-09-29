package com.khaez.friendbirthdatecalendar.repository;

import com.khaez.friendbirthdatecalendar.model.dbschema.AuthUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepo extends MongoRepository<AuthUser, Long> {}
