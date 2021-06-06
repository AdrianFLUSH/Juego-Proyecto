import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class MainScreen.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addButtons();
    }
    
     private void addButtons(){        
        addObject(new NewGameButton(),300,10+60);
        addObject(new RecordButton(),300,140+60);       
        addObject(new HelpButton(),300,270+60);        
    }
}
