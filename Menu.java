import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addButtons();
    }
    
     private void addButtons( ){
        addObject(new NewGameButton(),150,10+60);
        addObject(new RecordButton(),150,140+60);       
        addObject(new HelpButton(),150,270+60);
        addObject(new ExitButton(),450,270+60);
    }
    //Cambio porque no referencié el issue
}
