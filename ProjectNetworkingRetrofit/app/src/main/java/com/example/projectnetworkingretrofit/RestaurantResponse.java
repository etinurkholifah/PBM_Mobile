package com.example.projectnetworkingretrofit;

public class RestaurantResponse{
	private Restaurant restaurant;
	private boolean error;
	private String message;

	public Restaurant getRestaurant(){
		return restaurant;
	}

	public boolean isError(){
		return error;
	}

	public String getMessage(){
		return message;
	}
}
