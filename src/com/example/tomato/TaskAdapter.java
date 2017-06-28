package com.example.tomato;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class TaskAdapter extends ArrayAdapter<Task> {
	
	private int resourceId;
	

	
	public TaskAdapter(Context context,int textViewResourceId,
			List<Task> objects){
		super(context,textViewResourceId,objects);
		resourceId = textViewResourceId;
		
	}
	
	public View getView(final int position, View convertView, ViewGroup parent){
		final Task task = getItem(position);
		View view;
		ViewHolder viewHolder;
		if(convertView == null){
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			
			viewHolder.item_task_name = (TextView)view.findViewById(R.id.item_task_name);
			viewHolder.item_tomato_number = (TextView)view.findViewById(R.id.item_tomato_number);
			viewHolder.item_tomato_time = (TextView)view.findViewById(R.id.item_tomato_time);
			viewHolder.item_rest_time = (TextView)view.findViewById(R.id.item_rest_time);
			viewHolder.item_task_begin = (Button)view.findViewById(R.id.item_task_begin);
			viewHolder.item_task_update = (Button)view.findViewById(R.id.item_task_update);
			viewHolder.item_task_delete = (Button)view.findViewById(R.id.item_task_delete);
			
			view.setTag(viewHolder);
		}
		else {
			view = convertView;
			viewHolder = (ViewHolder)view.getTag();
		}
		
	    
		viewHolder.item_task_name.setText(task.gettName());	    	    
		viewHolder.item_tomato_number.setText(task.gettNumber());	    	    
		viewHolder.item_tomato_time.setText(task.gettTomato());	    	    
		viewHolder.item_rest_time.setText(task.gettRest());								

		
		
		return view;
		
	}
	
	class ViewHolder{		
		TextView item_task_name;
		TextView item_tomato_number;
		TextView item_tomato_time;
		TextView item_rest_time;
		Button item_task_begin;
		Button item_task_update;
		Button item_task_delete;
	}




}	
