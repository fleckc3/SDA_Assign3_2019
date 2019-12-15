package com.example.sdaassign32019johndoe;

/*
	Copyright [2019] [DCU.ie]

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * this fragment class setups the product list fragment.
 * It provides the data to be grabbed by the recycler view and displayed in the arrayList format
 * The following code was adapted from the downloaded assignment 3 project @author Chris Coughlan 2019
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
        // Create an ArrayList of design object objects
        mFlavor.add(new FlavorAdapter("Cartoon Cloud", "S / M / L / XL / XXL", "Hat / T-shirt / Sweatshirt", R.drawable.cartoon_cloud));
        mFlavor.add(new FlavorAdapter("Dog", "XS / S / M / L / XL / XXL", "T-shirt / Sweatshirt", R.drawable.color_dog));
        mFlavor.add(new FlavorAdapter("Dolphin", "S / M / L", "T-shirt", R.drawable.dolphin));
        mFlavor.add(new FlavorAdapter("Earth", "XS / S / M / L","Hat / T-shirt / Sweatshirt", R.drawable.earth));
        mFlavor.add(new FlavorAdapter("Geometric Science", "M / L / XL","T-shirt / Sweatshirt", R.drawable.geo_beaker));
        mFlavor.add(new FlavorAdapter("Dove", "XS / S / L / XL / XXL / XXXL", "Sweatshirt", R.drawable.green_dove));
        mFlavor.add(new FlavorAdapter("Horse", "S / M / L / XL", "Hat / T-shirt / Sweatshirt", R.drawable.green_horse));
        mFlavor.add(new FlavorAdapter("Dog", "XS / S", "Hat / T-shirt", R.drawable.grey_dog));
        mFlavor.add(new FlavorAdapter("Geometric Hotdog", "XS / S / M / L / XL / XXL", "Hat / T-shirt / Sweatshirt", R.drawable.hotdog));
        mFlavor.add(new FlavorAdapter("Mouse and Cheese", "S / M / L / XL", "T-shirt / Sweatshirt", R.drawable.mouse_cheese));
        mFlavor.add(new FlavorAdapter("Red Fish", "XS / S / L / XL / XXL / XXXL", "Hat / Sweatshirt", R.drawable.redfish));
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
