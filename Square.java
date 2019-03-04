import javax.swing.*;
import java.awt.*;

public class Square extends Components{
    
    void addBlackSquare(int x, int y, int z){
        ImageIcon black = new ImageIcon("empty2.png");
        blackSquare = new JButton(black);
        blackSquare.setBounds(x, y, z, z);
        boardPane.add(blackSquare, new Integer(1));
    }

    void addWhiteSquare(int x, int y, int z){
        ImageIcon white = new ImageIcon("empty.png");
        whiteSquare = new JButton(white);
        whiteSquare.setBounds(x, y, z, z);
        boardPane.add(whiteSquare, new Integer(1));
    }

    void createBoard(int sizeLength){

        Square square = new Square();

        int x = 0;
        int y = 8;
        int xcoord = 0;
        int ycoord = 0;
        int[] squareArray = new int[64];

        for(int i = 0; i < 64; i++){
            squareArray[i] = i;
        }

        for(int j = 0; j < 8; j++){
            for(int i = x; i < y; i++){
                if (squareArray[i] % 2 == 0){
                    square.addWhiteSquare(xcoord, ycoord, sizeLength);
                    xcoord = xcoord + sizeLength; 
                }
                else{
                    square.addBlackSquare(xcoord, ycoord, sizeLength);
                    xcoord = xcoord + sizeLength;
                }
            }
            x++;
            y++;
            ycoord = ycoord + sizeLength;
            xcoord = 0;
        }
    }
}