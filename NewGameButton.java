import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGameButton extends Button
{
    /**
     * Act - do whatever the NewGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NewGameButton(){
        setImage("images/NewGame.png");
    }
    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new LVL1());
    }
}
