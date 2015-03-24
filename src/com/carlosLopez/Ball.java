package com.carlosLopez;

import java.awt.*;

/**
 * Created by Lope on 3/21/2015.
 */


public class Ball { // just storing data about the ball not actually modifing it.
    // lets define the necessary components.

    // side of ball 
    private  int ballSize ;
    
    // declare that current cordinates x,y  
    private  double ballPOSx;
    private double ballPOSy;

    //ball color 
    private Color ballColor;

// declare ballspeed because it needs a speed to move as well as a direction
     double ballSpeed;

    //declare ball direction
double ballDirection;
    // ball needs a direction to move
    void move(){
ballPOSx = ballPOSx + (ballSpeed * Math.cos(ballDirection));
        ballPOSy= ballPOSy + (ballSpeed * Math.sin(ballDirection));

    }







    // when constructing the ball this below determines what the ball will need.
    // this is the METHOD to do so...
    public Ball(double ballPOSx, double ballPOSy, Color ballColor) {
    this.ballSize  = 25; 
        this.ballPOSx = ballPOSx;
        this.ballPOSy = ballPOSy;
        this.ballColor = ballColor; 
        this.ballSpeed = 5;
        this.ballDirection = Math.PI +1;
    }

    public Color getBallColor() {
        return ballColor;
    }

    public int getBallPOSx() { //converting to in when called as gotBallPOSx
        return (int) ballPOSx;
    }

    public int getBallPOSy() {
        return (int) ballPOSy; // converting to an int when called as getBallPOSy
    }

    public int getBallSize() {
        return ballSize;
    }
}
