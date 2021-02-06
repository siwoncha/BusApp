package com.example.fxck937;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends Activity {
    // 만촌네거리 버스 정보를 알기 위해 만드는 버스 정보 앱
    // 액티비티 임포트, 온크레이트 메소드에 thread 생성. 버스정보를 받아올 url을 파싱해서 정보를 뽑아오기 위해 만드는 thread
    //thread를 사용하는 이유
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Thread() {
            public void run() {
                URL url = new URL("http://businfo.daegu.go.kr/ba/arrbus/arrbus.do");
                HttpURLConnection
            }
        }.start();
    }
}