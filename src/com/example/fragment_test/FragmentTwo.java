package com.example.fragment_test;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTwo extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.fragment_two, container, false);
		Button b = (Button)v.findViewById(R.id.showThree);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				FragmentThree frag = new FragmentThree();
				FragmentTransaction tran = getFragmentManager().beginTransaction();
				tran.replace(R.id.fragment_container, frag);
				tran.addToBackStack(null);
				tran.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
				tran.commit();
			}
		});
		return v;
	}
}
