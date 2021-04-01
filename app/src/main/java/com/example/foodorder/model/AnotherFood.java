package com.example.foodorder.model;

public class AnotherFood {
    String name,price;
    Integer ImageUrl;
    String rating;
    String restaurantName;



    public AnotherFood(String name, String price, Integer imageUrl, String rating, String restaurantName) {
        this.name = name;
        this.price = price;
        ImageUrl = imageUrl;
        this.rating = rating;
        this.restaurantName = restaurantName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        ImageUrl = imageUrl;
    }
}
