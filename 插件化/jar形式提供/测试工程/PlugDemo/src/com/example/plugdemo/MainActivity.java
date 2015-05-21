package com.example.plugdemo;


import com.example.plugdemo.config.Config;
import com.example.pulglibrary.LibraryActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private  Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = (Button) findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(getApplicationContext(), LibraryActivity.class);
				startActivityForResult(intent, Config.REQUEST_CODE_ACTIVITY_MAIN);
			}
		});
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	String str = data.getStringExtra("result");
    	switch (resultCode) {
		case Config.RESULT_CODE_ACTIVITY_LIBRARY:
			Toast.makeText(getApplicationContext(), "library返回信息为 : \t "+ str, Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
    }

    
}
