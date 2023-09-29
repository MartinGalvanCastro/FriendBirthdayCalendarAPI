package com.khaez.friendbirthdatecalendar.service;

/** TODO: Pending to define Auth Service Functionality */
public interface IAuthService {

    /**
     * Method for registering a user into the db
     *
     * <p>It should generate a session token
     */
    void registerUser();

    /**
     * Method for log in a user
     *
     * <p>It should return a session token
     */
    void login();

    /**
     * Method for log out a user
     *
     * <p>Should invalidate a session token
     */
    void logout();

    /**
     * Method for change the password of a user
     *
     * <p>Should change the password in the DB and return a session token
     */
    void forgotPassword();
}
