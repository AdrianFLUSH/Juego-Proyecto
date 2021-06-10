import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien3 extends Enemigo
{
    /**
     * Act - do whatever the Alien3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    private int i;
    public Alien3()
    {

        setImage("images/Alien3.png");

    }
    public int Score()
    {
        return 10; 
    }

    public void movimiento()
    {
        int x = getX();
        int y = getY();
        int speed = 1;
        if(counter !=600)
        {
            setLocation(x + speed, y);
            counter = counter + 1;
            if(isAtEdge())
            {
                this.getWorld().removeObject(this);
            }
            if(counter == 150 || counter == 320)
            {
                fire();
            }
        }
    }
    public void fire()
    {
        ProyectilE bala = new ProyectilE();
        getWorld().addObject(bala, getX(),getY());
    }

    public void act() 
    {
        movimiento();
    }     
}
