package com.example.pulglibrary.helper;

import com.example.pulglibrary.view.childview.CustomButtonForLinear;
import com.example.pulglibrary.view.childview.CustomButtonForRelative;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public interface Resource {

//	/**
//	 * 获取自定义LinearLayout
//	 * @param context          Activity.this
//	 * @param width            宽度
//	 * @param height           长度
//	 * @param gravity          内容重心
//	 * @param margin           外边距
//	 * @param padding          内边距
//	 * @return
//	 */
//	public LinearLayout getLinearLayout(Context context, int width, int height, int orientation);
//	
//	
//	/**
//	 * 获取自定义RelativeLayout
//	 * @param context          Activity.this
//	 * @param width            宽度
//	 * @param height           长度
//	 * @param gravity          内容重心
//	 * @param margin           外边距
//	 * @param padding          内边距
//	 * @return  CustomRelativeLayout
//	 */
//	public RelativeLayout getRelativeLayout(Context context, int width, int height,boolean alignWidthParent);
//	
//	
//	
//	/**
//	 * 获取自定义Button  
//	 * LayoutParams : LinearLayout
//	 * @param context          Activity.this
//	 * @param width            宽度
//	 * @param height           长度
//	 * @param layout_gravity   布局重心
//	 * @param gravity          内容重心
//	 * @param margin           外边距
//	 * @param padding          内边距
//	 */
//	public CustomButtonForLinear getCustomButtonForLinear(Context context, int width, int height);
//	
//	/**
//	 * 获取自定义Button  
//	 * LayoutParams : RelativeLayout
//	 * @param context          Activity.this
//	 * @param width            宽度
//	 * @param height           长度
//	 * @param gravity          内容重心
//	 * @param margin           外边距
//	 * @param padding          内边距
//	 */
//	public CustomButtonForRelative getCustomButtonForRelative(Context context, int width, int height);
	
	/**
	 * 获取 assets 下的资源图片
	 * @param filePath
	 * @param name
	 * @return
	 */
	public Bitmap getBitmap(String filePath,String name);
}
