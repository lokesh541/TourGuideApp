package com.example.android.touristguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricSitesFragment extends Fragment {


    public HistoricSitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list,container,false);


        ArrayList <Location> locations = new ArrayList <Location>();




        locations.add(new Location("Charminar", R.drawable.charminar));
        locations.add(new Location("Birla mandir",R.drawable.birlamandir));
        locations.add(new Location("Mecca masjid",R.drawable.mecca));
        locations.add(new Location("FalakNuma palace",R.drawable.falaknuma));
        locations.add(new Location("Golconda",R.drawable.golconda));

       LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);


        return  rootView;
    }



}
