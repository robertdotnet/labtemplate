import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Random_masini here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Random_masini  
{
    int[] init={0,1,2,3,0,1,2,3,0,1,2,3,0,1,2,3};
    private int anterior=0;
    int[] contor={1,1,1,1};
   
    public Random_masini()
    {
        
    }
    
    int calcul()
    {   int index=0;
        Vector <Integer> a=new Vector();
        for(int i=0;i<4;i++)
            for(int j=0;j<contor[i];j++)
                a.add(i);
        int size=a.size();
        
        int aux=Greenfoot.getRandomNumber(size);
        aux=a.get(aux);
        for(int i=0;i<4;i++)
            {contor[i]++;
             }
        System.out.println("\0");
        contor[aux]=0;
        return aux;
    }
    
    
    
    int random()
    {   int i=0,aux=1;
        while(aux!=anterior)
         { i = Greenfoot.getRandomNumber(15);
          aux=init[i];
        }
         shuffle(i,aux);
        return aux;
    }
    
    
    
    void shuffle(int i, int aux)
    {
        for(i=0;i<12;i++)
            init[i]=init[i+3];
         for(int j=0;j<4;j++)
            if(j!=aux)
               {init[i]=j;
                   j++;
                }
    }
   
  
}
