package com.example.android.miwok;

/**
  * {@link Word} represents a vocabulary word that the user wants to learn.
  * It contains a default translation, a Miwok translation, and an image for that word.
  */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId;

    /**
      * Create a new Word object.
      *
      * @param defaultTranslation is the word in a language that the user is already familiar with
      *                           (such as English)
      * @param miwokTranslation is the word in the Miwok language
      */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
