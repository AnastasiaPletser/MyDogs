import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

  private static void createAndShowGUI() {

    JFrame jFrame = new JFrame("About pets)");
    jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
    jFrame.setSize(400, 450);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Моя любима собачка");
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(label);

    JLabel label1 = new JLabel("Йдемо гуляти?");
    label1.setHorizontalAlignment(JLabel.CENTER);
    label1.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(label1);

    JLabel photo = new JLabel(new ImageIcon("retriever-puppy.gif"));
    //JLabel photo1 = new JLabel(new ImageIcon("dogsleep.gif"));
photo.setHorizontalAlignment(JLabel.CENTER);
jFrame.add(photo);

    
JButton button = new JButton("Так!");
button.setHorizontalAlignment(JButton.CENTER);
button.setPreferredSize(new Dimension(320, 50));
button.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
jFrame.add(button);

JButton button1 = new JButton("Ні!");
button1.setHorizontalAlignment(JButton.CENTER);
button1.setPreferredSize(new Dimension(320, 50));
button1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
jFrame.add(button1);

    JButton buttonBack = new JButton("Назад!");
    buttonBack.setHorizontalAlignment(JButton.CENTER);
    buttonBack.setPreferredSize(new Dimension(320, 50));
    buttonBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
  //  jFrame.add(buttonBack);

JLabel photoYes = new JLabel(new ImageIcon("cute-cartoon.gif"));
//JLabel photo2 = new JLabel(new ImageIcon("cute-cartoon.gif"));
photoYes.setHorizontalAlignment(JLabel.CENTER);
photoYes.setPreferredSize(new Dimension(320, 350));

    JLabel photoNo = new JLabel(new ImageIcon("dog1.gif"));
    //JLabel photo2 = new JLabel(new ImageIcon("cute-cartoon.gif"));
    photoNo.setHorizontalAlignment(JLabel.CENTER);
    photoNo.setPreferredSize(new Dimension(320, 350));

  button1.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    label.setText("знов гуляти(((((");
    label.setVisible (true);
    jFrame.add(photoNo);
    photoNo.setVisible(true);
    jFrame.add(buttonBack);
    buttonBack.setVisible(true);
    photo.setVisible (false);
    button.setVisible(false);
    label1.setVisible(false);
  }

});

    button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      label.setText("УРА!!!");
      label.setVisible (true);
      jFrame.add(photoYes);
      photoYes.setVisible(true);
      jFrame.add(buttonBack);
      buttonBack.setVisible(true);
      photo.setVisible (false);
      button.setVisible(false);
      button1.setVisible(false);
      label1.setVisible(false);
    }
      });

    buttonBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("Моя собака");
        label.setVisible (true);
        label1.setVisible (true);
        jFrame.add(photo);
        button.setVisible(true);
        button1.setVisible(true);
        buttonBack.setVisible(false);
        photo.setVisible (true);
        photoYes.setVisible (false);
        photoNo.setVisible (false);
      }
        });


jFrame.setVisible(true);
}

public static void main(String[] args) {
createAndShowGUI();
}
}