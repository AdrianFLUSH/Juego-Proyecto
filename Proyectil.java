import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectil extends Actor
{
    /**
     * Act - do whatever the Proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int counter;
    private int score;
    public Proyectil()
    {
        setImage("images/Bala.png");
    }

    public void disparo()
    {
        int x = getX();
        int y = getY();
        int speed = 5;
        if(counter !=380)
        {
            setLocation(x, y - speed);
            counter = counter + 1;
        }
        if(isTouching(Enemigo.class))
        {
            Enemigo enemigo=(Enemigo)getOneIntersectingObject(Enemigo.class);
            removeTouching(Enemigo.class);
        }
    }

    public void colisiones()
    {
        if(isAtEdge())
        {
            this.getWorld().removeObject(this);
        }
    }

    public void act() 
    {
        disparo();
        colisiones();
    }   
}
