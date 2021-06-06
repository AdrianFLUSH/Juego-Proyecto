import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Button
{
    /**
     * Act - do whatever the MenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MenuButton(){
        setImage("images/Menu.png");
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
            setImage("images/Menu.png"); //changes the image of the button so that you see if it's clicked;
            Greenfoot.setWorld (new Menu());//also add the methods you want to execute;
        }// Add your action code here.
    }    
}
