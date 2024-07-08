package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    Score(String name,int score){


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/score.png"));
       Image i2=i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel img=new JLabel(i3);
       img.setBounds(60,200,200,150);
       add(img);




       JLabel heading=new JLabel("Thank you "+name+" for playing QUIZ TEST");
       heading.setBounds(100,80,700,30);
       heading.setFont(new Font("Tahoma",Font.BOLD,26));
       add(heading);

        JLabel Score=new JLabel("Your Score is "+score);
        Score.setBounds(350,200,300,30);
        Score.setFont(new Font("Tahoma",Font.BOLD,26));
        add(Score);

        JButton exit=new JButton("Exit");
        exit.setBounds(380,240,120,30);
        exit.setBackground(new Color(22,99,54));
        exit.setForeground(Color.WHITE);
        add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });
        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("Icons/back.png"));
        Image i22=i11.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel img1=new JLabel(i33);
        img1.setBounds(0,0,750,550);
        add(img1);



        setSize(750,550);
        setLocation(400,150);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
