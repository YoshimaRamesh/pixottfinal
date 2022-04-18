package com.revature.Moviedao;

public class userLoginDao {
int id;
int login_id;
String password;
String name;
public userLoginDao(int id, int login_id, String password, String name) {
	super();
	this.id = id;
	this.login_id = login_id;
	this.password = password;
	this.name= name;
}
public userLoginDao() {
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getLogin_id() {
	return login_id;
}
public void setLogin_id(int login_id) {
	this.login_id = login_id;
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + login_id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	userLoginDao other = (userLoginDao) obj;
	if (id != other.id)
		return false;
	if (login_id != other.login_id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	return true;
}
@Override
public String toString() {
	return String.format("Welcome %s", name);
}

}
