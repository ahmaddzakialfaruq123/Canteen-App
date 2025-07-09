package com.example.canteenapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class
OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Get data from intent
        String itemName = getIntent().getStringExtra("item");
        int itemPrice = getIntent().getIntExtra("price", 0);

        // Display item name and price
        TextView itemTextView = findViewById(R.id.itemTextView);
        TextView priceTextView = findViewById(R.id.priceTextView);

        itemTextView.setText("Item: " + itemName);
        priceTextView.setText("Price: Rp " + itemPrice);
    }
}
