package com.example.sdaassign32019johndoe;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/*
 * A simple {@link Fragment} subclass.
 * @author Chris Coughlan 2019
 */
public class ProductList extends Fragment {

    private static final String TAG = "RecyclerViewActivity";
    private ArrayList<FlavorAdapter> mFlavor = new ArrayList<>();

    public ProductList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_product_list, container, false);
        // Create an ArrayList of AndroidFlavor objects
        mFlavor.add(new FlavorAdapter("Cartoon Cloud", "S / M / L / XL / XXL", "Hat / T-shirt / Sweatshirt", R.drawable.cartoon_cloud));
        mFlavor.add(new FlavorAdapter("Dog", "XS / S / M / L / XL / XXL", "T-shirt / Sweatshirt", R.drawable.color_dog));
        mFlavor.add(new FlavorAdapter("Dolphin", "S / M / L", "T-shirt", R.drawable.dolphin));
        mFlavor.add(new FlavorAdapter("Earth", "XS / S / M / L","Hat / T-shirt / Sweatshirt", R.drawable.earth));
        mFlavor.add(new FlavorAdapter("Geometric Science", "M / L / XL","T-shirt / Sweatshirt", R.drawable.geo_beaker));
        mFlavor.add(new FlavorAdapter("Dove", "XS / SM / L / XL / XXL / XXXL", "Sweatshirt", R.drawable.green_dove));
        mFlavor.add(new FlavorAdapter("Horse", "S / M / L / XL", "Hat / T-shirt / Sweatshirt", R.drawable.green_horse));
        mFlavor.add(new FlavorAdapter("Dog", "XS / S", "Hat / T-shirt", R.drawable.grey_dog));
        mFlavor.add(new FlavorAdapter("Geometric Hotdog", "XS / S / M / L / XL / XXL", "Hat / T-shirt / Sweatshirt", R.drawable.hotdog));
        mFlavor.add(new FlavorAdapter("Mouse and Cheese", "S / M / L / XL", "T-shirt / Sweatshirt", R.drawable.mouse_cheese));
        mFlavor.add(new FlavorAdapter("Red Fish", "XS / SM / L / XL / XXL / XXXL", "Hat / Sweatshirt", R.drawable.redfish));
        mFlavor.add(new FlavorAdapter("Geo Taco", "XS / S / M / L / XL", "Hat / T-shirt / Sweatshirt", R.drawable.taco));
        mFlavor.add(new FlavorAdapter("Tiger", "XS / S", "Hat / T-shirt", R.drawable.tiger));
        mFlavor.add(new FlavorAdapter("Turtle", "XS / S / M / L / XL / XXL", "Hat / T-shirt / Sweatshirt", R.drawable.turtle));
        mFlavor.add(new FlavorAdapter("Unicorn", "S / M / L / XL", "T-shirt / Sweatshirt", R.drawable.unicorn));

        //start it with the view
        Log.d(TAG, "Starting recycler view");
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView_view);
        FlavorViewAdapter recyclerViewAdapter = new FlavorViewAdapter(getContext(), mFlavor);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
}
