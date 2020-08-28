package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.Random;


public class GameCanvas extends JPanel {

    private long lastFrameTime;
    private Main controller;
    private Color Graphics;


    GameCanvas(Main controller) {
        this.controller = controller;
        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            long currentTime = System.nanoTime();
            float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
            controller.onDrawFrame(this, g, deltaTime);
            lastFrameTime = currentTime;
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint();
        }

    public int getLeft() {
        return 0;
    }

    public int getRight() {
        return getWidth() - 1;
    }

    public int getTop() {
        return 0;
    }

    public int getBottom() {
        return getHeight() - 1;
    }





   //{
   //        public paintComponent()
   //        {
   //            super();
   //            this.setOpaque(true);
   //            this.setBackground(Color.green);
   //        } public class paintComponent extends JPanel


    //{Random rn = new Random();
    //        Color c = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
    //        Graphics2D g2d = (Graphics2D) g;

}
