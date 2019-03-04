import javax.swing.*;
import java.awt.*;

public class Frame extends Components{
   
    void frameSetup(int x){
        mainFrame.setVisible(true);
        mainFrame.setSize(x, x);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(boardPane);
    }

}