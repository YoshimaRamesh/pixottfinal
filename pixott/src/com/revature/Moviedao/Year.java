package com.revature.Moviedao;

public class Year {
int id;
String movie_name;
public Year(int id, String movie_name) {
	super();
	this.id = id;
	this.movie_name = movie_name;
}
public Year() {
	
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
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
	Year other = (Year) obj;
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
	System.out.println(String.format("%s %-10s %-40s", "Id","|","Movie Name"));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	return String.format("%d %-10s %-40s", id,"|",movie_name);
}
}
