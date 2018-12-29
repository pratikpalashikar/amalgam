CREATE KEYSPACE music_metadata
WITH REPLICATION = {
'class': 'SimpleStrategy',
'replication_factor' : 1
};


CREATE TYPE music_metadata.metadata (
song_name text,
genre text,
album_name text,
artist_name text,
writer text,
publisher text
);


CREATE TABLE music_metadata.songs (
id uuid PRIMARY KEY,
data blob,
metadata FROZEN<metadata>
);




INSERT INTO music_metadata.metadata (song_name, genre, album_name, artist_name, writer, publisher) VALUES ('dil dooba', 'khakhee','akshay Kumar','pratik','gayatri','t-series');



INSERT INTO music_metadata.songs (id, data, metadata) VALUES (764e5dba-9333-402a-bd74-83d3a53f7c8e,null,{song_name: 'dil dooba', genre: 'khakhee',album_name: 'akshay Kumar',artist_name: 'pratik',writer: 'gayatri',publisher: 't-series'});
