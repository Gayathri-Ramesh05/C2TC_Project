package com.tns.online_shopping.entities;

public class Admin {

	public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    @Override
    public String toString() {
        return "Admin [userId=" + userId +
               ", username=" + username +
               ", email=" + email + "]";
    }

}
