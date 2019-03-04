import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        Frame mainFrame = new Frame();
        Board boardPane = new Board();
        Square square = new Square();
        mainFrame.frameSetup(400);
        boardPane.boardSetup(400);
        square.createBoard(40);
    }
}