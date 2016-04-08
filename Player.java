import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    GreenfootImage player = new GreenfootImage("Player_pallette_outline.png");
    int Height = 16;
    int Width = 16;
    int count_ = 0;
    boolean df1 = false;
    boolean df2 = false;
   
    public void act() 
    
    {        
        
        background level = (background)this.getWorld();
        
        int rN = level.getRandomNumberRange(1,100);
        
        if (!df1)
        
        {
            
            setImage(player);
            player.scale(16*4, 16*4);
            df1 = true;
            
        }

        
            if ((Greenfoot.isKeyDown("1")) && (!(df2)))
            
            {

                count_ = (count_ + 1) % 10001;
            if (level.turn)
            
            {
                
               if (count_ == 10000)
                
               {
                    if (rN > 45)
                    
                    {                
                        
                        level.addObject(new Fire_Spell_Start_Phase(), 100, 200);
                        
                        level.hit = true;                                       
                        
                        df2 = true;             
                        
                    }
                    
                    else if (rN <= 45)
                    
                    {
                        
                        level.addObject(new Fire_Spell_Start_Phase(), 100, 200);
                        
                        level.miss = true;
                                                                
                        df2 = true;
                        
                    }
               } 
            }       
            
        }
        
        else if ((!(Greenfoot.isKeyDown("1"))) && (df2))
        
        {
            
            df2 = false;
            
        }        
        
    }    
        
    public void scale(int width, int height)
    {
        
    }
    
    public int getHeight()
    {
        return Height;
    }
    public int getWidth()
    {
        return Width;
    }
}
