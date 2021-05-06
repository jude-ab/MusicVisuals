# Music Visualiser Project

Name: Jude Abouhajar

Student Number: C19366991

# Description of the assignment
For this assignment, I wanted to create visuals that correspond to a piece of music that I chose from a figure skating performance. I created 4 new java classes other than MyVisual.java. These visuals respond to the beat of the music. There are 4 themes to choose from; snow, stars, squares in waves and lastly, the user also has the option of choosing both the stars and snow visuals to play at the same time. There is also a menu that the user can access where all the options and instructions are displayed.

The stars visual consists of a circle made up of many smaller circles that takes up the whole screen and give the illusion of stars. The small circles within the big circle shrink and expand depending on the amplitude. The snow visual is made up of a black background with “snow” dropping from the top of the screen. The speed of the falling snow also depends on the amplitude. Lastly, the wave visual consists of many squares of random colours in a sin wave that moves to the music horizontally across the screen. The waves expand and contract to the music. I chose to design this visual as it reminds me of the marks left on the ice from the ice skates. The last theme shows the stars and snow visual together to give the user an illusion of a winter’s night sky. I chose to implement the stars and snow visuals as I felt that it really suits the music I chose especially with how delicate the stars look against the black background. 


# Instructions
•	Download the repository.
•	Open the folder in Visual Studio Code.
•	Run from Main.java in ie/tudublin. 
•	Press M to view the menu:
		o Space: play the music.
		o P: Pause.
		o Press 1: play stars visual.
		o Press 2: play snow visual.
		o Press 3: play the wave visual.
		o Press 4: play both the stars and snow visual. 
		
•	Code for the options:

```Java
public void keyPressed()	{
        if (key == ' ')
        {
            getAudioPlayer().play();
            state = 1; 
        }

        if (key == '1')
        {
            state = 2; //stars
        }

        if (key == '2')
        {
            state = 3; //snow
        }

        if (key == '3')
        {
            state = 4; //squares 
        }

        if(key == '4')
        {
            state = 5; //both stars and snow 
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
```

# How it works
•All the visuals that I designed run through MyVisual.java in the package C19366991. When looking through MyVisual.java, you can see that I included constructors for the visuals that I called in setup(). This was included to create the visuals from inside the draw function. The display functions are called here for each of the visuals.

•I also added an alternative for the wave visual, so if you wish to see the “waves” in a block with a single sin wave in the middle, you uncomment lines 141-155 (calculatefFrequencyBands( );). 

•When the user presses the space bar, the music starts playing in the background while the visuals responded to the music. 



# What I am most proud of in the assignment
I am proud of how in the end all the visuals came out as planned and how much I’ve learned about processing while doing this assignment. I learned many interesting new ideas and concepts such as:
	• Use of radians.
	• How to get an object to react to the beat of the music.
	• Using mathematical concepts in processing.
	• How push and pop matrix work.
	• Difference between using bands and amplitude. 
	
Mainly, I am proud of how I got the squares in the waves and the stars visualisation to work after doing some research on processing.org and learning about concepts I didn’t get a chance to in class, in order to implement my designs. It took me a while to finish everything but I am proud with how everything turned out. All in all, I really had fun working on this assignment, seeing my progress and just enjoying the process.  



Youtube video:

[![YouTube](https://youtu.be/2IzP3PfdiKQ)


