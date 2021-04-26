
    import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    //White Keys 
    private String[] whiteKeys = {"a","s","d","f","g","h","j","k","l",";","'","\\"}; 
    private String[] whiteNotes = {"2c", "2d", "2e", "2f", "2g", "2a", "2b","3c", "3d", "3e", "3f", "3g"};
    
    //Black Keys 
    private String[] blackKeys = {"w","e","","t","y","u","","o","p","","]"};
    private String[] blackNotes = {"3c#","3d#","","3f#","3g#","3a#","", "4c#", "4d#", "", "4f#" };
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        
        //Create Keys 
        
        makeKeys();
    }
    public void makeKeys()
    {
        int i;
        int keyWidth;
        int keyHeight;
        int spaceAtEdge;     
        
        Key key = new Key("","", "", "");
        keyWidth = key.getImage().getWidth();
        keyHeight = key.getImage().getHeight();  
        spaceAtEdge = (800 - keyWidth * 12) / 2;
        
        for(i = 0; i < 12; i++) 
        {
            addObject(new Key (whiteKeys[i], whiteNotes[i] + ".wav", "white-key.png", "white-key-down.png"), keyWidth * i + spaceAtEdge + keyWidth / 2, keyHeight / 2);
        }
    }
}