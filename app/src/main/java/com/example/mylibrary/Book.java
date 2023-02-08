package com.example.mylibrary;

public class Book {

    private int id;
    private String name;
    private String author;
    private int numOfPages;
    private String longDesc;
    private String shortDesc;
    private String imageUrl;
    private boolean isExpanded;

    public Book(int id, String name, String author, int nOfPages, String longDesc, String shortDesc, String imageUrl) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.numOfPages = nOfPages;
        this.longDesc = longDesc;
        this.shortDesc = shortDesc;
        this.imageUrl = imageUrl;
        isExpanded = false;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", nOfPages=" + numOfPages +
                ", longDesc='" + longDesc + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
