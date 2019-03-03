import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Frame
{
    static JFrame frame = new JFrame("Draught"); 
    static Frame board = new Frame();
    static JLayeredPane boardPane = new JLayeredPane();
    static int[] selectLocation = new int[2]; //selectLocation[0] = x_pos; selectLocation[1] = y_pos;
    static ImageIcon selectedIcon = new ImageIcon("selected.png");
    static JButton blackSquare = new JButton();
    static JButton whiteSquare = new JButton();

    public void addBlackSquare(int x, int y, int z)
    {
        ImageIcon black = new ImageIcon("empty2.png");
        JButton blackSquare = new JButton(black);
        boardPane.add(blackSquare, new Integer(1));
        blackSquare.setBounds(x, y, z, z);
        blackSquare.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x_pos = blackSquare.getLocation().x;
                int y_pos = blackSquare.getLocation().y;
                selectLocation[0] = x_pos;
                selectLocation[1] = y_pos;
                System.out.println(x_pos + ", " + y_pos);
            }
        });
    }

    public void addWhiteSquare(int x, int y, int z)
    {
        ImageIcon white = new ImageIcon("empty.png");
        JButton whiteSquare = new JButton(white);
        boardPane.add(whiteSquare, new Integer(1));
        whiteSquare.setBounds(x, y, z, z);
        whiteSquare.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x_pos = whiteSquare.getLocation().x;
                int y_pos = whiteSquare.getLocation().y;
                selectLocation[0] = x_pos;
                selectLocation[1] = y_pos;
                System.out.println(x_pos + ", " + y_pos);
            }
        });
    }

    public void addRedPiece(int x, int y, int z) 
    {
        ImageIcon red = new ImageIcon("red.png");
        JButton redPiece = new JButton(red);
        boardPane.add(redPiece, new Integer(2));
        redPiece.setBounds(x, y, z, z);
        redPiece.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x_pos = redPiece.getLocation().x;
                int y_pos = redPiece.getLocation().y;
                x_pos = selectLocation[0];
                y_pos = selectLocation[1];
                redPiece.setBounds(x_pos, y_pos, z, z);
            }
        });
    }

    public void frameSetup(int x)
    {
        frame.setSize(x, x);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(boardPane);
    }

    public void boardPaneSettings(int x)
    {
        boardPane.setBounds(0, 0, x, x);
        boardPane.setOpaque(false);
    }

    public void createBoard(int sizeLength)
    {
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
                    board.addWhiteSquare(xcoord, ycoord, sizeLength);
                    xcoord = xcoord + sizeLength; 
                }
                else{
                    board.addBlackSquare(xcoord, ycoord, sizeLength);
                    xcoord = xcoord + sizeLength;
                }
            }
            x++;
            y++;
            ycoord = ycoord + sizeLength;
            xcoord = 0;
        }
    }

    public static void main(String[] args)
    {
        board.frameSetup(700);
        board.boardPaneSettings(700);
        board.createBoard(80);
        board.addRedPiece(0, 0, 80);
    }
}