package com.dogheraldry.multityperecyclerview;

public class Model {

    String Imageviewurl;
    String textview;

    public Model(String imageviewurl, String textview) {
        Imageviewurl = imageviewurl;
        this.textview = textview;
    }

    public String getImageviewurl() {
        return Imageviewurl;
    }

    public void setImageviewurl(String imageviewurl) {
        Imageviewurl = imageviewurl;
    }

    public String getTextview() {
        return textview;
    }

    public void setTextview(String textview) {
        this.textview = textview;
    }
}
