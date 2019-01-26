package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        WebView noticeview =(WebView) findViewById(R.id.webView);
        noticeview.setWebViewClient(new WebViewClient());
        noticeview.getSettings().setBuiltInZoomControls(true);
        noticeview.loadUrl("http://hamdarduniversity.edu.bd/content.php?Page=notice");

    }
}
