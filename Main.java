import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String[] args){
        Frame mainFrame = new Frame();
        Board boardPane = new Board();
        Square square = new Square();
        Pieces piece = new Pieces();
        mainFrame.frameSetup(700);
        boardPane.boardSetup(640);
        square.createBoard(80);
        piece.iniWhite(80);
        piece.iniRed(80);
    }
}