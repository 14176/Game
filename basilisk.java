import greenfoot.*;

/**
 * Write a description of class alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class basilisk extends Actor
{
    private int komatsuna=0;
    
    public void act()
    {
        move();
        eaten();
        eat();
    }
 
    public void move() 
    {




        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(5);

    }// Add your action code here.



        // Add your action code here.

    //    }// Add your action code here.

        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(5);
        }
        
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(5);
        }
        
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(5);
        }



    }    
    
    public void eaten(){
      Actor actor = getOneObjectAtOffset( 0, 0, snake.class ); 
      Actor basilisk = getOneObjectAtOffset( 0, 0, basilisk.class ); 
      if( actor != null ){ 
              getWorld().removeObject( basilisk );
              getWorld().showText("　　eat", 100, 50); 
              Greenfoot.stop();           
      }
    }
    
    public void eat(){
        Actor actor2 = getOneObjectAtOffset( 0, 0, komatsuna.class ); 
        
        getWorld().showText(""+komatsuna, 50, 550);
        if( actor2 != null){
            komatsuna++;
            if(komatsuna == 1)
            {
                getWorld().removeObject( actor2 );
                getWorld().showText("           ポイントアップ!", 100, 50);
            }
            if(komatsuna == 2)
            {
                getWorld().removeObject( actor2 );
                getWorld().showText("           ポイントアップ!!!!!!!!!!!!", 100, 50);
            }
        }
    }
   
    
}
