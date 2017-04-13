package com.example.tomato;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingActivity extends Activity {

	private String[] data = {"ͳ������","��������","���ѹ�����"};
	@Override
	protected void onCreate(Bundle savedInstanceState){
		//����activityҳ�棬���ر�����
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.setting);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				SettingActivity.this,android.R.layout.simple_list_item_1,data);
		ListView listview = (ListView)findViewById(R.id.list_view);
		listview.setAdapter(adapter);		
	
	}
}
