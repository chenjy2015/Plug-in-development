package com.example.pulglibrary.view.viewgroup;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * 自定义GroupView(LinearLayout)
 * 
 * @author: chenjy
 * @create: 2015/5/20
 * 
 */
public class CustomLinearLayout extends LinearLayout {

	private LinearLayout.LayoutParams mParams;
	private int mWidth;// 宽度
	private int mHeight;// 长度
	private int mOrientation;// 线性方向

	public CustomLinearLayout(Context context, int width, int height,int orientation) {
		super(context);
		// TODO Auto-generated constructor stub
		this.mWidth = width;
		this.mHeight = height;
		this.mOrientation = orientation;
		init();
	}

	public void init() {
		mParams = new LinearLayout.LayoutParams(mWidth, mHeight);
		this.setLayoutParams(mParams);
		this.setOrientation(mOrientation);
	}

}
