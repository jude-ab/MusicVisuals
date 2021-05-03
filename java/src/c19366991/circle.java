package c19366991;

import processing.core.*;


public class circle {

    MyVisual mv;
    

    public circle(MyVisual mv) {

        this.mv = mv; 
    }

    public void setup() {
        mv.noLoop();
         
    }

    public void display() {
        

        mv.translate(mv.width/2, mv.height/2);

 
        float pstep = 30;
        float pmax = 800; 

        for (float p=0; p<pmax; p+=pstep) {

            float c = 2*3.14f*p; //circumference
            float csegment = PApplet.map(p, 0, pmax, pstep*3/4, pstep/2);
            float segment = (c/csegment); //angle segment
            float ellipseS = PApplet.map(p, 0, pmax, pstep*3/4-1, pstep/4); 

            for (float a=0; a<360; a+=360/segment) {

                mv.fill(mv.random(255), mv.random(190), mv.random(220));
                mv.noStroke();

                mv.pushMatrix();
                mv.rotate(PApplet.radians(a));
                mv.ellipse(p, 0, ellipseS*mv.getAmplitude(), ellipseS*mv.getAmplitude());
                mv.popMatrix();

            } 
        }

    }

}
