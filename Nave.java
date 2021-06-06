import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int currentImage;
    private int counter = 0;
    private int Score;
    private int vidas = 4;
    
    public Nave()
    {
        setImage("images/Nave.png");
    }
    public void act() 
    {
        handleDirection();
        choque();
        animacion();
    }    
    public int vidas()
    {
        return vidas;
    }
    public void choque()
    {
        if(isTouching(Enemigo.class)){
            Enemigo enemigo=(Enemigo)getOneIntersectingObject(Enemigo.class);
            removeTouching(Enemigo.class);
            if(counter == 0)
            {
                vidas--;
                
            }
            
        }
        if(isTouching(Obstaculo.class)){
            Obstaculo obstaculo=(Obstaculo)getOneIntersectingObject(Obstaculo.class);
            
            if(counter == 0)
            {
                vidas--;
                
            }
            counter = (counter + 1)%200;
        }
    }
    public void handleDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 3;
        if(Greenfoot.isKeyDown("right"))
        {
           
            currentImage = 1;
            setLocation(x + OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            
            currentImage = 2;
            setLocation(x - OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            
            
            setLocation(x , y - OFFSET);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            
            
            setLocation(x , y + OFFSET);
        }else
        {
            currentImage=0;
        }
    }
    public void animacion()
    {
        if(currentImage ==1)
        {
            setImage("images/NaveD.png");
        }else if(currentImage ==2 )
        {
            setImage("images/NaveI.png");
        }else if(currentImage ==0)
        {
            setImage("images/Nave.png");
        }
    
    }
}


