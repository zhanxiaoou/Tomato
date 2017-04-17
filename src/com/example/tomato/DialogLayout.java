package com.example.tomato;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DialogLayout extends Dialog implements android.view.View.OnClickListener{
	
	//"设置监听"
    SettingListener mSListener; 
	//任务编辑框、番茄个数编辑框
    EditText task = (EditText)findViewById(R.id.task);
    EditText number = (EditText)findViewById(R.id.number);
	//番茄时间、休息时间
    RadioGroup tRadioGroup = (RadioGroup)findViewById(R.id.tomatotime);
	RadioButton tomato = (RadioButton)findViewById(tRadioGroup.getCheckedRadioButtonId());
	RadioGroup rRadioGroup = (RadioGroup)findViewById(R.id.resttime);
	RadioButton rest = (RadioButton)findViewById(rRadioGroup.getCheckedRadioButtonId());
	
	public DialogLayout(Context context){
		
		super(context);	
		setContentView(R.layout.dialog);
		
		Button pos = (Button)findViewById(R.id.positive);
		pos.setOnClickListener(this);
		Button neg = (Button)findViewById(R.id.negative);
		neg.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.positive:
				mSListener.onSetting(task.getText().toString(),
										number.getText().toString(),
											tomato.getText().toString(),
												rest.getText().toString());
				
				dismiss();
			case R.id.negative:
				dismiss();
			default:
				break;
		}
		
	}

    public void setOnSettingListener(SettingListener listener) {
    	mSListener = listener;
    }
	


}
