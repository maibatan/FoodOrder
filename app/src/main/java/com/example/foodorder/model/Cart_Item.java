package com.example.foodorder.model;


public class Cart_Item {
    String name;
    String price;
    Integer imageUrl;
    String amount;

    public Cart_Item(String name, String price, Integer imageUrl, String amount) {
        this.name=name;
        this.price=price;
        this.imageUrl=imageUrl;
        this.amount=amount;

    }

    public String getName() {
        return name;
    }
    public String getPrice() {

        return handlerPrice();
    }
    public Integer getImageUrl() {
        return imageUrl;
    }
    public String getAmount() {
        return amount;
    }

    private String handlerPrice()
    {
        String temp="";
        for (int i=0;i<price.length();i++)
        {
            if(price.charAt(i)>=48&& price.charAt(i)<=57) temp+=price.charAt(i);
        }
        temp=String.valueOf(Integer.parseInt(temp)*Integer.parseInt(amount));
        temp+="đ";
        return temp;
    }

}
