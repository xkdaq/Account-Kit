package com.account.kit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;


public class PrivacyActivity extends AppCompatActivity implements View.OnClickListener {

    WebView webviewPrivacy;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_privacy);

        webviewPrivacy = findViewById(R.id.webview_privacy);

        findViewById(R.id.center_login_back).setOnClickListener(this);

        initData();
    }

    protected void initData() {
        String url = "file:///android_asset/privacy.html";
        webviewPrivacy.loadUrl(url);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.center_login_back) {
            finish();
        }
    }
}
