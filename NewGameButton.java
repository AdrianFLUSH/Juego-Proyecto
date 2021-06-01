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
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
            setImage("images/NewGame.png"); //changes the image of the button so that you see if it's clicked;
            Greenfoot.setWorld (new LVL1());//also add the methods you want to execute;
        }// Add your action code here.
    }    
}
