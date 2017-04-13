package com.example.tomato;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

public class DialogLayout extends AlertDialog {
	
	public DialogLayout(Context context){
		super(context);
	}

	public DialogLayout(Context context,int theme){
		super(context,theme);
	}

	//获取任务名称和番茄个数
	TextView task = (TextView)findViewById(R.id.task);
	TextView number = (TextView)findViewById(R.id.number);

	
	Button positive = (Button)findViewById(R.id.positive);	
	Button negative = (Button)findViewById(R.id.negative);


}
