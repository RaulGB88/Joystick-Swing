package org.granel.joystick.forms;

import org.granel.joystick.events.AEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    // Tamaño de la ventana
    public static final int VENTANA_ANC = 800;
    public static final int VENTANA_ALT = 800;

    int mov = 10;
    JPanel pnlPnal;
    JPanel pnlJoystick;
    JPanel pnlCube;
    JButton btnUp;
    JButton btnDown;
    JButton btnRight;
    JButton btnLeft;

    public GUI() {

        // Init components.
        initComponents();
    }

    // Construcción del IGU
    private void initComponents() {

        Dimension dimSec = new Dimension(100, 100);
        Dimension dimPal = new Dimension(800, 800);

        AEM aem = new AEM(this);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        // Panel Pnal
        pnlPnal = new JPanel();

        // Panel Cube
        pnlCube = new JPanel();
        pnlCube.setBackground(Color.red);
        pnlCube.setPreferredSize(dimSec);

        // Panel Joystick
        pnlJoystick = new JPanel();
        pnlJoystick.setLayout(layout);
        pnlJoystick.setPreferredSize(dimSec);
        pnlJoystick.add(pnlCube);

        initButtons(pnlJoystick, c, aem);

        pnlPnal.add(pnlJoystick);
        //nlPnal.add(pnlCube);

        // Ventana principal
        this.setTitle("Juego Joystick");
        this.setContentPane(pnlJoystick);
        this.setSize(VENTANA_ANC, VENTANA_ALT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Init buttons
    private void initButtons(JPanel panel, GridBagConstraints c, ActionListener aem) {

        btnUp = new JButton("▲");
        c.ipady = 40;      //make this component tall
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        //c.insets = new Insets(10, 0, 0, 0);  //top padding
        panel.add(btnUp, c);

        btnLeft = new JButton("◄");
        c.ipady = 40;      //make this component tall
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.0;
        c.gridwidth = 1;
        panel.add(btnLeft, c);

        btnDown = new JButton("▼");
        c.ipady = 40;
        c.gridx = 1;       //aligned with button 2
        c.gridy = 2;       //third
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.gridwidth = 1;
        panel.add(btnDown, c);

        btnRight = new JButton("►");
        c.ipady = 40;
        c.gridx = 2;
        c.gridy = 2;
        c.weightx = 0.0;
        c.gridwidth = 1;
        panel.add(btnRight, c);

        // Add buttons Litener.
        btnUp.addActionListener(aem);
        btnDown.addActionListener(aem);
        btnRight.addActionListener(aem);
        btnLeft.addActionListener(aem);
    }

    // Get and control the events.
    public void execEvent(ActionEvent e) {

        if (e.getSource().equals(btnUp)) {
            //up
            pnlCube.setAlignmentX(+10);
            pnlCube.setBackground(Color.black);
        } else if (e.getSource().equals(btnDown)) {
            //down
            pnlCube.setAlignmentX(-10);
            pnlCube.setBackground(Color.blue);
        } else if (e.getSource().equals(btnRight)) {
            //right
            pnlCube.setAlignmentY(+10);
            pnlCube.setBackground(Color.yellow);
        } else if (e.getSource().equals(btnLeft)) {
            //left
            pnlCube.setAlignmentY(-10);
            pnlCube.setBackground(Color.green);
        }
    }

}
