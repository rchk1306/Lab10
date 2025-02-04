package Lab10;
import java.awt.*;
import javax.swing.*;

public class Checkers extends JFrame {
    Container cp ;
    public Checkers(){
        super("Checkers");
        Initail();
        setComponent();
        Finally();
        }
    public void Initail() {
            cp = getContentPane();
            cp.setLayout(new BorderLayout());
        }
    public void setComponent(){
        JPanel board = new JPanel();
        board.setLayout(new GridLayout(8,8));
        for(int row = 0 ; row < 8 ; row++){
            for(int col = 0 ; col < 8; col++ ){
                JButton square = new JButton();
                if ((col+row)%2 == 0){
                    square.setBackground(Color.WHITE);
                }else{
                    square.setBackground(Color.BLACK);
                }
                board.add(square);
            }
        }
        
        JPanel text = new JPanel();
        text.setLayout(new GridBagLayout());
        JLabel game = new JLabel("Game Panel");
        JLabel time = new JLabel("Time passed : 00.00");
        JButton start = new JButton("START");
        start.setBackground(Color.WHITE);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 100;
        c.ipadx = 20;
        c.ipady = 10;
        game.setHorizontalAlignment(JLabel.CENTER);
        game.setFont(new Font("",Font.PLAIN,20));
        text.add(game,c);
        c.gridy = 110;
        c.ipadx = 50;
        c.ipady = 30;
        time.setHorizontalAlignment(JLabel.CENTER);
        text.add(time,c);
        c.gridy = 120;
        c.ipadx = 30;
        c.ipady = 10;
        text.add(start,c);
        text.setBackground(Color.WHITE);

        cp.add(board,BorderLayout.CENTER);
        cp.add(text,BorderLayout.EAST);
    }
    public void Icon(){
        ImageIcon img = new ImageIcon();
        setIconImage(img.getImage());
    }
    public  void Finally() {
        setSize(600, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}