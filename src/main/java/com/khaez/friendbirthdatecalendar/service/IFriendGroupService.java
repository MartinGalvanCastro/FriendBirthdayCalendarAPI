package com.khaez.friendbirthdatecalendar.service;

import com.khaez.friendbirthdatecalendar.model.dbschema.FriendGroup;
import java.util.List;

/** Interface class for friend group service */
public interface IFriendGroupService {

    /**
     * Method for getting all the friend groups
     *
     * @return List with friend groups
     */
    List<FriendGroup> getAllFriendGroups();

    /**
     * Method for getting a specific friend group by Friend group id
     *
     * @param id, id of the friend group
     * @return Friend Group with specific id
     */
    FriendGroup getFriendGroupById(Long id);

    /**
     * Method for creating an FriendGroup
     *
     * @return Created friend group TODO: Pending to add body as parameter
     */
    FriendGroup createFriendGroup();

    /**
     * Method for modifying a friend group
     *
     * @return Modified friend group TODO: Pending to add body as parameter
     */
    FriendGroup modifyFriendGroup(Long id);

    /** Method that deletes a friend group */
    void deleteFriendGroup();
}
