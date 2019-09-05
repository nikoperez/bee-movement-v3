    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    //Nikolas P
    
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
            //spawn instects
            bee bee1 = new bee();
            addObject(bee1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            Beetle beetle1 = new Beetle();
            addObject(beetle1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            
            //spawn Plants
    
            //Flowers
        for(int i = 0; i < 10; i++) {
            Flower Flower1 = new Flower1();
            addObject(Flower1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));            
        }
        for(int i = 0; i < 10; i++) {
            Flower Flower2 = new Flower2();
            addObject(Flower2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));            
        }
        for(int i = 0; i < 10; i++) {
            Flower Flower3 = new Flower3();
            addObject(Flower3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));            
        }
        
            //Cactus
        for(int i = 0; i < 10; i++) {
            Cactus Cactus1 = new Cactus1();
            addObject(Cactus1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));            
        }
        for(int i = 0; i < 10; i++) {
            Cactus Cactus2 = new Mushroom();
            addObject(Cactus2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));            
        }
        for(int i = 0; i < 10; i++) {
            Cactus Cactus3 = new Potato();
            addObject(Cactus3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));            
        }
    }
}
