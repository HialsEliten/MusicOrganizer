import java.util.ArrayList;

/**
 * Write a description of class Archive here.
 * 
 * @Kelvin
 * @15.04.15
 */
public class Archive
{
    // instance variables - replace the example below with your own
    private ArrayList<Medium> archiveList;

    /**
     * Constructor for objects of class Archive
     */
    public Archive()
    {
        archiveList = new ArrayList<Medium>();
    }

    /**
     * add new medium to archive list
     * 
     * @param  newMedium   a new medium (Medium) 
     */
    public void addMedium(Medium newMedium)
    {
        this.archiveList.add(newMedium);
    }
    
    /**
     * Remove medium from archive list
     * 
     * @param  mediumToRemove the medium to remove (Medium)
     */
    public void removeMedium(Medium mediumToRemove)
    {
        this.archiveList.remove(mediumToRemove);
    }
    
    /**
     * Return archive list
     * 
     * @Return archiveList the list of mediums in archive (ArrayList<Medium>)
     */
    public ArrayList<Medium> getMediumList(Medium mediumToRemove)
    {
        return this.archiveList;
    }
    
    
}
