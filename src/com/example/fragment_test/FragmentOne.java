package com.example.fragment_test;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_one, container, false);
		Button next = (Button)v.findViewById(R.id.fragmentOneNext);
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Fragment two = new FragmentTwo();
				FragmentTransaction tran = getFragmentManager().beginTransaction();
				tran.add(R.id.fragment_container, two);
				tran.addToBackStack(null);
				tran.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
				tran.commit();
			}
		});
		return v;
	}
}
