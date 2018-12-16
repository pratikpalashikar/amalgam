package com.music.app.model;



public class MusicMetadata {


    private String songName = "Dooba";
    private String genre = "pop";
    private String albumName = "Kakhi";
    private String artistName = "Akshay";
    private String writer = "Sonu Nigam";
    private String publisher = "billo rani";


    public MusicMetadata(String songName, String genre, String albumName, String artistName, String writer, String publisher) {
        this.songName = songName;
        this.genre = genre;
        this.albumName = albumName;
        this.artistName = artistName;
        this.writer = writer;
        this.publisher = publisher;
    }


    public MusicMetadata(){

    }


    public MusicMetadata build(){

        MusicMetadata musicMetadata = new MusicMetadata();
        musicMetadata.setAlbumName(this.albumName);
        musicMetadata.setGenre(this.genre);
        musicMetadata.setArtistName(this.artistName);
        musicMetadata.setWriter(this.writer);
        musicMetadata.setPublisher(this.publisher);
        return musicMetadata;

    }


    public MusicMetadata withAlbumName(String albumName){
        this.albumName = albumName;
        return this;
    }


    public MusicMetadata withGenre(String genre){
        this.genre = genre;
        return this;
    }


    public MusicMetadata withArtist(String artist){
        this.artistName = artist;
        return this;
    }


    public MusicMetadata withWriter(String writer){
        this.writer = writer;
        return this;
    }


    public MusicMetadata withPublisher(String publisher){
        this.publisher = publisher;
        return this;
    }




    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
