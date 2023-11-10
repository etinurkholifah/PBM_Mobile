package com.example.projectnetworkingretrofit;

import java.util.List;

public class Restaurant{
	private List<CustomerReviewsItem> customerReviews;
	private String pictureId;
	private String name;
	private Object rating;
	private String description;
	private String id;

	public List<CustomerReviewsItem> getCustomerReviews(){
		return customerReviews;
	}

	public String getPictureId(){
		return pictureId;
	}

	public String getName(){
		return name;
	}

	public Object getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}
}
