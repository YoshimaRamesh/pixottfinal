package com.revature.Moviedao;

public class Movielist{
int id;
String movie_name;
int audience_score;
float profitability;
int roten_tomatos;
double worldwide_gross;
int lead_studio_id;
int gener_id;
int year_id;
int top_5_movies;
int wishlist;
int history;
public Movielist(int id, String movie_name, int audience_score, float profitability, int roten_tomatos,
		double worldwide_gross, int lead_studio_id, int gener_id, int year_id, int top_5_movies, int wishlist, int history) {
	super();
	this.id = id;
	this.movie_name = movie_name;
	this.audience_score = audience_score;
	this.profitability = profitability;
	this.roten_tomatos = roten_tomatos;
	this.worldwide_gross = worldwide_gross;
	this.lead_studio_id = lead_studio_id;
	this.gener_id = gener_id;
	this.year_id = year_id;
	this.top_5_movies=top_5_movies;
	this.wishlist=wishlist;
	this.history=history;
}
public Movielist() {
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
public int getAudience_score() {
	return audience_score;
}
public void setAudience_score(int audience_score) {
	this.audience_score = audience_score;
}
public float getProfitability() {
	return profitability;
}
public void setProfitability(float profitability) {
	this.profitability = profitability;
}
public int getRoten_tomatos() {
	return roten_tomatos;
}
public void setRoten_tomatos(int roten_tomatos) {
	this.roten_tomatos = roten_tomatos;
}
public double getWorldwide_gross() {
	return worldwide_gross;
}
public void setWorldwide_gross(double worldwide_gross) {
	this.worldwide_gross = worldwide_gross;
}
public int getLead_studio_id() {
	return lead_studio_id;
}
public void setLead_studio_id(int lead_studio_id) {
	this.lead_studio_id = lead_studio_id;
}
public int getGener_id() {
	return gener_id;
}
public void setGener_id(int gener_id) {
	this.gener_id = gener_id;
}
public int getYear_id() {
	return year_id;
}
public void setYear_id(int year_id) {
	this.year_id = year_id;
}
public int getTop_5_movies() {
	return top_5_movies;
}
public void setTop_5_movies(int top_5_movies) {
	this.top_5_movies=top_5_movies;
}
public int getWishlist() {
	return wishlist;
}
public void setWishlist(int wishlist) {
	 this.wishlist=wishlist;
}
public int getHistroy() {
	return history;
}
public void setHistory(int history) {
	this.history=history;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + audience_score;
	result = prime * result + gener_id;
	result = prime * result + id;
	result = prime * result + lead_studio_id;
	result = prime * result + Float.floatToIntBits(profitability);
	result = prime * result + roten_tomatos;
	long temp;
	temp = Double.doubleToLongBits(worldwide_gross);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + year_id;
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
	Movielist other = (Movielist) obj;
	if (audience_score != other.audience_score)
		return false;
	if (gener_id != other.gener_id)
		return false;
	if (id != other.id)
		return false;
	if (lead_studio_id != other.lead_studio_id)
		return false;
	if (movie_name != other.movie_name)
		return false;
	if (Float.floatToIntBits(profitability) != Float.floatToIntBits(other.profitability))
		return false;
	if (roten_tomatos != other.roten_tomatos)
		return false;
	if (Double.doubleToLongBits(worldwide_gross) != Double.doubleToLongBits(other.worldwide_gross))
		return false;
	if (year_id != other.year_id)
		return false;
	return true;
}
@Override
public String toString() {
	return String.format("[ID=%d] %-40s",id, movie_name);
}
}
