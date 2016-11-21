package com.book.TKJ;
import android.support.v7.app.*;
import android.os.*;
import com.book.TKJ.*;
import android.support.v4.app.*;
import android.view.*;
import android.support.v7.widget.*;
import java.util.*;
import android.content.*;

public class JD extends Fragment
{
	private RecyclerView rv;
	private Toolbar tb;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		
		final View v=inflater.inflate(R.layout.jd,container,false);
		
		tb=(Toolbar)getActivity().findViewById(R.id.toolbar);
	
		tb.setTitle("Jaringan Dasar");
		//set Custom Theme
		
		//RecyyclerView
		rv=(RecyclerView)v.findViewById(R.id.rv1);
		rv.setHasFixedSize(true);
		LinearLayoutManager llm=new LinearLayoutManager(getActivity());
		llm.setOrientation(LinearLayoutManager.VERTICAL);
		rv.setLayoutManager(llm);
		//buat Objek ArrayList
		List<DataModel> listMateri=new ArrayList<DataModel>();
		DataModel dataModel;
		//Item RV
		dataModel=new DataModel();
		dataModel.Judul="Jaringan 1";
		listMateri.add(dataModel);
		
		RecyclerViewAdapter rvAdapter=new RecyclerViewAdapter(listMateri);
		rv.setAdapter(rvAdapter);
		return v;
	}
	
}
