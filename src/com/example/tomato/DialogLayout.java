package com.example.tomato;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DialogLayout extends Dialog {
	
	Context context;
	
	public DialogLayout(Context context){
		super(context);
		this.context = context;
	}

	public DialogLayout(Context context,int theme){
		super(context,theme);
		this.context = context;
	}

	protected void onCreate(Bundle savedInstanceState){
		//创建activity页面，隐藏标题栏
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog);
		
		TextView task = (TextView)findViewById(R.id.task);
		TextView number = (TextView)findViewById(R.id.number);
		Button pos = (Button)findViewById(R.id.positive);	
		Button neg = (Button)findViewById(R.id.negative);
		neg.setOnClickListener(
				new DialogInterface.OnClickListener(){
				    @Override
				    public void onClick(DialogInterface dialog, int which) {
				        // TODO Auto-generated method stub
				    }
				});
	}

}
