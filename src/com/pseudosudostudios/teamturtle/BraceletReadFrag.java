/****************************
 * deStress
 * Updated 4/28/14 by Ben O'Halloran
 ***************************/
package com.pseudosudostudios.teamturtle;

import java.util.Random;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/** Display's the bracelet readout including a random stress tip */
public class BraceletReadFrag extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_bracelet_read, null);
		TextView tipOut = (TextView) v.findViewById(R.id.bracelet_tip_out);
		tipOut.setText(getRandomStressTip());
		return v;
	}

	private String getRandomStressTip() {
		String[] allTips = getResources().getStringArray(R.array.tips);
		Random rand = new Random();
		return allTips[rand.nextInt(allTips.length)];
	}
}
