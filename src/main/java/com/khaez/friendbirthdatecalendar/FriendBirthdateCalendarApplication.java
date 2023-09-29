package com.khaez.friendbirthdatecalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FriendBirthdateCalendarApplication {

    public static void main(String[] args) {
        SpringApplication.run(FriendBirthdateCalendarApplication.class, args);
    }
}
