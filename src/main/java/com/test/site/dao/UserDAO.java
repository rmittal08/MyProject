/**
 * 
 */
package com.test.site.dao;

import com.test.site.model.User;

/**
 * @author rahulmittal
 *
 */
public interface UserDAO {
	Long saveUser(User user);
	User getUser(String username);
}
