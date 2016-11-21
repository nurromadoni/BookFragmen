package com.book.TKJ;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<DataModelViewHolder2>
{
	private List<DataModel2> listMateri3;

	public List<DataModel2> contactList;
	public RecyclerViewAdapter2(List<DataModel2> listMateri3){
		this.listMateri3=listMateri3;
	}
	@Override
	public DataModelViewHolder2 onCreateViewHolder(ViewGroup p1, int p2)
	{
		View v=LayoutInflater.from(p1.getContext()).inflate(R.layout.adapter_rv2,p1,false);
		// TODO: Implement this method
		return new DataModelViewHolder2(v);
	}

	@Override
	public void onBindViewHolder(DataModelViewHolder2 p1, int p2)
	{
		DataModel2 modelListnya3=listMateri3.get(p2);
		p1.vJudul2.setText(modelListnya3.judul2);
		// TODO: Implement this method
	}

	@Override
	public int getItemCount()
	{
		// TODO: Implement this method
		return listMateri3.size();
	}
	
}
