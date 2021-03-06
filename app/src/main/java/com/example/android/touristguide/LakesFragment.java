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
public class LakesFragment extends Fragment {


    public LakesFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list,container,false);


        ArrayList<Location> locations = new ArrayList <Location>();



        locations.add(new Location(getString(R.string.Hussain)));
        locations.add(new Location(getString(R.string.himayath)));
        locations.add(new Location(getString(R.string.Shamirpet)));
        locations.add(new Location(getString(R.string.durgam)));
        locations.add(new Location(getString(R.string.saroor)));
        locations.add(new Location( getString(R.string.Usman)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);


        return  rootView;
    }

}
