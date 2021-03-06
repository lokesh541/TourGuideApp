package com.example.android.touristguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list,container,false);


        ArrayList<Location> locations = new ArrayList <Location>();



        locations.add(new Location(getString(R.string.indira)));
        locations.add(new Location(getString(R.string.ntr)));
        locations.add(new Location(getString(R.string.lumbini)));
        locations.add(new Location(getString(R.string.kbr)));
        locations.add(new Location(getString(R.string.lotus)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);


        return  rootView;
    }

}
