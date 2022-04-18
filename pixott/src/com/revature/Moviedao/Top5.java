package com.revature.Moviedao;

public class Top5 {
int rid;
int top_5_movies;
String movie_name;
public Top5(int rid, int top_5_movies, String movie_name) {
	super();
	this.rid = rid;
	this.top_5_movies = top_5_movies;
	this.movie_name = movie_name;
}
public Top5(){
	
}
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public int getTop_5_movies() {
	return top_5_movies;
}
public void setTop_5_movies(int top_5_movies) {
	this.top_5_movies = top_5_movies;
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
	result = prime * result + ((movie_name == null) ? 0 : movie_name.hashCode());
	result = prime * result + rid;
	result = prime * result + top_5_movies;
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
	Top5 other = (Top5) obj;
	if (movie_name == null) {
		if (other.movie_name != null)
			return false;
	} else if (!movie_name.equals(other.movie_name))
		return false;
	if (rid != other.rid)
		return false;
	if (top_5_movies != other.top_5_movies)
		return false;
	return true;
}
@Override
public String toString() {
	return String.format("ID=%d %-40s", top_5_movies,movie_name);
}
}
