import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordButton extends Button
{
    /**
     * Act - do whatever the Record wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RecordButton(){
        setImage("images/HighScore.png");
    }
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new Records());
    }
}
