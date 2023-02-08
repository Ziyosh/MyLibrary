package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBook;
    private static ArrayList<Book> currentlyReadingBook;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> addToFavorite;

    private Utils() {
        if(null == allBooks){
            allBooks = new ArrayList<>();
            initData();
        }
        if(null == alreadyReadBook){
            alreadyReadBook = new ArrayList<>();
        }
        if(null == currentlyReadingBook){
            currentlyReadingBook = new ArrayList<>();
        }
        if(null == wantToReadBooks){
            wantToReadBooks = new ArrayList<>();
        }
        if(null == addToFavorite){
            addToFavorite = new ArrayList<>();
        }
    }

    private void initData() {
        //TODO: add initial data

        allBooks.add(new Book(1, "Ego is the enemy", "Ryan Holiday", 256,
                "Long Description", "Ego Is The Enemy reveals why a tendency that's hardwired into our brains", "https://www.moscowbooks.ru/image/book/500/w259/i50017341.jpg"));
        allBooks.add(new Book(2, "Sen Yola Çık\nYol Sana Görünür", "Hakan Mengüç", 184, "Long Description", "Her Şey Vaktini Bekler. Ne Gül Vaktinden Önce Açar Ne de Güneş Vaktinden Önce Doğar. Biraz Sabret Senin Olan Sana Gelecektir.", "https://strgimgr.umico.az/sized/840/355968-e5e451ba1d1ddbe22ec6672d8e2ba978.jpg"));
        allBooks.add(new Book(3, "Do It Today", "Darius Foroux", 171, "Long Description", "Time is limited, that’s why we must do the things we want: Today.", "https://m.media-amazon.com/images/I/41-G7AIOZyL.jpg" ));
        allBooks.add(new Book(4, "Hayot yutqazgan\njoyingdan boshlanar", "Mirach Chag‘ri Oqtosh", 240, "Long Description", "Short Description", "https://olcha.uz/image/440x440/products/n8INEIeML090XaNjItYVudIUqoswovu5W6XoJvEPYuyHJ5LHNkKwitRkeAgX.jpeg" ));
        allBooks.add(new Book(5, "Who Will Cry\nWhen You Die?", " Robin Sharma", 256, "Long Description", "Short Description", "https://m.media-amazon.com/images/I/518KBtDTNDL._SX406_BO1,204,203,200_.jpg" ));
    }

    public static Utils getInstance() {
        if (null != instance){
            return instance;
        }else {
            instance = new Utils();
            return instance;
        }
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBook() {
        return alreadyReadBook;
    }

    public static ArrayList<Book> getCurrentlyReadingBook() {
        return currentlyReadingBook;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getAddToFavorite() {
        return addToFavorite;
    }
    
    public Book getBookById(int id){
        for (Book b: allBooks) {
            if ( b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}
