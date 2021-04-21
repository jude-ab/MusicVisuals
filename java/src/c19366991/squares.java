package c19366991;

import processing.core.PApplet;

public class squares {

    MyVisual mv; 
    float a = 0.0f;
    float L; 
    float centery, startx;
  
    public squares(MyVisual mv, float startx, float centery)
    {  
        this.mv = mv; 
        this.startx = startx;
        this.centery = centery;
    }
  
    public void display(float L)
    {

      

      for (int startx = 0; startx < mv.width; startx+=2)
      {
        mv.strokeWeight(1);
        mv.stroke(255, 100); 
        mv.fill(mv.random(255), mv.random(190), mv.random(220), mv.random(200));
  
        float randomS = mv.random(1, 25);
        float randomY = mv.random(200, 300);
        //a random sine wave pattern
        mv.rect(startx, centery + PApplet.sin(a) * randomY, randomS, randomS);
  
        
        a += L;
        
      }
    }
  }