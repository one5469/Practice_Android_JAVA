package com.example.practice_7_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;
    TextView txtview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("배경색 바꾸기");
        baseLayout = findViewById(R.id.baseLayout);
        button1 = findViewById(R.id.button1);
        txtview = findViewById(R.id.txt);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        int itemId = item.getItemId();
        if (itemId == R.id.itemRed) {
            baseLayout.setBackgroundColor(Color.RED);
            return true;
        } else if (itemId == R.id.itemGreen) {
            baseLayout.setBackgroundColor(Color.GREEN);
            return true;
        } else if (itemId == R.id.itemBlue) {
            baseLayout.setBackgroundColor(Color.BLUE);
            return true;
        } else if (itemId == R.id.subRotate) {
            button1.setRotation(45);
            return true;
        } else if (itemId == R.id.subSize) {
            button1.setScaleX(2);
            return true;
        }

        return false;
    }
}