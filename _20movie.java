import java.util.*;

class VideoTape {
    String title;
    int length;
    String Available;

    public VideoTape(String title, int length, String available) {
        this.title = title;
        this.length = length;
        this.Available = available;
    }

    public void Show() {
        System.out.println("Title: " + title + " Length: " + length + " Availablity: " + Available);
    }

}

class Movie extends VideoTape {
    int DirectorRanking;

    public Movie(String title, int length, String available, int directorRanking) {
        super(title, length, available);
        DirectorRanking = directorRanking;
    }

    public void Show() {
        System.out.println("Title: " + title + " Length: " + length + " Availablity: " + Available
                + " DirectorRanking: " + DirectorRanking);
    }
}

class MusicVideo extends VideoTape {
    String ArtistCategory;

    public MusicVideo(String title, int length, String available, String artistCategory) {
        super(title, length, available);
        this.ArtistCategory = artistCategory;
    }

    public void Show() {
        System.out.println("Title: " + title + " Length: " + length + " Availablity: " + Available + " ArtistCategory: "
                + ArtistCategory);
    }
}

public class _20movie {
    public static void main(String[] args) {
        VideoTape v1 = new VideoTape("Zindagi Zund", 120, "Yes");
        v1.Show();
        Movie m = new Movie("Zindagi Zund", 120, "Yes", 4);
        m.Show();
        MusicVideo music = new MusicVideo("Zindagi Zund", 120, "Yes", "Chutiya");
        music.Show();

    }
}