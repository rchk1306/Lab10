package Lab10;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Checkers");
        Container cp = new Container();
        cp.setLayout(new BorderLayout());

        JPanel board = new JPanel();
        board.setLayout(new GridLayout(8,8));
        frame.add(board, BorderLayout.CENTER); 

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
        text.setLayout(new BoxLayout(text, BoxLayout.Y_AXIS));
        frame.add(text, BorderLayout.EAST);
        JLabel game = new JLabel("Game Panel");
        JLabel time = new JLabel("Time passed : 00.00");
        JButton start = new JButton("START");
        text.add(game);
        text.add(time);
        text.add(start);

        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}