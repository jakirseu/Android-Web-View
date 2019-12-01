/*
 * Simple Web View code for tutorial, written by Jakir Hossain. 
 * 
 */
package me.jakir.webview;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	 
	private WebView webView;		
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	 
		webView = (WebView) findViewById(R.id.myWebView);
		webView.loadUrl("https://jakir.me");
		webView.setWebViewClient(new WebViewClient()); 

	}
}
