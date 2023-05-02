
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object anotherSong) {
        if (this == anotherSong) {
            return true;
        }

        if (!(anotherSong instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) anotherSong;

        if (this.artist.equals(comparedSong.artist())
                && this.name.equals(comparedSong.name())
                && this.durationInSeconds == comparedSong.durationInSeconds()) {
            return true;
        }

        return false;
    }

    public String artist() {
        return this.artist;
    }

    public String name() {
        return this.name;
    }

    public int durationInSeconds() {
        return this.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
