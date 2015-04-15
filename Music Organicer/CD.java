
/**
 * Write a description of class CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends Mediums
{
    // instance variables - replace the example below with your own
    private String artist;
    private int releaseYear;
    private String recordLabel;
    private int archiveNumber;

    /**
     * Constructor for objects of class CD
     */
    public CD(String title, String artist, int releaseYear, String recordLabel, int archiveNumber)
    {
        super(title);
        
        
    }

    /**
     * Get artist name
     */    
    public String getArtist() {
        return artist;
    }
    
    /**
     * Set new artist  
     */ 
    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }
    
    /**
     * Get release year  
     */ 
    public int getReleaseYear() {
        return releaseYear;
    }
    
    /**
     * Set new release year  
     */ 
    public void setReleaseYear(int newReleaseYear) {
        this.releaseYear = newReleaseYear;
    }
    
    /**
     * Get record label  
     */ 
    public String getRecordLabel() {
        return recordLabel;
    }
    
    /**
     * Set new record label  
     */ 
    public void setRecordLabel(String newRecordLabel) {
        this.recordLabel = newRecordLabel;
    }
    
    /**
     * Get archive number  
     * 
     * @return archiveNumber
     */ 
    public int getArchiveNumber() {
        return archiveNumber;
    }
    
    /**
     * Set new archive number
     * 
     * @param newArchiveNumber
     */ 
    public void setArchiveNumber(int newArchiveNumber) {
        this.archiveNumber = newArchiveNumber;
    }  
}

    