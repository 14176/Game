import greenfoot.*;

/**
 * Write a description of class alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alligator extends Actor
{
    /**
     * Act - do whatever the alligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
    }// Add your action code here.
=======
        // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);
        }
>>>>>>> 7a2525a48fc07a41c11532c0c8bb95edcd9a62a8
    }    
}