package com.carlosLopez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {


    // build a window to display the ball object

    // set the screensize
    static int screensize = 300;

    public static void main(String[] args) {

        // here is where the  game functions/runs

        // create a new ball object and pass it the starting position
        final Ball ballObject = new Ball(screensize / 2, screensize / 2, new Color(173, 17, 23));

        // draw the ball on the screen using gameDisplay and passing it the ball object to draw.
        final GameDisplay gameDisplay = new GameDisplay(ballObject);


        // setup the layout of the window
        gameDisplay.setLayout(new BorderLayout());

        final JFrame gameWindow = new JFrame();
        gameWindow.setUndecorated(true);


        // exit the game when the window is closed to free up resources.
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



       // set the content in the gamewindow to display the game
        gameWindow.setContentPane(gameDisplay);


       // set the size of the screen
        gameWindow.setSize(screensize, screensize);

// set the window to visible so the player can see the game
        gameWindow.setVisible(true);



        //ballDirection = Math.PI + 1; //from previous code
        ActionListener screenRefresher = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ballObject.move(); // call the method in the ball class to move the ball.
                gameDisplay.repaint(); // every second the timer ticks redraw the image on the screen.
            }
        };
        Timer timer = new Timer(75, screenRefresher); // time
        timer.start();
    }




}

