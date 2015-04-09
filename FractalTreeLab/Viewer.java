//********************************************************************
//  KochSnowflakeViewer.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of recursion.
//  @gcschmit (19 July 2014): converted from an applet to an application
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Viewer
{
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;

    private final int MIN = 0, MAX = 20;



   
    private TreePanel drawing;
    private JPanel panel;
    private JFrame frame;
    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Viewer viewer = new Viewer();
    }

    public Viewer()
    {
        

        drawing = new TreePanel();

        panel = new JPanel();
        
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Knoch Snowflake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

    //-----------------------------------------------------------------
    //  Determines which button was pushed, and sets the new order
    //  if it is in range.
    //-----------------------------------------------------------------
}
