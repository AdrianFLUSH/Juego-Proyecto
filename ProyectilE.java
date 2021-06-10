import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ProyectilE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProyectilE extends Proyectil
{
    /**
     * Act - do whatever the ProyectilE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    private int score;
    private int p = 0;
    public ProyectilE()
    {
        setImage("images/BalaE.png");
    }

    public void disparo()
    {
        int x = getX();
        int y = getY();
        int speed = 2;
        if(counter !=380)
        {
            setLocation(x, y + speed);
            counter = counter + 1;
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
