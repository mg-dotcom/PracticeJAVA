public class Song {

    private String title;
    private String artist;
    private int duration;
    private boolean isLike;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.isLike = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean getIsLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }

    public String addToFavorite(){
        if(isLike == true) {
            this.isLike = false;
            return getTitle() + " is disliked";
        } else if (isLike == false){
            this.isLike = true;
            return getTitle() + " is liked";
        } return "";
    }

    public String getFormattedDuration(int duration){
        int min = duration / 60;
        int sec = duration % 60;
        if(sec < 10) {
            String twoUnitSec = String.format("%02d", sec);
            return min + " minutes " + twoUnitSec + " seconds";
        }
        return min + " minutes " + sec + " seconds";
    }

    public boolean isSameArtist(Song song){
        if(this.artist.equals(song.getArtist())){
            return true;
        } return false;
    }

    public String isFavorite(){
        if(isLike == true) {
            return getTitle() + " is liked";
        } else if (isLike == false){
            return getTitle() + " is disliked";
        } return "";
    }

    @Override
    public String toString() {
        return "Song  [" +
                "title = '" + title + '\'' +
                ", artist = '" + artist + '\'' +
                ", duration = " + getFormattedDuration(duration) +
                ", isLike = " + isLike +
                ']';
    }
}