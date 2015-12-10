package cn.xuxianping.site.service;

import cn.xuxianping.site.model.User;

public interface UserService {
	
	public boolean saveUser(User user);
	
	public boolean deleteUser(User user);
	
	public boolean deleteUserById(Long id);
	
	public User getUserById(Long id);
	
	public User getUserByUsername(String username);
	
	public User getUserByUsernameAndPassword(String username, String password);
}
