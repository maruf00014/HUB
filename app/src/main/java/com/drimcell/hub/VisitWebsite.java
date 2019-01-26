package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Maruf on 19-Aug-17.
 */

public class VisitWebsite extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        WebView view =(WebView) findViewById(R.id.webView);
        view.setWebViewClient(new WebViewClient());
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl("http://hamdarduniversity.edu.bd/");

    }
}
