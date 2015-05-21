package com.example.pulglibrary.helper;

import java.io.IOException;
import java.io.InputStream;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.pulglibrary.view.childview.CustomButtonForLinear;
import com.example.pulglibrary.view.childview.CustomButtonForRelative;
import com.example.pulglibrary.view.viewgroup.CustomLinearLayout;
import com.example.pulglibrary.view.viewgroup.CustomRelativeLayout;

/**
 * 获取assets下的资源文件
 * @author: chenjy
 * @create: 2015/5/20
 * 
 */
public class ResourceHelper implements Resource {

	private Context mContext;
	private AssetManager mAssetManager;

	public ResourceHelper(Context context) {
		this.mContext = context;
		mAssetManager = mContext.getAssets();
	}

//	/**
//	 * 得到一个Button
//	 * 
//	 * @param context
//	 * @param buttonType
//	 *            获取Button的LayoutParams类型 1：LinearLayout 2.RelativeLayout
//	 * @param params
//	 * @return
//	 */
//	public Button getButton(Context context, String buttonType, int width, int height) {
//		Button button = null;
//		if (buttonType.equals("CustomButtonForLinear")) {
//			button = getCustomButtonForLinear(context, width, height);
//		} else if (buttonType.equals("CustomButtonForRelative")) {
//			button = getCustomButtonForRelative(context, width, height);
//		}
//		return button;
//	}
//
//	/**
//	 * 得到一个viewgroup
//	 * 
//	 * @param context
//	 * @param layoutType
//	 *            获取layout类型 1：LinearLayout 2.RelativeLayout
//	 * @param alignWidthParent
//	 *            在获取相对布局的Button 指定是否在布局中心位置
//	 * @param orientation
//	 *            在获取线性布局时 指定方向
//	 * @return
//	 */
//	public ViewGroup getGroupView(Context context, String layoutType,
//			boolean alignWidthParent, int orientation, int width, int height) {
//		ViewGroup viewGroup = null;
//		if (layoutType.equals("LinearLayout")) {
//			viewGroup = getLinearLayout(context, width, height, orientation);
//		} else {
//			viewGroup = getRelativeLayout(context, width, height,alignWidthParent);
//		}
//		return viewGroup;
//	}
//
//	
//	
//	/**
//	 * 获取LinearLayout
//	 */
//	public LinearLayout getLinearLayout(Context context, int width, int height,int orientation) {
//		CustomLinearLayout layout = null;
//		layout = new CustomLinearLayout(context, width, height,orientation);
//		return layout;
//	}
//	
//	
//	
//	
//
//	/**
//	 * 获取RelativeLayout
//	 */
//	public RelativeLayout getRelativeLayout(Context context, int width,
//			int height, boolean alignWidthParent) {
//		CustomRelativeLayout layout = null;
//		layout = new CustomRelativeLayout(context, width, height,alignWidthParent);
//		return layout;
//	}
//
//	
//	
//	
//	/**
//	 * 获取Button LayoutParams Linearlayout
//	 */
//	@Override
//	public CustomButtonForLinear getCustomButtonForLinear(Context context,
//			int width, int height) {
//		// TODO Auto-generated method stub
//		CustomButtonForLinear button = new CustomButtonForLinear(context,width, height);
//		return button;
//	}
//
//	
//	
//	
//	/**
//	 * 获取Button LayoutParams RelativeLayout
//	 */
//	@Override
//	public CustomButtonForRelative getCustomButtonForRelative(Context context,
//			int width, int height) {
//		// TODO Auto-generated method stub
//		CustomButtonForRelative button = new CustomButtonForRelative(context,width, height);
//		return button;
//	}
//	
//	
	
	
	@Override
	public Bitmap getBitmap(String filePath, String name) {
		// TODO Auto-generated method stub
		Bitmap bm = null;
		InputStream is = null;
		try {
			is = mAssetManager.open(filePath +"/"+ name);
			bm = BitmapFactory.decodeStream(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bm;
	}

}
