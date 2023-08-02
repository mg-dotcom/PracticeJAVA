import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       Song song1 = new Song("Broken Heart","Baby Boat",123);
       Song song2 = new Song("Met","Baby Boat",147);
//        Song song3 = new Song("Day Dream","yunggtarr",166);
//        Song song4 = new Song("Home","Urworld",185);
//
//        System.out.println(song1);
//        System.out.println(song2);
//        System.out.println(song3);
//        System.out.println(song4);
//
//        System.out.println();
//
//        song1.setTitle("Abu");
//        song1.setArtist("Baby Boat");
//        song1.setDuration(128);
//        System.out.println("-------- Set new song1 --------");
//        System.out.println();
//        System.out.println(song1);
//
//        System.out.println();
//
//        System.out.println("-------- Add your fav song --------");
//        System.out.println();
//        System.out.println(song1.addToFavorite());
//        System.out.println(song2.addToFavorite());
//        System.out.println();
//        System.out.println(song1.isFavorite());
//        System.out.println(song2.isFavorite());
//        System.out.println(song3.isFavorite());
//        System.out.println(song4.isFavorite());
//
//        System.out.println();
//
//        System.out.println("-------- Is that the same artist ? --------");
//        System.out.println();
//        System.out.println("Song 1 and Song 2 are same artist ?: " + song1.isSameArtist(song2));
//        System.out.println("Song 3 and Song 4 are same artist ?: " + song3.isSameArtist(song4));
        Playlist pl = new Playlist("EIEI",5);
        pl.addSong(song1);
        pl.addSong(song2);

        //pl.deleteSong("Broken Heart");

        pl.getAllSongs();
    }
}
