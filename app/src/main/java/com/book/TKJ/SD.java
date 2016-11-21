package com.book.TKJ;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;
import android.support.v7.widget.*;
import java.util.*;

public class SD extends Fragment
{
	private RecyclerView rv1;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		final View v=inflater.inflate(R.layout.sd,container,false);
		Toolbar tb=(Toolbar)getActivity().findViewById(R.id.toolbar);
		tb.setTitle("Simulasi Digital");
		rv1=(RecyclerView)v.findViewById(R.id.rv2);
		rv1.setHasFixedSize(true);
		LinearLayoutManager llm=new LinearLayoutManager(getActivity());
		llm.setOrientation(LinearLayoutManager.VERTICAL);
		rv1.setLayoutManager(llm);
		// buat listnya
		List<DataModel1> listMateri1=new ArrayList<>();
		DataModel1 dataModel1;
		
		dataModel1 = new DataModel1();
		dataModel1.Judul1="Simulasi 1";
		listMateri1.add(dataModel1);
		
		//Adaptee
		RecyclerViewAdapter1 rvAdapter1=new RecyclerViewAdapter1(listMateri1);
		rv1.setAdapter(rvAdapter1);
		// TODO: Implement this method
		
		return v;
	}
	
}
