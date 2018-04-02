package com.dwight.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "我是 v 级别的 log 打印");
        // 快速复制粘贴 com + d
        Log.d(TAG, "我是 D 级别的 log 打印");
        Log.i(TAG, "我是 i 级别的 log 打印");
        Log.w(TAG, "我是 w 级别的 log 打印");
        Log.e(TAG, "我是 e 级别的 log 打印");
        Log.v(TAG, "我是 v 级别的 log 打印" + "1==1");
    }
}
