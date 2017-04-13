package com.example.tomato;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingActivity extends Activity {

	private String[] data = {"统计数据","个性音乐","番茄工作法"};
	@Override
	protected void onCreate(Bundle savedInstanceState){
		//创建activity页面，隐藏标题栏
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.setting);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				SettingActivity.this,android.R.layout.simple_list_item_1,data);
		ListView listview = (ListView)findViewById(R.id.list_view);
		listview.setAdapter(adapter);		
	
	}
}
