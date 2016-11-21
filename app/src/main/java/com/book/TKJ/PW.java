package com.book.TKJ;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;
import android.support.v7.widget.*;
import java.util.*;

public class PW extends Fragment
{

	private RecyclerView rv3;
	private Toolbar tb;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View v=inflater.inflate(R.layout.pw,container,false);
		tb=(Toolbar)getActivity().findViewById(R.id.toolbar);
		tb.setTitle("Pemrograman Web");
		rv3=(RecyclerView)v.findViewById(R.id.rv3);
		rv3.setHasFixedSize(true);
		//buat Linear Layout Manager
		LinearLayoutManager llm=new LinearLayoutManager(getActivity());
		llm.setOrientation(LinearLayoutManager.VERTICAL);
		rv3.setLayoutManager(llm);
		
		// ListObject
		List<DataModel2> modelListnya=new ArrayList<DataModel2>();
		DataModel2 dataModel2;
		dataModel2=new DataModel2();
		dataModel2.judul2="Pemrograman Web";
		modelListnya.add(dataModel2);
		
		//Adapter
		RecyclerViewAdapter2 rvAdapter2=new RecyclerViewAdapter2(modelListnya);
		rv3.setAdapter(rvAdapter2);
		
		// TODO: Implement this method
		return v;
	}
	
}
