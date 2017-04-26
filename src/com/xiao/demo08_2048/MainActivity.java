package com.Tarena.demo08_2048;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //ʵ����WebView��� (��Ҫ������������������ʾ alt+/)
        WebView wv = new WebView(getApplicationContext());
        
        //��������ִ��js
        wv.getSettings().setJavaScriptEnabled(true);
        
        //����ָ������ҳ
        //wv.loadUrl("file:///android_asset/2048/2048.html");
        wv.loadUrl("http://172.163.100.87/chaptor4/zeptoJS/day2/2048/2048.html");
        
        //��wv��Ϊapp��������ͼȥ��ʾ
        setContentView(wv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
