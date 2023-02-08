package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    public static final String BOOK_ID_KEY = "bookId";

    private ImageView imageBook;
    private Button btnCurrReading, btnWantToRead, btnAlreadyRead, btnAddToFav;
    private TextView txtBkName, txtAuth, pagesTxt, txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

//        String longDescription = "The instant Wall Street Journal, USA Today, and international bestseller\n" +
//                "\n" +
//                "“While the history books are filled with tales of obsessive visionary geniuses who remade the world in their image with sheer, almost irrational force, I’ve found that history is also made by individuals who fought their egos at every turn, who eschewed the spotlight, and who put their higher goals above their desire for recognition.” —from the prologue\n" +
//                " \n" +
//                "Many of us insist the main impediment to a full, successful life is the outside world. In fact, the most common enemy lies within: our ego. Early in our careers, it impedes learning and the cultivation of talent. With success, it can blind us to our faults and sow future problems. In failure, it magnifies each blow and makes recovery more difficult. At every stage, ego holds us back.\n" +
//                " \n" +
//                "Ego Is the Enemy draws on a vast array of stories and examples, from literature to philosophy to history. We meet fascinating figures such as George Marshall, Jackie Robinson, Katharine Graham, Bill Belichick, and Eleanor Roosevelt, who all reached the highest levels of power and success by conquering their own egos. Their strategies and tactics can be ours as well.\n" +
//                " \n" +
//                "In an era that glorifies social media, reality TV, and other forms of shameless self-promotion, the battle against ego must be fought on many fronts. Armed with the lessons in this book, as Holiday writes, “you will be less invested in the story you tell about your own specialness, and as a result, you will be liberated to accomplish the world-changing work you’ve set out to achieve.”";
//
//        Book book = new Book("1", "Ego is the enemy", "Ryan Holiday", 256, longDescription, "Ego Is The Enemy reveals why a tendency that's hardwired into our brains", "https://www.moscowbooks.ru/image/book/500/w259/i50017341.jpg");

        Intent intent = getIntent();
        if(null != intent){
            int bookId = intent.getIntExtra(BOOK_ID_KEY, -1);
               if(bookId != -1){
                Book incomingBook = Utils.getInstance().getBookById(bookId);
                if(null != incomingBook){
                    setData(incomingBook);
                }
            }
        }
    }

    private void setData(Book book){
        txtBkName.setText(book.getName());
        txtAuth.setText(book.getAuthor());
        pagesTxt.setText(String.valueOf(book.getNumOfPages()));
        txtDescription.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap().load(book.getImageUrl())
                .into(imageBook);
    }

    private void initViews() {
        imageBook = findViewById(R.id.bookImage);

        btnCurrReading = findViewById(R.id.btnCurrReading);
        btnWantToRead = findViewById(R.id.btnWantToRead);
        btnAlreadyRead = findViewById(R.id.btnAlreadyRead);
        btnAddToFav = findViewById(R.id.btnAddToFav);

        txtBkName = findViewById(R.id.txtBookName);
        txtAuth = findViewById(R.id.txtAuthor);
        pagesTxt = findViewById(R.id.pagesTxt);
        txtDescription = findViewById(R.id.txtDescription);
    }


}