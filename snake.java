import greenfoot.*;

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        move();
        eat();
    }    
    
    public void move()
    {
<<<<<<< HEAD
        basilisk basilisk= (basilisk) getWorld().getObjects(basilisk.class).get(0);
        if(basilisk != null){
            
            turnTowards(basilisk.getX(), basilisk.getY());
            move(2);
        }
=======
>>>>>>> 26771355630a3a199d03866de2de30909faee90e
    }
    
    public void eat()
    {
        Actor basilisk = getOneObjectAtOffset( 0, 0, basilisk.class ); 
        if( basilisk != null ){ 
              getWorld().removeObject( basilisk );        
      }
    }
}
