package cn.xuxianping.site.dao;

import cn.xuxianping.site.model.User;

public interface UserDao {

	public boolean saveUser(User user);
	
	public boolean deleteUser(User user);
	
	public boolean deleteUserById(Long id);
	
	public User getUserById(Long id);
	
	public User getUserByUsername(String username);
	
	public User getUserByUsernameAndPassword(String username, String password);
}
