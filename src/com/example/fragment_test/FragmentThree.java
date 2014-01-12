package com.example.fragment_test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentThree extends Fragment {
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View v = inflater.inflate(R.layout.fragment_three, container, false);
	
	Button b = (Button)v.findViewById(R.id.popTheStack);
	b.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			FragmentThree.this.getFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
		}
	});
	return v;
}
}
