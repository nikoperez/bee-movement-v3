import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        
        bee bee1 = new bee();
        addObject(bee1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        bee bee2 = new bee();
        addObject(bee2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        Beetle beetle1 = new Beetle();
        addObject(beetle1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        
        Beetle beetle2 = new Beetle();
        addObject(beetle2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        //random item spawn
        
        
        
    }
    private int Cactus1 = 1;
    private int Mushroom = 2;
    private int Patato = 3;
}
