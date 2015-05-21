package com.example.pulglibrary.view.childview;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CustomImageViewForRelative extends ImageView{

	private LinearLayout.LayoutParams mParams;
	private int mWidth;// 宽度
	private int mHeight;// 长度
	
	public CustomImageViewForRelative(Context context, int width, int height) {
		super(context);
		// TODO Auto-generated constructor stub
		this.mWidth = width;
		this.mHeight = height;
		init();
	}
	
	public void init() {
		mParams = new LinearLayout.LayoutParams(mWidth, mHeight);
		this.setLayoutParams(mParams);
	}
	
}
