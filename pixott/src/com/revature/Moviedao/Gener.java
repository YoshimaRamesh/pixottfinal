package com.revature.Moviedao;

public class Gener {
int id;
String movie_name;
String gener;
public Gener(int id, String movie_name, String gener) {
	super();
	this.id = id;
	this.movie_name = movie_name;
	this.gener = gener;
}
public Gener() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMovie_name() {
	return movie_name;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}
public String getGener() {
	return gener;
}
public void setGener(String gener) {
	this.gener = gener;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((gener == null) ? 0 : gener.hashCode());
	result = prime * result + id;
	result = prime * result + ((movie_name == null) ? 0 : movie_name.hashCode());
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
	Gener other = (Gener) obj;
	if (gener == null) {
		if (other.gener != null)
			return false;
	} else if (!gener.equals(other.gener))
		return false;
	if (id != other.id)
		return false;
	if (movie_name == null) {
		if (other.movie_name != null)
			return false;
	} else if (!movie_name.equals(other.movie_name))
		return false;
	return true;
}
@Override
public String toString() {
	return String.format("%d %s %-40s", id,"|",movie_name);
}
}
