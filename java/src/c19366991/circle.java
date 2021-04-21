package c19366991;

import processing.core.*;


public class circle {

    MyVisual mv; 

    public circle(MyVisual mv) {

        this.mv = mv; 
    }

    public void display() {

        mv.stroke(mv.color(255,  100 - (500 * mv.getAmplitude())));
       mv.strokeWeight(1 + (mv.getAmplitude() * 10));
        mv.fill(PApplet.map(mv.getAmplitude() * 255, 0, 255, mv.fBase, mv.fSet), 255, 255, mv.getAmplitude() * 100);

        mv.fill(PApplet.map(mv.getAmplitude() * 255, 0, 255, mv.fBase, mv.fSet), 255, 255, mv.getAmplitude() * 100);
        mv.ellipse(mv.width / 2, mv.height / 2, 200 + (1000 * mv.getAmplitude()), 400);
        mv.ellipse(mv.width / 2, mv.height / 2, 200 + (1200 * mv.getAmplitude()), 400);
        mv.ellipse(mv.width / 2, mv.height / 2, 200 + (1400 * mv.getAmplitude()), 400);

        
        mv.fill(PApplet.map(mv.getAmplitude() * 255, 0, 255, mv.fBase, mv.fSet), 255, 255, mv.getAmplitude() * 100);
        mv.ellipse(mv.width / 2, mv.height / 2, 300 + (300 * mv.getSmoothedAmplitude()), 300 + (300 * mv.getSmoothedAmplitude()));

    }

}