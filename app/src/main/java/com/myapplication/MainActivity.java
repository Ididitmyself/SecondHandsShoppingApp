package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";//很重要，在 MainActivity.java 中，添加 EXTRA_MESSAGE 常量和 sendMessage() 代码
    private MenuItem menuItem = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 通过hilde()和show()方法可以控制actionbar的隐藏和显示
        // ActionBar actionBar = getActionBar();
        // actionBar.hide();
        // actionBar.show();
    }

    // 我们可以看到，actonbar的用法跟选项菜单是一样的
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                Toast.makeText(this, "Menu Item refresh selected",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_about:
                Toast.makeText(this, "Menu Item about selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_edit:
                Toast.makeText(this, "Menu Item edit selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_search:
                Toast.makeText(this, "Menu Item search selected",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_help:
                Toast.makeText(this, "Menu Item  settings selected",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public void sendMessage(View view){
        Intent intent=new Intent(MainActivity.this, DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.editText);
        String message =editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
