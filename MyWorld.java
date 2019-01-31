import greenfoot.*;

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

 

    
    private int rtime;
    private int x,y,X1,X2,Y1,Y2,point;
    

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        X1=0;
        X2=1000;
        Y1=0;
        Y2=900;
        rtime = 12000;
        point = 0;
        basilisk.komatsuna = 0;
        
        addObject( new basilisk(),475,475 );
        
        x = X1 + (int)(Math.random()*((X2-X1)+1)); 
        y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 
        addObject( new snake(),x,y );
        x = X1 + (int)(Math.random()*((X2-X1)+1)); 
        y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 
        addObject( new snake(),x,y );
        x = X1 + (int)(Math.random()*((X2-X1)+1)); 
        y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 
        addObject( new snake(),x,y );
        
    
    }
    
    public void act(){
        rtime--;
        point = (int)(12000 - rtime) / 100;
        showText(""+rtime, 50, 350);
        showText(+point+"pt", 100, 80);
        if(basilisk.komatsuna == 0){
                showText(+point+"pt", 100, 80);
            }else if(basilisk.komatsuna == 1){
                point += 30;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 2){
                point += 60;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 3){
                point += 90;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 4){
                point += 120;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 5){
                point += 150;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 6){
                point += 180;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 7){
                point += 210;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 8){
                point += 240;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 9){
                point += 270;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 10){
                point += 300;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 11){
                point += 330;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }else if(basilisk.komatsuna == 12){
                point += 360;
                showText(+point+"pt", 100, 80);
                showText("ポイントアップ!", 100, 50);
            }
     
        if(rtime <= 0){
            showText("クリア!!!!!!!!!!!!", 500,300);
            Greenfoot.stop();
        }
        if(rtime%1000 == 0)
        {
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 
            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 
            addObject( new snake(),x,y );   
        }
        if(rtime%1000 == 0)
        {
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 
            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 
            addObject( new komatsuna(),x,y ); 
            
        }
        if(rtime==3000)
        {
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 
            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 
            addObject( new komatsuna(),x,y );   
        }
    }
 
}

