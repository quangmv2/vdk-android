package com.example.vdk_kl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    private lateinit var webView1: WebView;
    private lateinit var webView2: WebView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView1 = findViewById(R.id.wwnt);
        webView2 = findViewById(R.id.wwda);
        webView1.loadUrl("https://thingspeak.com/channels/1083865/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=column");
        webView2.loadUrl("https://thingspeak.com/channels/1083865/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=column");
    }
}