package com.example.pulglibrary.view.viewgroup;

import android.content.Context;
import android.widget.RelativeLayout;

/**
 * 自定义GroupView(RelativeLayout)
 * 
 * @author: chenjy
 * @create: 2015/5/20
 * 
 */
public class CustomRelativeLayout extends RelativeLayout {

	private RelativeLayout.LayoutParams mParams;
	private int mWidth;// 宽度
	private int mHeight;// 长度
	private boolean mAlignWithParent; //是否处于布局重心点位置
	
	public CustomRelativeLayout(Context context, int width, int height, boolean alignWidthParent) {
		super(context);
		// TODO Auto-generated constructor stub
		this.mWidth = width;
		this.mHeight = height;
		this.mAlignWithParent = alignWidthParent;
	
		init();
	}

	public void init() {
		mParams = new RelativeLayout.LayoutParams(mWidth, mHeight);
		mParams.alignWithParent = mAlignWithParent;
		this.setLayoutParams(mParams);
	}
}
