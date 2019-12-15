package com.example.sdaassign32019johndoe;
/*
* Copyright (C) 2016 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


/**
 * {@link FlavorAdapter} This class helps create a template for a single product that can used to print..
 * Each object has 4 properties: design name, sizes available, product it can be printed on, and image resource ID.
 * This is a basic arrayAdapter
 * It was adapted updated from the original project that was downloaded for assignment 3
 */
public class FlavorAdapter {

    // Name of the design name (e.g. blue dog, unicorn, geometric duck)
    private String designName;

    // product size (e.g. s, m, l, xl)
    private String productSize;

    // type of product the design can be printed on (e.g hats, tshirts, sweatshirts)
    private String productType;

    // Drawable resource ID
    private int mImageResourceId;

    /**
     * Create a new FlavorAdapter object.
     * @param dName is the name of the design (e.g. dog, bird, horse)
     * @param pSize is sizes available (e.g. s/m/l/xl)
     * @param  pType is the type of produc it can be printed on
     * @param imageResourceId is drawable reference ID that corresponds to the design
     *
     * */
    public FlavorAdapter(String dName, String pSize, String pType, int imageResourceId)
    {
        designName = dName;
        productSize = pSize;
        productType = pType;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the design
     */
    public String getDesignName() {
        return designName;
    }

    /**
     * Get the product size
     */
    public String getProductSize() {
        return productSize;
    }

    /**
     * get the product type
     */
    public String getProductType(){ return productType; }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}

