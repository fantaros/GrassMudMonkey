package com.fantaros.android.app.gmh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private WebView web = null;
	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gmh);
		web = (WebView)findViewById(R.id.gmh);
		WebSettings settings = web.getSettings();
		settings.setJavaScriptEnabled(true);
		web.loadUrl("file:///android_asset/grassmudmonkey.html");
	}

}
