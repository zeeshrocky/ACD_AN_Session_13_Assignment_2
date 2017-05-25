package com.example.zeeshan.actionbar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setLogo(R.mipmap.ic_launcher);
            actionBar.setDisplayUseLogoEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mic:
                Toast.makeText(getApplicationContext(), "Mic selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.phone:
                Toast.makeText(getApplicationContext(), "Phone selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.checkmark:
                Toast.makeText(getApplicationContext(), "Checkmark selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Toast.makeText(getApplicationContext(), "Settings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.status:
                Toast.makeText(getApplicationContext(), "Status selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contacts:
                Toast.makeText(getApplicationContext(), "Contact selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}