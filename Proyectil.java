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
    protected int Score;
    private int p = 0;
    public Proyectil()
    {
        setImage("images/Bala.png");
        Score = 30;
    }

    public void disparo()
    {
        int x = getX();
        int y = getY();
        int speed = 4;
        if(counter !=380)
        {
            setLocation(x, y - speed);
            counter = counter + 1;
        }
        if(isTouching(Enemigo.class))
        {
            LVL1.score +=Score;
            LVL2.score += Score;
            Enemigo enemigo=(Enemigo)getOneIntersectingObject(Enemigo.class);
            removeTouching(Enemigo.class);
            p = 1;
        }
    }

    public void colisiones()
    {
        if(isAtEdge())
        {
            this.getWorld().removeObject(this);
        }else if(p ==1)
        {
            this.getWorld().removeObject(this);
            p=0;
        }
    }

    public void act() 
    {
        disparo();
        colisiones();
    }   
}
