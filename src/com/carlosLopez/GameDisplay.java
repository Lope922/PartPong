package com.carlosLopez;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lope on 3/21/2015.
 */
public class GameDisplay extends JPanel{

    // let the program know that GameDisplay is going to have a
  private   Ball ball; // stating that ball is a object ball and of the type ball
// this also allows the GameDisplay class to have access to the ball.


//constructor
    GameDisplay(Ball ball){
        this.ball = ball; // saying that the game display method is getting passed a ball
    // and allowing access to the ball object information.
    }



// need to tel it what to draw

    @Override
    public void paintComponent(Graphics graphics){ // the purpose of the paint component is to draw on this Jpanel canvas
        super.paintComponent(graphics);
// get a color to paint the ball
        Color ballColor = ball.getBallColor();

        graphics.setColor(ballColor);

        // get cordiantes for the ball x and y

        //telling graphics to draw me an oval, it is getting passed the required arguments needed to draw a circle.
        graphics.drawOval(ball.getBallPOSx(),ball.getBallPOSy(),ball.getBallSize(),ball.getBallSize());

        int ballPosX = ball.getBallPOSx();
        int ballPosY = ball.getBallPOSy();
        int ballSize = ball.getBallSize();
       // Color balltempColor = ball.getBallColor();

// fill the oval to make a circle with the arguments defined above.
        graphics.fillOval(ballPosX,ballPosY,ballSize,ballSize);
        // another way to do the same thing
//        graphics.setColor(ball.getBallColor());



        // make an instance of the object in main. That will execute this method to the end.

    }


}
