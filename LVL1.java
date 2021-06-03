import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LVL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LVL1 extends World
{

    /**
     * Constructor for objects of class LVL1.
     * 
     */
    Nave nave = new Nave();
    Enemigo alien1= new Alien1();
    public LVL1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Edificio1(),400,250);
        addObject(new Edificio2(),500,250);
        addObject(new Asteroide(),700,250);
        addObject(alien1, 200, 200);
        addObject(new Alien2(), 300, 100);
        addObject(nave, 300, 250);
    }
    
    public void act()
    {
        showText("DEMO" , 200, 30);
        showText("Vidas" + nave.vidas(), 400,30);
        //if(alien1.espacio() == 1)
        {
            //removeObject(alien1);
        }
    }
}