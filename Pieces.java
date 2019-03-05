import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pieces extends Components{

    void addRedPiece(int x, int y, int z){
        ImageIcon red = new ImageIcon("red.png");
        JButton redPiece = new JButton(red);
        boardPane.add(redPiece, new Integer(3));
        redPiece.setBounds(x, y, z, z);
        redPiece.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x_pos = redPiece.getLocation().x;
                int y_pos = redPiece.getLocation().y;
                ImageIcon yellow = new ImageIcon("selected.png");
                for(int i = 0; i < 4; i++){
                    JButton selected = new JButton(yellow);
                    boardPane.add(selected, new Integer(2));
                    if(i == 0){
                        selected.setBounds((x-z), (y-z), z, z);
                    }
                    else if(i == 1){
                        selected.setBounds((x+z), (y-z), z, z);
                    }
                    else if(i == 2){
                        selected.setBounds((x-z), (y+z), z, z);
                    }
                    else if(i == 3){
                        selected.setBounds((x+z), (y+z), z, z);
                    }
                    selected.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                            int xS_pos = selected.getLocation().x;
                            int yS_pos = selected.getLocation().y;
                            redPiece.setBounds(xS_pos, yS_pos, z, z);
                        }
                    });
                }
            }
        });
    }

    void addWhitePiece(int x, int y, int z){
        ImageIcon white = new ImageIcon("white.png");
        JButton whitePiece = new JButton(white);
        boardPane.add(whitePiece, new Integer(3));
        whitePiece.setBounds(x, y, z, z);
    }

    void iniRed(int sizeLength){
        Pieces piece = new Pieces();
        piece.addRedPiece(80, 560, sizeLength);
        piece.addRedPiece(240, 560, sizeLength);
        piece.addRedPiece(400, 560, sizeLength);
        piece.addRedPiece(560, 560, sizeLength);
        piece.addRedPiece(0, 480, sizeLength);
        piece.addRedPiece(160, 480, sizeLength);
        piece.addRedPiece(320, 480, sizeLength);
        piece.addRedPiece(480, 480, sizeLength);
        piece.addRedPiece(80, 400, sizeLength);
        piece.addRedPiece(240, 400, sizeLength);
        piece.addRedPiece(400, 400, sizeLength);
        piece.addRedPiece(560, 400, sizeLength);
    }

}
