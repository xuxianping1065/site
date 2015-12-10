package cn.xuxianping.site.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import cn.xuxianping.site.dao.UserDao;
import cn.xuxianping.site.model.User;

@Service
public class UserDaoImpl implements UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	public boolean saveUser(User user) {
		return false;
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUserById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUserById(Long id) {
		String sql = "select * from blog where id ="+id;
		User user = (User)jdbcTemplate.queryForObject(sql, new RowMapper<User>() {

			public User mapRow(ResultSet arg0, int arg1) throws SQLException {
				User user = new User();
				user.setId(arg0.getLong(1));
				user.setName(arg0.getString(2));
				return user;
			}
			
		});
		
		return user;
	}

	public User getUserByUsername(String username) {
		return null;
	}

	public User getUserByUsernameAndPassword(String username, String password) {
		return null;
	}

}
