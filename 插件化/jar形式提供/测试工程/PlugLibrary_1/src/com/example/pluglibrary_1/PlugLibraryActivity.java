package com.example.pluglibrary_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pluglibrary_1.utils.IDUtils;

public class PlugLibraryActivity extends Activity {

	private View view;
	private Button btn;
	private TextView tv;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//初始化View
		int layoutId = IDUtils.getLayoutId(this, "activity_library");
		view = LayoutInflater.from(this).inflate(layoutId, null);
		setContentView(view);
		
		//初始化控件
		int btnId = IDUtils.getId(this, "btn"); 
		btn = (Button) findViewById(btnId);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv.setText("this button is clicked!");
			}
		});
		int textId = IDUtils.getId(this, "tv");
		tv = (TextView) findViewById(textId);
	}

}
