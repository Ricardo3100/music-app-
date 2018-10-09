package com.example.ricardo.musicapp;
class Word {
    private String mArtist;
    private String mMusic;
    /**
     * @param getmusic
     * @param getartist
     */
    public Word(String getartist, String getmusic) {
        mArtist = getartist;
        mMusic = getmusic;
    }
    public String getartist() {
        return mArtist;
    }
    public String getmusic() {
        return mMusic;
    }
}