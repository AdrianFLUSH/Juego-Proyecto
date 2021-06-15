import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien2 extends Enemigo
{
    /**
     * Act - do whatever the Alien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    public Alien2()
    {
        setImage("images/Alien 2.png");
    }

    public void movimiento()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 1;
        if(counter <80)
        {
            setLocation(x + OFFSET, y + OFFSET);
            counter = counter + 1;
        }else if (counter > 79 &&  counter <150)
        {
            setLocation(x - OFFSET, y + OFFSET);
            counter = counter + 1;
        }else if(isAtEdge())
        {
            this.getWorld().removeObject(this);
        }else{
            counter = 0;
        }
    }

    public void act() 
    {
        movimiento();
    }    
}
