package ca.greenops.it.softwareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        background.start();

    }

    Thread background = new Thread() {
        public void run() {
            try {
                Thread.sleep(1000);
                Intent intent = new Intent(getBaseContext(), LoginScreen.class);
                startActivity(intent);
                finish();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

}