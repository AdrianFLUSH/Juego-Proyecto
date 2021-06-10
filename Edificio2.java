import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Edificio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Edificio2 extends Obstaculo
{
    /**
     * Act - do whatever the Edificio2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter;
    public Edificio2()
    {
        setImage("images/Edificio2.png");
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
