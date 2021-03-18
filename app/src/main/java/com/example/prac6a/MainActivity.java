package com.example.prac6a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this,"Selected item" +item.getTitle(),Toast.LENGTH_SHORT).show();
            return true;
            case R.id.upload:
                Toast.makeText(this,"Selected item" +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.copy:
                Toast.makeText(this,"Selected item" +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.print:
                Toast.makeText(this,"Selected item" +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mail:
                Toast.makeText(this,"Selected item" +item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            default:
                 return super.onOptionsItemSelected(item);
        }
    }
}