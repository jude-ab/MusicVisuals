package c19366991;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class MyVisual extends Visual
{   
     
    stars cl;
    squares sq; 
    snow st;  

    //to choose both
    boolean both = false;
    int bothcount = 0;
    boolean choice = true; 

    //strength of spectrum
    float s = 0.10f; 

    Menu mn; 

    snow[] stars = new snow[200];
    int numstars;

    public void settings()
    {
        //use P3D for 3D graphics
        //setting screen size 
        size(800, 800, P3D); 
    }

    

    int state = 0; 

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().play();
            state = 1; 
        }

        if (key == '1')
        {
            state = 2; //circle
        }

        if (key == '2')
        {
            state = 3; //stars
        }

        if (key == '3')
        {
            state = 4; //squares 
        }

        if(key == '4')
        {
            state = 5; //both stars and circle 
        }

        if (key == 'p')///to pause song
        {
            getAudioPlayer().pause();
            state = 6;
        }

        if(key == 'm')//menu
        {
            state = 7;
        }

                
    }


    public void setup()
    {
        colorMode(HSB); 
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("ice.mp3"); 

        
        cl = new stars(this);
        sq = new squares(this, random(0, 100), height / 2); 
        mn = new Menu(this);
    
        numstars = 200;
        for(int i = 0; i < numstars; i++)
        {
            stars[i] = new snow(this); 
            
         
        }

    }


    public void draw()
    {
        background(0);
        calculateFrequencyBands(); 
        calculateAverageAmplitude(); 

        try
        {
            
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
 
        if(state == 7){
            
            mn.display(); 
        }

        if(state == 2){

          

            cl.display(); 
        }

       
        if(state == 3){


            for(int i = 0; i < numstars; i++)
            {
                stars[i].display(); 
                stars[i].update();
            
            }
        }


        if(state == 4){

            calculateAverageAmplitude();

            
            //use bands to see a block with sin wave in the middle
            /* try
            {
                calculateFFT();
            }
            catch(VisualException e)
            {
                e.printStackTrace();
            }
            calculateFrequencyBands();
            float[] bands = getSmoothedBands();
            
            sq.display(bands[7]); */

            //use Amplitude to see only sin waves 
            sq.display(getAmplitude() / 15.0f); 
        }

        if(state == 5)
        {

            cl.display();
            for(int i = 0; i < numstars; i++)
            {
                stars[i].display(); 
                stars[i].update();

            }

        }


       
 }



}
