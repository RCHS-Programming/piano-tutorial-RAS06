
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
        showMessage();
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
        
        //White Keys
        
        for(i = 0; i < whiteKeys.length; i++) 
        {
            key = new Key (whiteKeys[i], whiteNotes[i] + ".wav", "white-key.png", "white-key-down.png");
            addObject(key, 54 + i * 63, 140);
        }
        
        //Black Keys
        
        for(int x = 0; x < whiteKeys.length - 1; x++) {
            
            if(!blackKeys[x].equals("")){
             key = new Key(blackKeys[x], blackNotes[x]+".wav", "black-key.png", "black-key-down.png");
             addObject(key, 85 + (x * 63), 86);
            }
        }
        
    }
    public void showMessage() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.WHITE);
        bg.drawString("Click Run and then use your keyboard to play", 25, 320);
    }
}