package com.example.dell.a5cards_prototype_1;

/**
 * Created by DELL on 11/27/2017.
 */

public class singleRecyclerItem {

    String price, name;
    Integer image;


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public singleRecyclerItem(String price, String name, Integer image) {

        this.price = price;
        this.name = name;
        this.image = image;
    }
}
