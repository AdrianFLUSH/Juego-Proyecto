import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LVL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LVL1 extends World
{

    /**
     * Constructor for objects of class LVL1.
     * 
     */
    Nave nave = new Nave();
    public LVL1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(nave, 300, 250);
    }
    
    public void act()
    {
        showText("DEMO" , 400, 30);
    }
}