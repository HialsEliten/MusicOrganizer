import java.util.*;
import java.time.Duration;

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends AudioTracks
{
    // instance variables - replace the example below with your own
   private Duration duration;
   private String artist;
   private int date;
   private int timesPlayed;

   
    
   

    /**
     * Constructor for objects of class Music
     */
    public Music(String title, Duration duration, String artist, int date, int  timesPlayed, Medium medium)
    {   
        super(title, duration, medium);
        this.duration = duration;
        this.artist = artist;
        this.date = date;
        this.timesPlayed = timesPlayed;
   
        
        
    }

    /**
     * Returns the artist of the music track.
     * 
     * @return      artist.
     */
    public String getArtist() 
    {
        return artist;
    }

    /**
     * Sets new artist to the music track.
     * 
     * @param       artist.
     */
    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

    /**
     * Returns a date of last time music track is played.
     * 
     * @return       date.
     */
    public int getDate() 
    {
        return date;
    }

    /**
     * Sets a new date of the last time music track is played.
     * 
     * 
     * @param       date.
     */
    public void setDate(int date) 
    {
        this.date = date;
    }

    /**
     * Returns the number of times the music track is played.
     * 
     * @return      timesPlayed.
     */
    public int getTimesPlayed() 
    {
        return timesPlayed;
    }

    /**
     * Sets the number of times the music track is played.
     * 
     * @param       timesPlayed.
     */
    public void setTimesPlayed(int timesPlayed) 
    {
        this.timesPlayed = timesPlayed;
    }

    /**
     * Returns the reference to medium of music track.
     * 
     * @return      mediumContaining.
     */
   

    
  
}

