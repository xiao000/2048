package com.Tarena.demo08_2048;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //实例化WebView组件 (需要引入依赖包和智能提示 alt+/)
        WebView wv = new WebView(getApplicationContext());
        
        //设置允许执行js
        wv.getSettings().setJavaScriptEnabled(true);
        
        //载入指定的网页
        //wv.loadUrl("file:///android_asset/2048/2048.html");
        wv.loadUrl("http://172.163.100.87/chaptor4/zeptoJS/day2/2048/2048.html");
        
        //将wv作为app的内容视图去显示
        setContentView(wv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
