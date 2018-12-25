package com.music.app.model;


import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType("metadata")
public class MetaDataTable {


    @CassandraType(type = DataType.Name.TEXT)
    @Column
    private String song_name;

    @CassandraType(type = DataType.Name.TEXT)
    @Column
    private String genre;

    @CassandraType(type = DataType.Name.TEXT)
    @Column
    private String album_name;

    @CassandraType(type = DataType.Name.TEXT)
    @Column
    private String artist_name;

    @CassandraType(type = DataType.Name.TEXT)
    @Column
    private String writer;

    @CassandraType(type = DataType.Name.TEXT)
    @Column
    private String publisher;


    public MetaDataTable(String song_name, String genre, String album_name, String artist_name, String writer, String publisher) {
        this.song_name = song_name;
        this.genre = genre;
        this.album_name = album_name;
        this.artist_name = artist_name;
        this.writer = writer;
        this.publisher = publisher;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
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
