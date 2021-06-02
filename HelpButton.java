import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Button
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public HelpButton(){
        setImage("images/Help.png");
    }
    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new Help());
    }
}
