package com.example.tomato;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TaskAdapter extends ArrayAdapter<Task> {
	private int resourceId;
	
	public TaskAdapter(Context context,int textViewResourceId,
			List<Task> objects){
		super(context,textViewResourceId,objects);
		resourceId = textViewResourceId;
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
		Task task = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		
	    TextView item_task_name = (TextView)view.findViewById(R.id.item_task_name);
	    item_task_name.setText(task.gettName());
	    
	    TextView item_tomato_number = (TextView)view.findViewById(R.id.item_tomato_number);
	    item_tomato_number.setText(task.gettNumber());
	    
	    TextView item_tomato_time = (TextView)view.findViewById(R.id.item_tomato_time);
	    item_tomato_time.setText(task.gettTomato());
	    
	    TextView item_rest_time = (TextView)view.findViewById(R.id.item_rest_time);
	    item_rest_time.setText(task.gettRest());
		return view;
		
	}
}	
