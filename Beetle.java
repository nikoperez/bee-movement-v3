import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beetle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beetle extends Actor
{
    
    private int score = 0;
    /**
     * Act - do whatever the Beetle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        
        // Add your action code here.
        turn(Greenfoot.getRandomNumber(20) - 10);
        move(3);
        int x = getX();
        int y = getY();
        
        if (x > 600 || y < 0 || y > 400){
            x = 0;
            y = Greenfoot.getRandomNumber(400);
            setLocation(x,y);
            setRotation(0);
            
            
        }
        
        //ahhh
        //boolean  contactCactus = isTouching(Cactus.class);
        //if(contactCactus) {
            //removeTouching(Cactus.class);
            
        //}
        
        boolean contactflower = isTouching(Flower.class);
        //System.out.println(contactflower);
        if(contactflower) {
            Flower plant = (Flower) getOneIntersectingObject(Flower.class);
             int plantScore = plant.getScore();
             score = score - plantScore;
             removeTouching(Flower.class);
        }
        boolean contactCactus = isTouching(Cactus.class);
        //System.out.println(contactflower);
        if(contactCactus) {
            Cactus plant = (Cactus) getOneIntersectingObject(Cactus.class);
             int plantScore = plant.getScore();
             score = score + plantScore;
             removeTouching(Cactus.class);
        }
    }    
}
