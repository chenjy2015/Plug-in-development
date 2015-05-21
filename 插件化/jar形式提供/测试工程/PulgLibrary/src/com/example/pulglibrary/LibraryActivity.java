package com.example.pulglibrary;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.pulglibrary.config.Config;
import com.example.pulglibrary.helper.ResourceHelper;
import com.example.pulglibrary.helper.ResourceIdHelper;
import com.example.pulglibrary.view.childview.CustomButtonForLinear;
import com.example.pulglibrary.view.childview.CustomImageViewForLinear;
import com.example.pulglibrary.view.viewgroup.CustomLinearLayout;

/**
 * 测试工程 主界面
 * @author Administrator
 *
 */
public class LibraryActivity extends Activity implements View.OnClickListener{

	private ResourceHelper mResHelper;
	private LinearLayout layout;
	private Button btn;
	private Button btn_finish;
	private ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mResHelper = new ResourceHelper(LibraryActivity.this);
		initView();
		setContentView(layout);
		btn.setOnClickListener(this);
		btn_finish.setOnClickListener(this);
		
		/*setContentView(R.layout.activity_library);
		btn = (Button) findViewById(R.id.btn);
		iv = (ImageView) findViewById(R.id.iv);
		btn.setOnClickListener(this);
		Bitmap bm = mResHelper.getBitmap("drawable", "panda.jpg");
		if(bm != null){
			iv.setImageBitmap(bm);
		}*/
	}

	private void initView() {
		layout = new CustomLinearLayout(this, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.VERTICAL);
		btn = new CustomButtonForLinear(this, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		btn.setId(ResourceIdHelper.BUTTON_ID01);
		btn.setText("button");
		btn_finish = new CustomButtonForLinear(this, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		btn_finish.setId(ResourceIdHelper.BUTTON_ID02);
		btn_finish.setText("finish");
		iv = new CustomImageViewForLinear(this, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		Bitmap bm = mResHelper.getBitmap("drawable", "panda.jpg");
		if(bm != null){
			iv.setImageBitmap(bm);
		}else{
			iv.setImageResource(R.drawable.ic_launcher);
		}
		layout.addView(btn);
		layout.addView(btn_finish);
		layout.addView(iv);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case ResourceIdHelper.BUTTON_ID01://固定ID值
			Toast.makeText(getApplicationContext(), "你点击了Button", Toast.LENGTH_SHORT).show();
			//showDialog();
			Intent intentActivity = new Intent();
			intentActivity.setClass(getApplicationContext(), SecondActivity.class);
			startActivity(intentActivity);
			break;

		/*case R.id.btn:
			Toast.makeText(getApplicationContext(), "你点击了Button", Toast.LENGTH_SHORT).show();
			showDialog();
			break;*/
			
		case ResourceIdHelper.BUTTON_ID02:
			Intent intent = new Intent();
			intent.putExtra("result", "这是来自libraryActivity返回的信息 您已经成功调用本Activity！");
			setResult(Config.RESULT_CODE_ACTIVITY_LIBRARY, intent);
			finish();
			break;
		}
		
	}

	public void showDialog(){
		AlertDialog dialog = new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("jar包中代码调用本地Dialog")
		 .setPositiveButton("确定", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "你点击了确定", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
			}
		}).setNegativeButton("取消", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "你点击了取消", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
			}
		}).create();
		dialog.show();
		
	}
	
}
