import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FramePet extends JFrame {
    private PetStatus myPet;
    private JLabel statusLabel;
    public FramePet(){
        setFrame();
        PanelManager PanelManager = new PanelManager(this);
    }

    public void setFrame() {
        setSize(PetConstants.WINDOW_WIDTH, PetConstants.WINDOW_HEIGHT);
        setTitle("Pet A Pet");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
