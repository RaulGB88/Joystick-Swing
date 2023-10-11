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
	JButton btnUp;
//    JButton btnDown;
//    JButton btnRight;
//    JButton btnLeft;
	private JPanel pnlGame;
	private JButton btnNewButton;
	private JButton btnLeft;
	private JButton btnDown;
	private JButton btnRight;

	public GUI() {

		// Init components.
		initComponents();
	}

	// Construcción del IGU
	private void initComponents() {

		Dimension dimSec = new Dimension(100, 100);
		Dimension dimPal = new Dimension(800, 800);

		AEM aem = new AEM(this);
		GridBagConstraints c = new GridBagConstraints();

		// Panel Pnal
		pnlPnal = new JPanel();
		GridBagLayout gbl_pnlPnal = new GridBagLayout();
		gbl_pnlPnal.columnWidths = new int[] { 343, 100, 0 };
		gbl_pnlPnal.rowHeights = new int[] { 500, 100, 0 };
		gbl_pnlPnal.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlPnal.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		pnlPnal.setLayout(gbl_pnlPnal);
		// nlPnal.add(pnlCube);

		// Ventana principal
		this.setTitle("Juego Joystick");
		this.setContentPane(pnlPnal);

		// Panel Joystick
		pnlJoystick = new JPanel();
		pnlJoystick.setPreferredSize(dimSec);

		// initButtons(pnlJoystick, c, aem);
		//
		GridBagConstraints gbc_pnlJoystick = new GridBagConstraints();
		gbc_pnlJoystick.insets = new Insets(0, 0, 5, 0);
		gbc_pnlJoystick.gridx = 0;
		gbc_pnlJoystick.gridy = 1;
		pnlPnal.add(pnlJoystick, gbc_pnlJoystick);
		pnlJoystick.setLayout(new BorderLayout(0, 0));

		btnNewButton = new JButton("New button");
		pnlJoystick.add(btnNewButton, BorderLayout.NORTH);

		btnLeft = new JButton("New button");
		pnlJoystick.add(btnLeft, BorderLayout.WEST);

		btnDown = new JButton("New button");
		pnlJoystick.add(btnDown, BorderLayout.EAST);

		btnRight = new JButton("New button");
		pnlJoystick.add(btnRight, BorderLayout.SOUTH);

		pnlGame = new JPanel();
		GridBagConstraints gbc_pnlGame = new GridBagConstraints();
		gbc_pnlGame.gridwidth = 0;
		gbc_pnlGame.insets = new Insets(0, 0, 0, 5);
		gbc_pnlGame.fill = GridBagConstraints.BOTH;
		gbc_pnlGame.gridx = 0;
		gbc_pnlGame.gridy = 0;
		pnlPnal.add(pnlGame, gbc_pnlGame);

		this.setSize(VENTANA_ANC, VENTANA_ALT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Init buttons
	private void initButtons(JPanel panel, GridBagConstraints c, ActionListener aem) {

//        btnUp = new JButton("▲");
//        c.ipady = 40;      //make this component tall
//        c.gridx = 1;
//        c.gridy = 1;
//        c.weightx = 0.0;
//        c.gridheight = 1;
//        c.gridwidth = 1;
//        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//        c.insets = new Insets(10, 0, 0, 0);  //top padding
//        panel.add(btnUp, c);
//
//        btnLeft = new JButton("◄");
//        c.ipady = 40;      //make this component tall
//        c.gridx = 0;
//        c.gridy = 2;
//        c.weightx = 0.0;
//        c.gridwidth = 1;
//        panel.add(btnLeft, c);
//
//        btnDown = new JButton("▼");
//        c.ipady = 40;
//        c.gridx = 1;       //aligned with button 2
//        c.gridy = 2;       //third
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.0;
//        c.gridwidth = 1;
//        panel.add(btnDown, c);
//
//        btnRight = new JButton("►");
//        c.ipady = 40;
//        c.gridx = 2;
//        c.gridy = 2;
//        c.weightx = 0.0;
//        c.gridwidth = 1;
//        panel.add(btnRight, c);
//
//        // Add buttons Litener.
//        btnUp.addActionListener(aem);
//        btnDown.addActionListener(aem);
//        btnRight.addActionListener(aem);
//        btnLeft.addActionListener(aem);
	}

	// Get and control the events.
	public void execEvent(ActionEvent e) {

//        if (e.getSource().equals(btnUp)) {
//            //up
//            pnlCube.setAlignmentX(+10);
//            pnlCube.setBackground(Color.black);
//        } else if (e.getSource().equals(btnDown)) {
//            //down
//            pnlCube.setAlignmentX(-10);
//            pnlCube.setBackground(Color.blue);
//        } else if (e.getSource().equals(btnRight)) {
//            //right
//            pnlCube.setAlignmentY(+10);
//            pnlCube.setBackground(Color.yellow);
//        } else if (e.getSource().equals(btnLeft)) {
//            //left
//            pnlCube.setAlignmentY(-10);
//            pnlCube.setBackground(Color.green);
//        }
	}

}
