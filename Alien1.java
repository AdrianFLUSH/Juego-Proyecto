import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien1 extends Enemigo
{
    /**
     * Act - do whatever the Alien1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter;
    public Alien1()
    {
       
        setImage("images/Alien-1.png");
        
    }
    public void movimiento()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 1;
        if(counter !=380)
        {
            setLocation(x, y + OFFSET);
            counter = counter + 1;
        }
    }
    public void act() 
    {
        movimiento();
    }    
}
