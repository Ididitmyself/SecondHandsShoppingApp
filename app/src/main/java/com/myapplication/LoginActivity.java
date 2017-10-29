package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editText2;
    private EditText editText3;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText2 = (EditText) findViewById(R.id.editText2);//得到输入框
        editText3 = (EditText) findViewById(R.id.editText3);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String username = editText2.getText().toString();//得到输入内容
                String password = editText3.getText().toString();

                if (username == null || username.equals("")) {
                    Toast.makeText(getApplicationContext(), "账号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password == null || password.equals("")) {
                    Toast.makeText(getApplicationContext(), "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (username.equals("admin") && password.equals("admin")) {
                    Toast.makeText(getApplicationContext(), "登陆成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "账号或密码错误", Toast.LENGTH_SHORT).show();
                }
                //  初始化一个准备跳转到TeacherDetailActivity的Intent
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                // 准备跳转
                LoginActivity.this.startActivity(intent);
            }
        });
    }
}
