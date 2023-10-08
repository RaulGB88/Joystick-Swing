package org.granel.joystick.events;

import org.granel.joystick.forms.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEM implements ActionListener {
    // Referencia al igu
    private final GUI gui;

    public AEM(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Call some method of GUI
        gui.execEvent(e);
    }

}
