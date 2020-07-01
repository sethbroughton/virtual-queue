package com.fullcity.virtualqueue.data;

import com.fullcity.virtualqueue.model.User;

public interface UserDAO {
    public User createUser(User user);
    public User readUser(long userId);
    public User updateUser(User user);
    public User deleteUser(User user);
}
