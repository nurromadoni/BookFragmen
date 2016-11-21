package com.book.TKJ;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.*;

public class DataModelViewHolder extends RecyclerView.ViewHolder
{
	TextView vJudul;
	public DataModelViewHolder (View v){
		super(v);
		vJudul=(TextView)v.findViewById(R.id.judul1);
		
	}
}
