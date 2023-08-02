import org.w3c.dom.ls.LSOutput;

public class Playlist {

    private Song[] songs;
    private String name;
    public static String ANSI_RESET = "\u001B[0m";
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";

    private int songCount;

    public Playlist (String name,int maxSongs){
        this.name = name;
        // Add the capacity in this playlist
        this.songs = new Song[maxSongs];
        this.songCount = 0;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song song){
        if (songCount < songs.length) {
            this.songs[songCount] = song;
            songCount++;
            System.out.println(ANSI_GREEN + "เพิ่มเพลงสำเร็จ !" + ANSI_GREEN);
        }else {
            System.out.println(ANSI_RED + "X เพิ่มเพลงไม่สำเร็จ X" + ANSI_RESET);
        }
    }

    public int totalDuration(){
        int total = 0;
        for(int i = 0; i < songs.length; i++) {
            total += songs[i].getDuration();
        }
        return total;
    }

    public void deleteSong(String title) {
        boolean found = false;
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getTitle().equals(title)) {
                found = true;
                for (int j = i; j < songCount - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[songCount - 1] = null;
                songCount--;
                System.out.println("Remove " + title + " succeed.");
            }
        }
        if (!found) {
            System.out.println("Remove " + title + " not found.");
        }
    }

    public void getAllSongs(){
        for(int i = 0; i < songs.length; i++){
           if(songs[i] == null){
               System.out.println("Not yet add.");
           } else {
               System.out.println(songs[i].toString());
           }
        }

    }

}
