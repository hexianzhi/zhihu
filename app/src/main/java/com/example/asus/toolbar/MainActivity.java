package com.example.asus.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
     Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//
//        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);//设置导航栏图标
//        toolbar.setLogo(R.mipmap.ic_launcher);//设置app logo
//        toolbar.setTitle("Title");//设置主标题
//        toolbar.setSubtitle("Subtitle");//设置子标题

//        toolbar.inflateMenu(R.menu.main); //填充右上角菜单
//
        setSupportActionBar(toolbar);

//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                int menuItemId = item.getItemId();
//                if (menuItemId == R.id.action_search) {
//                    Toast.makeText(MainActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();
//
//                } else if (menuItemId == R.id.action_notification) {
//                    Toast.makeText(MainActivity.this, R.string.menu_notifications, Toast.LENGTH_SHORT).show();
//
//                } else if (menuItemId == R.id.action_item1) {
//                    Toast.makeText(MainActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();
//
//                } else if (menuItemId == R.id.action_item2) {
//                    Toast.makeText(MainActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();
//
//                }
//                return true;
//            }
//        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_item1)
            Toast.makeText(MainActivity.this,"item1",Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
