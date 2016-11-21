package com.book.TKJ;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;

public class RecyclerViewAdapter extends RecyclerView.Adapter<DataModelViewHolder>
{

	private List<DataModel> listMateri;
	public RecyclerViewAdapter(List<DataModel> listMateri){
		this.listMateri=listMateri;
	}
	@Override
	public DataModelViewHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		View itemView=LayoutInflater.from(p1.getContext()).inflate(R.layout.adapter_rv,p1,false);
		
		// TODO: Implement this method
		return new DataModelViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(DataModelViewHolder p1, int p2)
	{
		DataModel modelListnya=listMateri.get(p2);
		p1.vJudul.setText(modelListnya.Judul);
		// TODO: Implement this method
	}

	@Override
	public int getItemCount()
	{
		// TODO: Implement this method
		return listMateri.size();
	}
	
}
