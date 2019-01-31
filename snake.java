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
    private int countWalk = 0;
    public void act() 
    {
        move();
       
    }    
    
    public void move()
    { 
        if(countWalk >= 100){ //5歩以上歩いたら
            int ran = (int)(Math.random()*4);//０～３の乱数をつくる
            switch(ran){
                // EAST
                case 0:
                    setRotation(0);
                    move(150);
                    break;
                //WEST
                case 1:
                    setRotation(90);
                    move(150);
                    break;
                //NORTH
                case 2:
                    setRotation(180);
                    move(150);
                    break;
                //SOUTH
                case 3:
                    setRotation(270);
                    move(150);
                    break;
            }
            
            countWalk = 0;
        }
        
        countWalk++;
    }
}
