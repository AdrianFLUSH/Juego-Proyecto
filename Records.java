import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{

    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new MenuButton(),400,330);
        
        GreenfootImage background = new GreenfootImage("Records.JPG");
        background.scale(getWidth(), getHeight());
        setBackground(background);
    }
}
