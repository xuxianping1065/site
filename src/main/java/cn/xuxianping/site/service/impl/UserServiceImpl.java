package cn.xuxianping.site.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.xuxianping.framework.core.service.GeneralService;
import cn.xuxianping.site.model.User;
import cn.xuxianping.site.service.UserService;

@Repository
public class UserServiceImpl implements UserService {
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private GeneralService generalService;
		
	public boolean saveUser(User user) {
		boolean isSuc = true;
		try {
			generalService.save(user);
		} catch (Exception e) {
			logger.debug(e.getMessage());
			e.printStackTrace();
			isSuc = false;
		}
		return isSuc;
	}

	public boolean deleteUser(User user) {
		
		return false;
	}

	public boolean deleteUserById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUserById(Long id) {
		return null;
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByUsernameAndPassword(String username, String password) {
		
		return null;
		//return userMapper.getUserByUsernameAndPassword(username, password);
	}

}
