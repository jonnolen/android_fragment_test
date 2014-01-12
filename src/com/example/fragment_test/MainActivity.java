package com.example.fragment_test;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	ViewPager pager;
	FragmentPagerAdapter adapter;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b = (Button)findViewById(R.id.show_fragment_btn);
        
//        b.setOnClickListener(new View.OnClickListener() {			
//			@Override
//			public void onClick(View v) {				
//				FragmentTransaction tran = MainActivity.this.getFragmentManager().beginTransaction();
//				tran.replace(R.id.fragment_container, new FragmentOne());
//				tran.addToBackStack(null);
//				tran.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//				tran.commit();
//			}
//		});
        
        adapter = new FragmentPagerAdapter(this.getFragmentManager()) {
        	FragmentOne[] fragment = {new FragmentOne(), new FragmentOne()};
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 2;
			}
			
			@Override
			public Fragment getItem(int arg0) {
				// TODO Auto-generated method stub
				return fragment[arg0];
			}
		};
		
		pager = (ViewPager)findViewById(R.id.pager);
		pager.setAdapter(adapter);
		pager.setCurrentItem(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
