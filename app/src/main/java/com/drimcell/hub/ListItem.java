package com.drimcell.hub;

public class ListItem {

    private int mImage;
    private String mName;
    private String mDetail;

    public ListItem(int image, String name,String detail){

        mImage = image;
        mName = name;
        mDetail = detail;
    }

    public int getmImage(){return mImage;}
    public String getmName(){return mName;}
    public String getmDetail(){return mDetail;}

}
