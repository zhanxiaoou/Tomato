package com.example.tomato;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class UpdateDialogLayout extends Dialog implements android.view.View.OnClickListener{
	
    private UpdateListener uListener; 
	
	public UpdateDialogLayout(Context context){		
		super(context);	
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog);	
		
		//"���ü���"
		Button pos = (Button)findViewById(R.id.positive);
		pos.setOnClickListener(this);
		Button neg = (Button)findViewById(R.id.negative);
		neg.setOnClickListener(this);
	}
	
	public UpdateDialogLayout(Context context, int theme){
		super(context, theme);
	} 

	@Override
	public void onClick(View v) {
		

				
		//����༭�򡢷��Ѹ����༭��
	    EditText task = (EditText)findViewById(R.id.task);
	    EditText number = (EditText)findViewById(R.id.number);
		//����ʱ�䡢��Ϣʱ��
	    RadioGroup tRadioGroup = (RadioGroup)findViewById(R.id.tomatotime);
		RadioButton tomato = (RadioButton)findViewById(tRadioGroup.getCheckedRadioButtonId());
		RadioGroup rRadioGroup = (RadioGroup)findViewById(R.id.resttime);
		RadioButton rest = (RadioButton)findViewById(rRadioGroup.getCheckedRadioButtonId());
		
		Button b = (Button) v;		
		
		switch(b.getId()){
			case R.id.positive:
				uListener.onUpdate(("����"+task.getText().toString()),
										("���Ѹ�����"+number.getText().toString()),
											("����ʱ�䣺"+tomato.getText().toString()),
												("��Ϣʱ�䣺"+rest.getText().toString()));
					

				dismiss();
			case R.id.negative:
				dismiss();
			default:
				break;
		}
		
	}

    public void setOnUpdateListener(UpdateListener listener) {
    	uListener = listener;
    }
	


}
