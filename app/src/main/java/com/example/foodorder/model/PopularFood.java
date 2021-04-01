package com.example.foodorder.model;

public class PopularFood {
    String name,price;
    Integer ImageUrl;

    public PopularFood() {
    }

    public PopularFood(String name, String price, Integer imageUrl) {
        this.name = name;
        this.price = price;
        ImageUrl = imageUrl;
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
