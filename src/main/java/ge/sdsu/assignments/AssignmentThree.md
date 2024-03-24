
# Assignment Three




**Objective:** The objective of this assignment is to reinforce the understanding of composition in Java programming by designing and implementing a Music Player System. This system will consist of different components such as songs, playlists, and music players.

**Instructions:**

**Song Class:**
-   Define a class named `Song`.
-   Each song object should have attributes such as title, artist, duration, genre, etc.
-   Implement methods to retrieve information about the song.

**Playlist Class:**    
-   Create a class named `Playlist`.
-   Define private fields to hold a collection of songs.
-   Implement methods to add/remove songs from the playlist, and play the next song (in case the playlist is empty and the next song is requested throw an exception with the corresponding name and message).

**Music Player Class:**    
-   Create a class named `MusicPlayer`.
-   Define private fields to represent the current playlist being played and any additional functionalities you wish to include.
-   Implement methods to load a playlist, play songs (you should refer to the playNext() method from the playlist), skip to the next song, etc.

**Composition:**
-   Utilize composition to connect songs to playlists and playlists to the music player.
-   Ensure that the music player can interact with playlists and play songs accordingly.