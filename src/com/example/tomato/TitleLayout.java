package com.example.tomato;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

//��̬���ñ�����
public class TitleLayout extends LinearLayout {

	public TitleLayout(Context context,AttributeSet attrs){
		super(context,attrs);
		LayoutInflater.from(context).inflate(R.layout.title,this);		
	}
}
