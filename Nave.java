import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int currentImage;
    private int counter;
    private int Score;
    
    public Nave()
    {
        setImage("images/Base-nave.png");
    }
    public void act() 
    {
        handleDirection();
    }    
    public void handleDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 3;
        if(Greenfoot.isKeyDown("right"))
        {
           
           
            setLocation(x + OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            
            
            setLocation(x - OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            
            
            setLocation(x , y - OFFSET);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            
            
            setLocation(x , y + OFFSET);
        }
    }
}
