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
    private Nave nave = new Nave();
    private int counter ;
    public static int score;
    public LVL1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(new GreenfootImage("Fondo.png"));
        addObject(nave, 300, 250);
    }

    public void generaEnemigos()
    {
        int i,r;
        if(counter!=4001)
        {
            if(counter==1 || counter==100 || counter ==190 || counter==350 || counter == 600 || counter == 1700 || counter == 2900)
            {
                addObject(new Alien1(),250,100);
            }
            if(counter==400 || counter == 500 || counter == 600 || counter== 650 || counter == 3600)
            {
                addObject(new Alien2(),400,100);
            }
            if(counter ==700 || counter == 1200 || counter == 2300 || counter == 2750)
            {
                int o = 0;
                for(i=0;i<5;i++)
                {
                    addObject(new Alien1(),200 + o, 100);
                    o =  o + 50;
                }
            } 
            if(counter ==1700 || counter == 2000 || counter == 2500)
            {
                int o = 0;
                for(i=0;i<2;i++)
                {
                    addObject(new Alien2(),200 + o, 100);
                    o =  o + 50;
                }
            }
            if(counter ==2900 || counter == 3600)
            {
                int o = 0;
                for(i=0;i<2;i++)
                {
                    addObject(new Alien2(),100 + o, 100);
                    addObject(new Alien1(),300 + o, 100);
                    o =  o + 50;
                }
            }
            if(counter == 150 ||  counter == 1000 || counter == 1300 ||  counter == 2000 )
            {
                r = Greenfoot.getRandomNumber(301);
                addObject(new Edificio1(),r, 10);
            }
            if(counter == 500 || counter == 800 || counter == 2300 || counter == 2700 || counter == 3000 || counter == 3600 )
            {
                r = Greenfoot.getRandomNumber(301);
                addObject(new Edificio2(),r, 10);
            }
            if(counter == 4000)
            {
                cambiarMundo();
            }
            counter = counter + 1;
        }
    }
    
    public void cambiarMundo()
    {
        Greenfoot.setWorld(new LVL2());
    }

    public void act()
    {
        showText("LVL1" , 200, 30);
        showText("Vidas: " + nave.vidas(), 400,30);
        showText("Puntos: " + score, 300, 30);
        generaEnemigos();
    }
}