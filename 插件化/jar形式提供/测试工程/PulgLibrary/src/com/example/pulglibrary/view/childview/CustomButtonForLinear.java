package com.example.pulglibrary.view.childview;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * layoutParams 为LinearLayout的Button
 * 
 * @author: chenjy
 * @create: 2015/5/20
 * 
 */
public class CustomButtonForLinear extends Button {

	private LinearLayout.LayoutParams mParams;
	private int mWidth;// 宽度
	private int mHeight;// 长度

	
	
	public CustomButtonForLinear(Context context, int width, int height) {
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
