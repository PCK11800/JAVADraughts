import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareActionListener extends Components implements ActionListener{

    blackSquare.addActionListener(this);
    whiteSquare.addActionListener(this);


    public void actionPerformed(ActionEvent e){
        if (e.getSource() == whiteSquare){
            System.out.println("White");
        }
        else if (e.getSource() == blackSquare){
            System.out.println("Black");
        }
    }
}