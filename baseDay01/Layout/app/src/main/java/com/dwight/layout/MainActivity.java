package com.dwight.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Android Studio 2.2 以前
 * 安卓5大布局
 * 1. 线性布局 LinearLayout
 * 2. 相对布局 RelativeLayout
 * 3. 帧布局 FrameLayout
 * 4. 表格布局 TableLayout
 * 5. 绝对布局 AbsoluteLayout (2.2以后已废弃)
 *
 * Android Studio 2.3 开始
 * 6. 约束布局 ContstraintLayout
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
    }
}
