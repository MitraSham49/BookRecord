package com.example.demo;

public class Book {
    private String title;
    private String auther;

    private  String description;
    private  Double price;
    private  boolean inStock;


    public Book() {
    }

    public Book(String title, String auther, String description, Double price, boolean inStock) {
        this.title = title;
        this.auther = auther;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public void getDisplayText() {
       System.out.println(getAuther());
       System.out.println(getTitle());
       System.out.println(getDescription());
        //System.out.print(getAuther()+getTitle()+getDescription());
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

   @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", auther='" + auther + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
