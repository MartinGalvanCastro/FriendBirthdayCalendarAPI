package com.khaez.friendbirthdatecalendar.service;

import com.khaez.friendbirthdatecalendar.model.dbschema.Friend;
import java.util.List;

/** Interface for FriendService */
public interface IFriendService {

    /**
     * Method for getting all users
     *
     * @return list of friends
     */
    List<Friend> getAllFriends();

    /**
     * Method that returns a friend by ID
     *
     * @return specific friend by ID
     */
    Friend getFriendById(Long id);

    /**
     * Method that creates a friend
     *
     * @return the created friend TODO: Add request body as parameter
     */
    Friend createFriend();

    /**
     * Method that updates a friend info
     *
     * @param id of the friend to modify
     * @return the updated friend TODO: Add request body as parameter
     */
    Friend updateFriend(Long id);

    /**
     * Method that deletes a friend
     *
     * @param id, Id of the friend to delete
     */
    void deleteFriend(Long id);
}
