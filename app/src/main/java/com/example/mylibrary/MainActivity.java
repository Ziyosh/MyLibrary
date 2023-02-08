package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSeeAllBooks, btnCurrReadBook, btnAlreadyReadBook, btnWishlist, btnFavorites, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnSeeAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btnSeeAllBooks = findViewById(R.id.btnSeeAllBooks);
        btnCurrReadBook = findViewById(R.id.btnCurrReadingBooks);
        btnAlreadyReadBook = findViewById(R.id.btnAlreadyReadBooks);
        btnWishlist = findViewById(R.id.btnWishlist);
        btnFavorites = findViewById(R.id.btnFavoriteBooks);
        btnAbout = findViewById(R.id.btnAbout);
    }
}