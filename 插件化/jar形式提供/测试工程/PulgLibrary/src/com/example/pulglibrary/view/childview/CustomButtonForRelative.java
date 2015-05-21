package com.example.pulglibrary.view.childview;

import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * layoutParams 为RelativeLayout的Button
 * 
 * @author: chenjy
 * @create: 2015/5/20
 * 
 */
public class CustomButtonForRelative extends Button {

	private RelativeLayout.LayoutParams mParams;
	private int mWidth;// 宽度
	private int mHeight;// 长度
	
	public CustomButtonForRelative(Context context, int width, int height) {
		super(context);
		// TODO Auto-generated constructor stub
		this.mWidth = width;
		this.mHeight = height;
		init();
	}
	
	public void init() {
		mParams = new RelativeLayout.LayoutParams(mWidth, mHeight);
		this.setLayoutParams(mParams);
		
	}

}
