package com.dwight.smssender;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private EditText et_phoneNum;
    private EditText et_messageCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 获取到界面上的控件 et_phoneNum
        et_phoneNum = (EditText) findViewById(R.id.et_phoneNum);

        // 2. 获取到界面上的控件 et_messageCon
        et_messageCon = (EditText) findViewById(R.id.et_messageCon);

        // 3. 获取到界面上的控件 并且设置点击监听
        Button btSendMessage = (Button) findViewById(R.id.btSendMessage);
        btSendMessage.setOnClickListener(new MySendMessageListener());
    }
    private class MySendMessageListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            final String phoneNumber = et_phoneNum.getText().toString().trim();
            final String message = et_messageCon.getText().toString().trim();

            if ("".equals(phoneNumber) || "".equals(message)) {
                Toast.makeText(MainActivity.this, "phone or message is not blank", Toast.LENGTH_SHORT).show();
                return;
            }
            System.out.println(phoneNumber + ":" + message);
            performCodeWithPermission("发送短信权限", new PermissionCallback() {
                @Override
                public void hasPermission() {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNumber, null, message, null, null);
                }

                @Override
                public void noPermission() {

                }
            }, Manifest.permission.SEND_SMS);
        }
    }
}
