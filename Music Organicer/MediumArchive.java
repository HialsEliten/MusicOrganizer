import java.util.ArrayList;

/**
 * Write a description of class MediumArchive here.
 * 
 * @NumTek Solutions
 * @15.04.15
 */
public class MediumArchive
{

    private ArrayList<Medium> mediumArchive;

    
    /**
     * Constructor for objects of class Archive
     */
    public MediumArchive()
    {
        mediumArchive = new ArrayList<Medium>();
    }

    
    /**
     * add new medium to archive list
     * 
     * @param  newMedium   a new medium (Medium) 
     */
    public void addMedium(Medium newMedium, int archiveNumber)
    {
        this.mediumArchive.add(newMedium);
    }
    
    /**
     * Remove medium from archive list
     * 
     * @param  mediumToRemove the medium to remove (Medium)
     */
    public void removeMedium(Medium mediumToRemove)
    {
        this.mediumArchive.remove(mediumToRemove);
    }
    
    /**
     * Return archive list
     * 
     * @Return mediumArchive the list of mediums in archive (ArrayList<Medium>)
     */
    public ArrayList<Medium> getMediumList(Medium mediumToRemove)
    {
        return this.mediumArchive;
    }
    
    
}
