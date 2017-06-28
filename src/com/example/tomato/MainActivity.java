package com.example.tomato;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements SettingListener{
	
	private List<Task> taskList = new ArrayList<Task>();
	@Override
	protected void onCreate(Bundle savedInstanceState){
		//创建activity页面，隐藏标题栏
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		
		
		TaskAdapter adapter = new TaskAdapter(MainActivity.this,R.layout.item_task,taskList);
		ListView listView = (ListView)findViewById(R.id.main_list_view);
		listView.setAdapter(adapter);
		/*listView.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?>parent, View view, int position, long id){				

			}
		});*/
		
		Button setting = (Button)findViewById(R.id.title_setting);
		Button add = (Button)findViewById(R.id.title_add);
		Button update = (Button)findViewById(R.id.item_task_update);

	
		//对按钮设置监听器,设置按钮
		setting.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(MainActivity.this,SettingActivity.class);
				startActivity(intent);
			}
		});
		
		//对按钮设置监听器,任务按钮，实现任务添加，此处用到回调方法，onSetting()是MainActivity的回调方法
		add.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				DialogLayout dialog = new DialogLayout(MainActivity.this,0);
				dialog.setOnSettingListener(MainActivity.this);
				dialog.show();
			}
		});
		
		update.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				DialogLayout dialog = new DialogLayout(MainActivity.this,1);
				dialog.setOnSettingListener(MainActivity.this);
				dialog.show();
				
			}
			
		});

		
		
	}



	@Override
	public void onAdd(String s1, String s2, String s3, String s4) {
		Task t = new Task(s1,s2,s3,s4);
		taskList.add(t);

		
	}



	@Override
	public void onUpdate(String s1, String s2, String s3, String s4) {
		for(int i=0;i<taskList.size();i++){
			if(taskList.get(i).gettName()==s1){
				Task t = new Task(s1,s2,s3,s4);
				taskList.set(i, t);
			}			
		}
	}






	

	
}
