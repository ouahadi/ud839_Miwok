package com.example.android.miwok;

/**
 * Created by alek on 22/03/2018.
 */

public class Word {

    //String value miwok
    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int mImage = NO_IMAGE_PROVIDED;

    private int mSound;

    private boolean hasImage;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundFile) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        hasImage = false;
        mSound = soundFile;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public boolean getHasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }
    /**
     * Get the Miwok pronunciation of the word.
     */
    public int getSound() {
        return mSound;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImage=" + mImage +
                ", mSound=" + mSound +
                ", hasImage=" + hasImage +
                '}';
    }

    public Word(String defaultTranslation, String miwokTranslation, int miwokImage, int soundFile) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = miwokImage;
        hasImage = true;
        mSound = soundFile;
    }


    /**
     * Get the image to illustrate the word.
     */
    public int getMiwokImage() {
        return mImage;
    }



}


