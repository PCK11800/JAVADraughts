import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pieces extends Components{
    int x_pos, y_pos;

    void addRedPiece(int x, int y, int z){
        ImageIcon red = new ImageIcon("red.png");
        JButton redPiece = new JButton(red);
        boardPane.add(redPiece, new Integer(3));
        x_pos = x;
        y_pos = y;
        redPiece.setBounds(x_pos, y_pos, z, z);
        redPiece.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                redPieceAction(x, y, z);
                    }
                });
            }

    void redPieceAction(int x, int y, int z){ 
        ImageIcon red = new ImageIcon("red.png");
        JButton redPiece = new JButton(red);
        ImageIcon yellow = new ImageIcon("selected.png");
        JButton selected1 = new JButton(yellow);
        JButton selected2 = new JButton(yellow);
        JButton selected3 = new JButton(yellow);
        JButton selected4 = new JButton(yellow);
                for(int i = 0; i < 4; i++){
                    if(i == 0){
                        boardPane.add(selected1, new Integer(2));
                        selected1.setBounds((x-z), (y-z), z, z);
                        selected1.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected1.getLocation().x;
                                int yS_pos = selected1.getLocation().y;
                                boardPane.remove(redPiece);
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addRedPiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                selected1.setVisible(false);
                                selected2.setVisible(false);
                                selected3.setVisible(false);
                                selected4.setVisible(false);
                            }
                        });
                    }
                    else if(i == 1){
                        boardPane.add(selected2, new Integer(2));
                        selected2.setBounds((x+z), (y-z), z, z);
                        selected2.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected2.getLocation().x;
                                int yS_pos = selected2.getLocation().y;
                                boardPane.remove(redPiece);
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addRedPiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                selected1.setVisible(false);
                                selected2.setVisible(false);
                                selected3.setVisible(false);
                                selected4.setVisible(false);
                            }
                        });
                    }
                    else if(i == 2){   //use this as test
                        boardPane.add(selected3, new Integer(2));
                        selected3.setBounds((x-z), (y+z), z, z);
                        selected3.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected3.getLocation().x;
                                int yS_pos = selected3.getLocation().y;
                                boardPane.remove(redPiece);
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addRedPiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                selected1.setVisible(false);
                                selected2.setVisible(false);
                                selected3.setVisible(false);
                                selected4.setVisible(false);
                            }
                        });
                    }
                    else if(i == 3){
                        boardPane.add(selected4, new Integer(2));
                        selected4.setBounds((x+z), (y+z), z, z);
                        selected4.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected4.getLocation().x;
                                int yS_pos = selected4.getLocation().y;
                                boardPane.remove(redPiece);
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addRedPiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                selected1.setVisible(false);
                                selected2.setVisible(false);
                                selected3.setVisible(false);
                                selected4.setVisible(false);
                            }
                        });
                    }
                }
            }

    void addWhitePiece(int x, int y, int z){
        ImageIcon white = new ImageIcon("white.png");
        JButton whitePiece = new JButton(white);
        boardPane.add(whitePiece, new Integer(3));
        whitePiece.setBounds(x, y, z, z);
    }


    void iniRed(int sizeLength){
        Pieces piece = new Pieces();
        piece.addRedPiece(240, 560, sizeLength);
    }

    void storage(int sizeLength){
        Pieces piece = new Pieces();
        piece.addRedPiece(80, 560, sizeLength);
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
