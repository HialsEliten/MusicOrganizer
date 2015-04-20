
import java.time.Duration;
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
    }
    
    public void etellerannet()
    {
        String title = "Thriller";
        // "Pleas provide name of artist"...
        
        String artist = "Mikkel Jækkson";
        
        
        //this.addCD(title, artist, releaseYear, artist, duration, archiveNumber);
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
    
    public int getNumberOfTracks(){
        return this.trackArchive.getNumberOfTracks();
    }
    /**
     * Return a AudioTrack
     * 
     * @param index
     * @return track at specified position 
     */
    public AudioTrack getTrackAt(int index)
    {
        return trackArchive.getTrackAt(index);
    }
    
    public void addCD(String title, String artist, int releaseYear, String recordLabel, int duration, int archiveNumber)
    {
       CD cd = new CD( title,  artist,  releaseYear,  recordLabel,  duration,  archiveNumber);
       mediumArchive.addMedium(cd);
       
       
       
    }
    public void addMusicTrackToCD (String title, long duration, String artist, int date, int  timesPlayed, Medium medium)
    {
       Music music = new Music(title, duration, artist, date, timesPlayed, medium);
       trackArchive.addTrack(music);
    }
    
    
    
}
