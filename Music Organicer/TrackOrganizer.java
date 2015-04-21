import java.util.ArrayList;

/**
 * Generating list of all exsiting tracks, regardless of its medium referance
 *
 * @author Vegard Rogne @ HialsEliten
 */
public class TrackOrganizer {

    // Initializing variables
    private AudioTrackArchive trackArchive;
    private MediumArchive mediumArchive;

    // Constructor for TrackOrganizer
    public TrackOrganizer() {
        // Assigning variables
        trackArchive = new AudioTrackArchive();
        mediumArchive = new MediumArchive();
        makeFirstTrack();

    }

    public void makeFirstTrack() {
        addCD("Sanger","knut",2001,"HaramStudio",65);
        //Medium enRandomCd = mediumArchive.getMediumAt(65);
        
        String title = "Thriller";
        long duration = 12;
        int date = 32;
        int timesPlayed = 2;
        long minutes = 5;
        long seconds = 24;
        int archiveNumber = 65;
     
        String artist = "Mikkel Jækkson";
        addMusicTrackToCD(title, minutes, seconds, artist, date, timesPlayed, archiveNumber);

    }

    /**
     * Adds track to track archive
     *
     * @param audioTrack audio track you want to add
     */
    public void addTrack(AudioTrack track) {

        this.trackArchive.addTrack(track);
    }

    /**
     * Removes track from track archive
     *
     * @param audioTrack audio track you want to remove
     */
    public void removeTrack(AudioTrack track) {
        this.trackArchive.removeTrack(track);
    }

    public int getNumberOfTracks() {
        return this.trackArchive.getNumberOfTracks();
    }

    /**
     * Return a AudioTrack
     *
     * @param index
     * @return track at specified position
     */
    public AudioTrack getTrackAt(int index) {
        return trackArchive.getTrackAt(index);
    }

    public void addCD(String title, String artist, int releaseYear, String recordLabel, int archiveNumber) {
        CD cd = new CD(title, artist, releaseYear, recordLabel, archiveNumber);
        mediumArchive.addMedium(cd);

    }

    public void addMusicTrackToCD(String title, long minutes, long seconds, String artist, int date, int timesPlayed, int archiveNumber) {
        Medium medium  =  mediumArchive.getMediumAt(archiveNumber);
        Music music = new Music(title, minutes, seconds, artist, date, timesPlayed, medium);
        // - - - - - - - - - -AudiTrack track = trackArchive.getTrack(music); - - - - -- - - - - - - - - - - - - - - - - 
        // - - - - - - - - - -mediumArchive.getMedium(medium).addTrac(index, track);-k(index, track);- - - - - - - - -  
        
        trackArchive.addTrack(music);        
    }
    
    public Medium getMediaAt(int index)
    {
        return mediumArchive.getMediumAt(index);
    }

}
