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

 

    

    private int rtime,s1,s2;

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
        rtime = 12000;

        s1 = 60;
        s2 = 60;

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
        
        if(rtime % 100 == 0){
        s1--;
    }
        if(rtime >= 11900){
        showText("2:00", 900, 100);
    }
    if(rtime >= 7000 && rtime <= 11900){
                
               showText("1:"+s1, 900, 100);
            }
    if(rtime >= 6000 && rtime <= 6900){
         showText("1:0"+s1, 900, 100);
     
        }
    if(rtime >= 1000 && rtime <= 5900){
        
                    if(rtime % 100 == 0){
                    s2--;
                }
                
                    showText("0:"+s2, 900, 100);
                }
    if(rtime >= 0 && rtime <= 900){
        
                    if(rtime % 100 == 0){
                    s2--;
                }
                
                    showText("0:0"+s2, 900, 100);
                }
                
            
    

    
    
       
        


       //showText(+point+"pt", 100, 80);
        if(basilisk.komatsuna == 0){
                showText("GetPoint : "+point+"pt", 100, 100);
            }else if(basilisk.komatsuna == 1){
                point += 30;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("いいね!", 100, 70);
            }else if(basilisk.komatsuna == 2){
                point += 60;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("その調子だ!", 100, 70);
            }else if(basilisk.komatsuna == 3){
                point += 90;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("やるじゃん!", 100, 70);
            }else if(basilisk.komatsuna == 4){
                point += 120;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("すごいね!！", 100, 70);
            }else if(basilisk.komatsuna == 5){
                point += 150;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("瞬足だね!", 100, 70);
            }else if(basilisk.komatsuna == 6){
                point += 180;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("油断しないで!", 100, 70);
            }else if(basilisk.komatsuna == 7){
                point += 210;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("無理しないで!", 100, 70);
            }else if(basilisk.komatsuna == 8){
                point += 240;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("逃げ切るんだ!", 100, 70);
            }else if(basilisk.komatsuna == 9){
                point += 270;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("最高だね!", 100, 70);
            }else if(basilisk.komatsuna == 10){
                point += 300;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("才能あるね!", 100, 70);
            }else if(basilisk.komatsuna == 11){
                point += 330;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("あとちょっと！", 100, 70);
            }else if(basilisk.komatsuna == 12){
                point += 360;
                showText("GetPoint : "+point+"pt", 100, 100);
                showText("やるね!", 100, 70);
            }


           

        if(rtime <= 0){
            showText("逃走成功！！！", 500,450);
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

