package com.example.bbamar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToTilers(View view) {
        Intent intent = new Intent(this, tilers.class);
        startActivity(intent);
    }
    public void moveToPainters(View view) {
        Intent intent = new Intent(this, painters.class);
        startActivity(intent);
    }
    public void moveToPlumbers(View view) {
        Intent intent = new Intent(this, plumbers.class);
        startActivity(intent);
    }

        public void moveToElectricals(View view){
            Intent intent = new Intent(this, electricals.class);
            startActivity(intent);
        }
    public void moveToCarpenters(View view) {
        Intent intent = new Intent(this, carpenters.class);
        startActivity(intent);
    }
    public void moveToBlackSmithers(View view) {
        Intent intent = new Intent(this, blackSmither.class);
        startActivity(intent);
    }
    public void moveToMirrors(View view) {
        Intent intent = new Intent(this, mirrors.class);
        startActivity(intent);
    }
    public void moveToFurnitures(View view) {
        Intent intent = new Intent(this, furnitures.class);
        startActivity(intent);
    }
    public void moveToAirCondetioners(View view) {
        Intent intent = new Intent(this, airCondetioner.class);
        startActivity(intent);
    }
    public void moveToBoilers(View view) {
        Intent intent = new Intent(this, boilers.class);
        startActivity(intent);
    }


}