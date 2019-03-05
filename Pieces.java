import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pieces extends Components{
    int x_pos, y_pos;
    ImageIcon redTemp = new ImageIcon("red.png");
    ImageIcon whiteTemp = new ImageIcon("white.png");
    JButton placeHolderRed = new JButton(redTemp);
    JButton placeHolderWhite = new JButton(whiteTemp);

    void addRedPiece(int x, int y, int z){
        ImageIcon red = new ImageIcon("red.png");
        JButton redPiece = new JButton(red);
        boardPane.add(redPiece, new Integer(3));
        redPiece.setBounds(x, y, z, z);
        redPiece.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x_pos = redPiece.getLocation().x;
                int y_pos = redPiece.getLocation().y;
                boardPane.remove(redPiece);
                boardPane.add(placeHolderRed, new Integer(3));
                placeHolderRed.setBounds(x_pos, y_pos, z, z);
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
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        boardPane.add(selected1, new Integer(2));
                        selected1.setBounds((x+z), (y+z), z, z);
                        selected1.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected1.getLocation().x;
                                int yS_pos = selected1.getLocation().y;
                                boardPane.remove(redPiece);
                                boardPane.revalidate();
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addRedPiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                boardPane.remove(selected1);
                                boardPane.remove(selected2);
                                boardPane.remove(placeHolderRed);
                            }
                        });
                    }
                    else if(i == 1){
                        boardPane.add(selected2, new Integer(2));
                        selected2.setBounds((x-z), (y+z), z, z);
                        selected2.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected2.getLocation().x; 
                                int yS_pos = selected2.getLocation().y;
                                boardPane.remove(redPiece);
                                boardPane.revalidate();
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addRedPiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                boardPane.remove(selected1);
                                boardPane.remove(selected2);
                                boardPane.remove(placeHolderRed);
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
        whitePiece.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x_pos = whitePiece.getLocation().x;
                int y_pos = whitePiece.getLocation().y;
                boardPane.remove(whitePiece);
                boardPane.add(placeHolderWhite, new Integer(3));
                placeHolderWhite.setBounds(x_pos, y_pos, z, z);
                whitePieceAction(x, y, z);
                    }
                });
    }

    void whitePieceAction(int x, int y, int z){ 
        ImageIcon white = new ImageIcon("white.png");
        JButton whitePiece = new JButton(white);
        ImageIcon yellow = new ImageIcon("selected.png");
        JButton selected1 = new JButton(yellow);
        JButton selected2 = new JButton(yellow);
                for(int i = 0; i < 4; i++){
                    if(i == 0){
                        boardPane.add(selected1, new Integer(2));
                        selected1.setBounds((x-z), (y-z), z, z);
                        selected1.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                int xS_pos = selected1.getLocation().x;
                                int yS_pos = selected1.getLocation().y;
                                boardPane.remove(whitePiece);
                                boardPane.revalidate();
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addWhitePiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                boardPane.remove(selected1);
                                boardPane.remove(selected2);
                                boardPane.remove(placeHolderWhite);
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
                                boardPane.remove(whitePiece);
                                boardPane.revalidate();
                                boardPane.repaint(); 
                                Pieces piece = new Pieces();
                                piece.addWhitePiece(xS_pos, yS_pos, z);
                                x_pos = xS_pos;
                                y_pos = yS_pos;
                                boardPane.remove(selected1);
                                boardPane.remove(selected2);
                                boardPane.remove(placeHolderWhite);
                            }
                        });
                    }
                }
            }



    void iniWhite(int sizeLength){
        Pieces piece = new Pieces();
        piece.addWhitePiece(240, 560, sizeLength);
        piece.addWhitePiece(80, 560, sizeLength);
        piece.addWhitePiece(400, 560, sizeLength);
        piece.addWhitePiece(560, 560, sizeLength);
        piece.addWhitePiece(0, 480, sizeLength);
        piece.addWhitePiece(160, 480, sizeLength);
        piece.addWhitePiece(320, 480, sizeLength);
        piece.addWhitePiece(480, 480, sizeLength);
        piece.addWhitePiece(80, 400, sizeLength);
        piece.addWhitePiece(240, 400, sizeLength);
        piece.addWhitePiece(400, 400, sizeLength);
        piece.addWhitePiece(560, 400, sizeLength);
    }

    void storage(int sizeLength){
        Pieces piece = new Pieces();
    }
}
