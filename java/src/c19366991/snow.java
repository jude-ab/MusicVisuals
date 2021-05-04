package c19366991;

import processing.core.PApplet;

public class snow {

    MyVisual mv; 
    int numsnows;
    snow[] snow = new snow[400];   
    float y;
    float x;
    float z;
    float max = 1000;
    float start = -1000;
 
    

    public snow(MyVisual mv){

        this.mv = mv; 
        y = mv.random(-mv.height, mv.height);
        x = mv.random(-mv.width, mv.width);
        z = mv.random(mv.width); 
        
    }

    public void update(){

        z = z - 10;

        if(z < 1){

            z = mv.width;
            y = mv.random(-mv.height, mv.height);
            x = mv.random(-mv.width, mv.width);
        }
    }

    public void display(){

        
        mv.fill(255);
        mv.stroke(48, 139, 206);

        float sx = PApplet.map(x / z, 0, 1, 0, mv.width);
        float sy = PApplet.map(y / z, 0, 1, 0, mv.height);

        float n = PApplet.map(z, 0, mv.width, 16, 0);
        mv.ellipse(sx, sy, n, n);

        
        y += ((max * mv.getAmplitude()) * 0.2f);
        if (y >= max)
        {
            y = start;
        }
        
    }


}
