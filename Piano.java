
    import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
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
        
        Key key = new Key("","");
        keyWidth = key.getImage().getWidth();
        keyHeight = key.getImage().getHeight();  
        spaceAtEdge = (800 - keyWidth * 12) / 2;
        
        for(i = 0; i < 12; i++) 
        {
            addObject(new Key ("g", "3a.wav"), keyWidth * i + spaceAtEdge + keyWidth / 2, keyHeight / 2);
        }
    }
}