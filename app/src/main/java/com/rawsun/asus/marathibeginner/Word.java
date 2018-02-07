package com.rawsun.asus.marathibeginner;

/**
 * contains default and marathi translation
 */

public class Word {
    //default translation for the word
    private String mDefaultTranslation;

    //marathi Translation for the word
    private String mMarathiTranslation;

    //to store id of image
    private int mImageResourceId=No_IMAGE_PROVIDED;

    private static final int No_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation,String marathiTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMarathiTranslation=marathiTranslation;

    }

    //constructor to pass all the items like defaultTranslation marathiTranslation and imageResourceId
    public Word(String defaultTranslation,String marathiTranslation,int imageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMarathiTranslation=marathiTranslation;
        mImageResourceId=imageResourceId;
    }

//get the default translation of the word

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get the marathi translation of the word
    public String getMarathiTranslation() {
        return mMarathiTranslation;
    }

    //get the image id for the image
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    //checking for image resource id
         public boolean hasImage(){
        return mImageResourceId != No_IMAGE_PROVIDED;
    }
}
