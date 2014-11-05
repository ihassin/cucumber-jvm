package com.demo.warehouse;

public class SKU {
    private String mySKU;
    private String myBarcode;
    private boolean isForSale = false;

    public SKU(String theSKU)
    {
        mySKU = theSKU;
    }

    public void addBarcode(String barCode)
    {
        if(barCode != "barCode") {
            myBarcode = barCode;
            isForSale = true;
        }
    }

    public boolean isForSale() {
        return(isForSale);
    }
}
