package c19366991;

import processing.core.PApplet;

public class Menu {

    MyVisual mv; 

    public Menu(MyVisual mv) {

        this.mv = mv; 
    }

    public void display() {

        mv.frameRate(60);
        mv.background(0);
        mv.fill(PApplet.map(mv.getSmoothedAmplitude(), 0, 1, 0, 360), 255, 255);
        mv.textSize(25);
        mv.textAlign(PApplet.CENTER, PApplet.CENTER);
        mv.text("MENU\n\nWelcome to the sound visualisation of INSERT SONG\n\nPress the Space Bar to play the song \n\n Press m when you wish to view this menu again.\n\n Or p if you wish to pause.\n\nPress 1: Circle visualisation. \nPress 2: Stars visualisation. \nPress 3: Squares visualisation. \nPress 4: to see both stars and circle visualisation. \n\nEnjoy!", mv.width / 2, mv.height / 2);
    
    }

}


