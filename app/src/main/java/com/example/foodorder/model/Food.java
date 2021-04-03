package com.example.foodorder.model;

public class Food {
    String name;
    String price;
    Integer imageUrl;
    Integer detail;
    String title;
    String rating;
    String restaurantName;


    public Food() {
    }

    public Food(String name,String price,Integer imageUrl,Integer detail,String title,String rating,String restaurantName) {
       this.name=name;
       this.price=price;
       this.imageUrl=imageUrl;
       this.detail=detail;
       this.title=title;
       this.rating=rating;
       this.restaurantName=restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public void setDetail(Integer detail) {
        this.detail = detail;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Integer getDetail() {
        return detail;
    }
}
