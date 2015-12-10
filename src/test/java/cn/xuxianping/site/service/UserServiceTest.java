package cn.xuxianping.site.service;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.util.Assert;

import cn.xuxianping.site.BaseTest;
import cn.xuxianping.site.model.User;


public class UserServiceTest extends BaseTest{
	
	@Resource
	private UserService userService;
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setUsername("xuxianping");
		user.setPassword("123456");
		user.setName("徐先平");
		
		Assert.isTrue(userService.saveUser(user));
	}

	//@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	//@Test
	public void testDeleteUserById() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetUserById() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetUserByUsername() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetUserByUsernameAndPassword() {
		fail("Not yet implemented");
	}

}
