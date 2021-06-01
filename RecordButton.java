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
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
            setImage("images/HighScore.png"); //changes the image of the button so that you see if it's clicked;
            Greenfoot.setWorld (new Help());//also add the methods you want to execute;
        }// Add your action code here.
    }      
}
