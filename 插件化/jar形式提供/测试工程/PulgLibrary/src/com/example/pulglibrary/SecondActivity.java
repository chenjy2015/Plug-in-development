package com.example.pulglibrary;

import com.example.pulglibrary.helper.ResourceIdHelper;
import com.example.pulglibrary.view.childview.CustomButtonForRelative;
import com.example.pulglibrary.view.viewgroup.CustomRelativeLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;

/**
 * 采用自定义RelativeLayout实现复杂布局
 * @author Administrator
 *
 */
public class SecondActivity extends Activity implements OnItemClickListener{

	private RelativeLayout layout; //根布局
	private ListView mListView;
	private CustomButtonForRelative leftTop,rightTop,leftBottom,rightBottom;
	private String[] arr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initView();
		initData();
		setContentView(layout);
		
	}
	
	private void initData(){
		arr = new String[30];
		for(int i=0; i<30; i++){
			arr[i] = "item"+i;
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, arr);
		mListView.setAdapter(adapter);
	}
	
	public void initView(){
		layout = new CustomRelativeLayout(SecondActivity.this, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT, true);
		layout.setId(ResourceIdHelper.LAYOUT_SECOND);
		mListView = new ListView(SecondActivity.this);
		mListView.setId(ResourceIdHelper.LISTVIEW_SECOND);
		mListView.setOnItemClickListener(this);
		leftTop = new CustomButtonForRelative(SecondActivity.this, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		leftTop.setId(ResourceIdHelper.BUTTON_SECOND_LEFTTOP);
		leftTop.setText("leftTop");
		rightTop = new CustomButtonForRelative(SecondActivity.this, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		rightTop.setId(ResourceIdHelper.BUTTON_SECOND_RIGHTTOP);
		rightTop.setText("rightTop");
		leftBottom = new CustomButtonForRelative(SecondActivity.this, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		leftBottom.setId(ResourceIdHelper.BUTTON_SECOND_LEFTBOTTOM);
		leftBottom.setText("leftBottom");
		rightBottom = new CustomButtonForRelative(SecondActivity.this, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		rightBottom.setId(ResourceIdHelper.BUTTON_SECOND_RIGHTBOTTOM);
		rightBottom.setText("rightBottom");
		
		//设置左上角Button
		RelativeLayout.LayoutParams params1 = (LayoutParams) leftTop.getLayoutParams();
		params1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		//设置右上角Button
		RelativeLayout.LayoutParams params2 = (LayoutParams) rightTop.getLayoutParams();
		params2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		//设置左下角Button
		RelativeLayout.LayoutParams params3 = (LayoutParams) leftBottom.getLayoutParams();
		params3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		params3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		//设置右下角Button
		RelativeLayout.LayoutParams params4 = (LayoutParams) rightBottom.getLayoutParams();
		params4.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		params4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		//设置中间的ListView
		RelativeLayout.LayoutParams paramsListView = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
		paramsListView.addRule(RelativeLayout.CENTER_IN_PARENT);
		paramsListView.addRule(RelativeLayout.BELOW, ResourceIdHelper.BUTTON_SECOND_LEFTTOP);//在左上角下面
		paramsListView.addRule(RelativeLayout.ABOVE, ResourceIdHelper.BUTTON_SECOND_LEFTBOTTOM);//在左下角上面
		mListView.setLayoutParams(paramsListView);
		
		//添加子View
		layout.addView(leftTop);
		layout.addView(rightTop);
		layout.addView(leftBottom);
		layout.addView(rightBottom);
		layout.addView(mListView);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), arr[position], Toast.LENGTH_SHORT).show();
	}
	
}
