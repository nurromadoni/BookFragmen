package com.book.TKJ;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<DataModelViewHolder1>
{

	private List<DataModel1> listMateri1;
	public RecyclerViewAdapter1(List<DataModel1> listMateri1){
		this.listMateri1=listMateri1;
	}
	@Override
	public DataModelViewHolder1 onCreateViewHolder(ViewGroup p1, int p2)
	{
		View i=LayoutInflater.from(p1.getContext()).inflate(R.layout.adapter_rv1,p1,false);
		// TODO: Implement this method
		return new DataModelViewHolder1(i);
	}

	@Override
	public void onBindViewHolder(DataModelViewHolder1 holder, int p2)
	{

		DataModel1 modelListnya=listMateri1.get(p2);
		holder.vJudul1.setText(modelListnya.Judul1);
		// TODO: Implement this method
	}

	@Override
	public int getItemCount()
	{
		// TODO: Implement this method
		return listMateri1.size();
	}
	
}
