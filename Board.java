import javax.swing.*;
import java.awt.*;

public class Board extends Components{

    void boardSetup(int x){
        boardPane.setBounds(0, 0, x, x);
        boardPane.setOpaque(false);
    }
}