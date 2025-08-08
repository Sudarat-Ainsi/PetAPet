import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class PanelManager {
    private FramePet mainFrame;

    public PanelManager(FramePet frame) {
        this.mainFrame = frame;
    }

    public JPanel panel_center() {
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.CYAN);
        panelCenter.setLayout(new BorderLayout());

        

        return panelCenter;
    }
}
