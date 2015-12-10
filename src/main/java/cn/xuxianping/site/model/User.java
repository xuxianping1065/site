package cn.xuxianping.site.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.jdbc.SqlBuilder;

import cn.xuxianping.framework.core.BaseEntity;
import cn.xuxianping.framework.core.Stateful;

@Entity
@Table(name="USERS")
public class User implements BaseEntity, Stateful{
	
	private Long id;
	
	private String username;
	
	private String password;
	
	private String name;
	
	private Long status = Stateful.STATUS_AVAILABLE;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String insertSql(){
		SqlBuilder.BEGIN();
		String sql = "insert into users(username,password,name,status) values('xxxp','xxxxxx','sdfsaf',1)";
		return sql;
	}
}
