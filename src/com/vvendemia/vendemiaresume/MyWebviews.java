package com.vvendemia.vendemiaresume;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract.Constants;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MyWebviews extends Activity {

	private final String FACEBOOK_URL = "https://www.mobileappdevelopersclub.com";
	private String MAGAZI = "http://magazi-ag.com/#!/";
	WebView mWebView;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		
		Bundle b = getIntent().getBundleExtra("bundle");
		getActionBar().setTitle("Vinnie Vendemia's Resume");
		
		mWebView = (WebView) findViewById(R.id.my_webview);
		
		if(b == null) {
		mWebView.loadUrl(FACEBOOK_URL);
		} else {
			mWebView.loadUrl(MAGAZI);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == android.R.id.home) {
			onBackPressed();
		}

		return super.onOptionsItemSelected(item);
	}

}

