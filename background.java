import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    boolean turn = true;
    boolean hit = false;
    boolean miss = false;
    boolean fssp = false;
    int count_ = 0;

    
    public background()
    {    
        
        super(600, 400, 1);
        
        addObject(new Player(), 100, 200);
        
        addObject(new Enemy(), 500, 200);
        
    }
    
    public void act()
    {
        if ((turn) && (hit))
        
        {
            
                if (fssp)
                
                {             
                    
                    if (count_ == 20000)
                    
                    {
                        addObject(new Fire_Spell(), 500, 200);
                        
                        
                        hit = false;
                        
                        fssp = false;
                    }
                    
                    count_ = (count_ + 1) % 20001;
                }
                
        }        
        
       
        if ((!(turn)) && (hit))
            
        {
                                
                if (fssp)
                
                {
                    
                    if (count_ == 20000)
                    
                    {
                        addObject(new Fire_Spell(), 100, 200);
                        
                        hit = false;
                        
                        fssp = false;
                        
                    }
                    
                    count_ = (count_ + 1) % 20001;
                    
                }
                                        
        }
        
        if (miss)
        
        {
            
            if (fssp)
            
            {
                
                    if (count_ == 20000)
                    
                    {
                        
                    if (turn)
                    
                    {
                        
                     turn = false;
                     fssp = false;
                     miss = false;
                     
                    }
                    
                    else if (!(turn))
                    
                    {
                        
                     turn = true;
                     fssp = false;
                     miss = false;
                     
                    }
                    
                }
                
                count_ = (count_ + 1) % 20001;
            }
            
        }
                
    }
    
    public static int getRandomNumberRange(int start, int end)
    
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
}
