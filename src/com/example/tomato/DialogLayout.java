package com.example.tomato;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DialogLayout extends Dialog implements android.view.View.OnClickListener{
	
    private SettingListener mSListener; 

	
    int mOp;
	public DialogLayout(Context context, int op){		
		super(context);	
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog);	
		
		//"设置监听"
		Button pos = (Button)findViewById(R.id.positive);
		pos.setOnClickListener(this);
		Button neg = (Button)findViewById(R.id.negative);
		neg.setOnClickListener(this);
		
		mOp = op;
	}
	


	@Override
	public void onClick(View v) {
		

				
		//任务编辑框、番茄个数编辑框
	    EditText task = (EditText)findViewById(R.id.task);
	    EditText number = (EditText)findViewById(R.id.number);
		//番茄时间、休息时间
	    RadioGroup tRadioGroup = (RadioGroup)findViewById(R.id.tomatotime);
		RadioButton tomato = (RadioButton)findViewById(tRadioGroup.getCheckedRadioButtonId());
		RadioGroup rRadioGroup = (RadioGroup)findViewById(R.id.resttime);
		RadioButton rest = (RadioButton)findViewById(rRadioGroup.getCheckedRadioButtonId());
		
		Button b = (Button) v;		
		
		switch(b.getId()){
			case R.id.positive:
				switch(mOp){
				case 0:mSListener.onAdd(("任务："+task.getText().toString()),
												("番茄个数："+number.getText().toString()),
													("番茄时间："+tomato.getText().toString()),
														("休息时间："+rest.getText().toString()));
				case 1:mSListener.onUpdate(("任务："+task.getText().toString()),
												("番茄个数："+number.getText().toString()),
														("番茄时间："+tomato.getText().toString()),
															("休息时间："+rest.getText().toString()));
				default:
					break;
				}
				
					

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
