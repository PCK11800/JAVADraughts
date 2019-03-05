import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pieces extends Components{

    void addRedPiece(int x, int y, int z){
        ImageIcon red = new ImageIcon("red.png");
        JButton redPiece = new JButton(red);
        boardPane.add(redPiece, new Integer(2));
        redPiece.setBounds(x, y, z, z);
    }

    void addWhitePiece(int x, int y, int z){
        ImageIcon white = new ImageIcon("white.png");
        JButton whitePiece = new JButton(white);
        boardPane.add(whitePiece, new Integer(2));
        whitePiece.setBounds(x, y, z, z);
    }

    void iniRed(int sizeLength){
        Pieces piece = new Pieces();
        piece.addRedPiece(0, 560, sizeLength);
        piece.addRedPiece(160, 560, sizeLength);
        piece.addRedPiece(320, 560, sizeLength);
        piece.addRedPiece(480, 560, sizeLength);
        piece.addRedPiece(80, 480, sizeLength);
        piece.addRedPiece(240, 480, sizeLength);
        piece.addRedPiece(400, 480, sizeLength);
        piece.addRedPiece(560, 480, sizeLength);
        piece.addRedPiece(0, 400, sizeLength);
        piece.addRedPiece(160, 400, sizeLength);
        piece.addRedPiece(320, 400, sizeLength);
        piece.addRedPiece(480, 400, sizeLength);
    }

}
