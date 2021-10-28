package com.premieremediaservices.dinnerizer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int min = 1;
    public int max = 3;
    public TextView entreeTextView;
    public TextView sideOneTextView;
    public TextView sideTwoTextView;
    public TextView dessertTextView;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void spinClick(View view) {

        String[] entreeArray = new String[3];
        entreeArray[0] = "Hamburgers";
        entreeArray[1] = "Grilled Chicken";
        entreeArray[2] = "Pork Loin";
        int entreeID = (int) ((Math.random() * ((max - min) + 1)) + min);
        String entreeName = entreeArray[entreeID - 1];
        entreeTextView.setText(entreeName);

        String[] side1Array = new String[3];
        side1Array[0] = "Mixed Greens";
        side1Array[1] = "Green Beans";
        side1Array[2] = "Garden Salad";
        int side1ID = (int) ((Math.random() * ((max - min) + 1)) + min);
        String side1Name = side1Array[side1ID - 1];
        sideOneTextView.setText(side1Name);

        String[] side2Array = new String[3];
        side2Array[0] = "Herb Rice";
        side2Array[1] = "Mac-n-Cheese";
        side2Array[2] = "Steak Fries";
        int side2ID = (int) ((Math.random() * ((max - min) + 1)) + min);
        String side2Name = side2Array[side2ID - 1];
        sideTwoTextView.setText(side2Name);

        String[] dessertArray = new String[3];
        dessertArray[0] = "Berries with Cream";
        dessertArray[1] = "Pie Ala Mode";
        dessertArray[2] = "Cheesecake";
        int dessertID = (int) ((Math.random() * ((max - min) + 1)) + min);
        String dessertName = dessertArray[dessertID - 1];
        dessertTextView.setText(dessertName);
    }


}
