import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Edificio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Edificio1 extends Obstaculo
{
    /**
     * Act - do whatever the Edificio1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter;
    public Edificio1()
    {
        setImage("images/Edificio1.png");
    }

    public void movimiento()
    {
        int x = getX();
        int y = getY();
        int speed = 1;
        if(counter !=380)
        {
            setLocation(x, y + speed);
            counter = counter + 1;
            if(counter == 350)
            {
                this.getWorld().removeObject(this);
            }
        }
    }

    public void act() 
    {
        movimiento();
    }    
}
