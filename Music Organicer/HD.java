
/**
 * HD class
 * 
 * @HialsEliten
 * @10.04.15
 */
public class HD extends Mediums
{
    // instance variables - replace the example below with your own
    private String fileName;
    private String pathToFile;
    private int fileSize;
    
    /**
     * Constructor for objects of class HD
     */
    public HD(String title, String fileName, String pathToFile, int fileSize)
    {
        // initialise instance variables
        super(title);
        this.fileName = fileName;
        this.pathToFile = pathToFile;
        this.fileSize = fileSize;
        
    }
    
    /**
     * Returns file name.
     * 
     * @return      fileName
     */
    public String getFileName() {
        return fileName;
    }
    
    /**
     * sets new file name.
     * 
     * @param       fileName 
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    /**
     * returns a path to the file.
     * 
     * @return      pathToFile
     */
    public String getPathToFile() {
        return pathToFile;
    }
    
    /**
     * Sets a path to the file.
     * 
     * @param       pathToFile 
     */
    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    /**
     * returns the file size in kilo bytes.
     * 
     * @return      fileSize
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets a new file size in kilo bytes.
     * 
     * @param       fileSize 
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    
}
