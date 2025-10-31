package com.tnsif.onlineshopping.entities;

public class Admin {
	public Admin(int userId, String username, String email) {
        super();
    }

    @Override
    public String toString() {
        String userId = null;
		String email = null;
		String username = null;
		return "Admin [userId=" + userId +
               ", username=" + username +
               ", email=" + email + "]";
    }

	public Object getUserId() {
		// TODO Auto-generated method stub
		return null;
	}
}
