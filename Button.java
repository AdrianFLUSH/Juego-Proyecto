import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean mouseOver = false;
    private static int TRANS = 255;
    
    public void act() 
    {
        checkClick();
    }    
    
    public void checkClick()
    {
         onClickedButton();
    }
    
    protected abstract void onClickedButton();
}
