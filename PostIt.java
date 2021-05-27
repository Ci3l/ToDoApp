import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout ;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.BorderLayout;
import javax.swing.BoxLayout ;
import java.awt.GridBagLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PostIt {
  private static JLabel nameLabel;
  private static JLabel noteLabel;
  private static JLabel monthLabel;
  private static JLabel timeLabel;
  private static BufferedImage image;
  private static ImageIcon icon ;
  public static void PostIt(String name, String note, Object month, Object date, Object hour, Object minute, String strMonth, String strDate, String strHour, String strMinute){
    try {
    JFrame postIt = new JFrame(name);
    JPanel postItPanel = new JPanel();
    postItPanel.setLayout(new BoxLayout(postItPanel, BoxLayout.Y_AXIS));

    try {image = ImageIO.read(new File("post_it_icon.png")); icon = new ImageIcon(image) ;} catch (IOException ex){ icon = new ImageIcon(new URL("https://cdn.tutsplus.com/mac/authors/legacy/Josh%20Johnson/2012/09/26/Stickies1.png"));}
    JLabel label = new JLabel(icon);
    JPanel panel = new JPanel(new GridBagLayout());
    panel.add(label);
    JPanel textPanel = new JPanel() ;
    textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
    nameLabel = new JLabel(name.toUpperCase());
    nameLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
    textPanel.add(nameLabel,Component.CENTER_ALIGNMENT);
    monthLabel = new JLabel(strMonth + ' ' + strDate + ' ');
    monthLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
    textPanel.add(monthLabel,Component.CENTER_ALIGNMENT);
    timeLabel = new JLabel(strHour + ':' + strMinute);
    timeLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
    textPanel.add(timeLabel,Component.CENTER_ALIGNMENT);
    noteLabel = new JLabel(note.toLowerCase() + ' ');
    noteLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
    textPanel.add(noteLabel,Component.CENTER_ALIGNMENT);
    JPanel panel2 = new JPanel(new BorderLayout());
    panel2.add(textPanel, BorderLayout.EAST);
    panel2.add(panel, BorderLayout.WEST);
    JPanel panel3 = new JPanel(new FlowLayout());
    JButton buttonDone = new JButton();
    buttonDone.setText("done");
    buttonDone.addActionListener(e -> {postIt.dispose();
      int g = ToDoApp.getAccomplishment();
  		g ++ ;
  		ToDoApp.setAccomplishment(g);
  		if (g % 10 == 1){
  			JOptionPane.showMessageDialog(null,"It's your " + g + "st done post-it", "Accomplishment",JOptionPane.INFORMATION_MESSAGE);}
  		else if (g % 10 == 2){
  			JOptionPane.showMessageDialog(null,"It's your " + g + "nd done post-it", "Accomplishment",JOptionPane.INFORMATION_MESSAGE);}
  		else if (g % 10 == 3){
  			JOptionPane.showMessageDialog(null,"It's your " + g + "rd done post-it", "Accomplishment",JOptionPane.INFORMATION_MESSAGE);}
  		else {
  			JOptionPane.showMessageDialog(null,"It's your " + g + "th done post-it", "Accomplishment",JOptionPane.INFORMATION_MESSAGE);}
    });
    JButton buttonCancel = new JButton();
    buttonCancel.setText("cancel");
    buttonCancel.addActionListener(e -> {postIt.dispose();});
    JButton buttonModify = new JButton(new ModifyPostIt(postIt, "modify"));
    panel3.add(buttonDone);
    panel3.add(buttonCancel);
    panel3.add(buttonModify);
    postItPanel.add(panel2);
    postItPanel.add(panel3);
    postIt.add(postItPanel);
    int noteLength = note.length();
    System.out.println(noteLength);
    if (noteLength <= 11){postIt.setSize(300, 300);
    } else {
      double newLengthForPostItDouble = (300 + (noteLength - 11 )*10)*(1 -0.17);
      int newLengthForPostItInt = (int)newLengthForPostItDouble;
      postIt.setSize(newLengthForPostItInt, 300);
      System.out.println(newLengthForPostItInt) ;
    }
    postIt.setLocationRelativeTo(null);
    postIt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    postIt.setVisible(true);
  } catch ( Exception a){}
}
public static void setName(JFrame frame,String newName){nameLabel.setText(newName.toUpperCase());}
public static void setDate(JFrame frame,String newMonth, String newDate){monthLabel.setText(newMonth + ' ' + newDate + ' ');}
public static void setTime(JFrame frame,String newHour,String newMinute){timeLabel.setText(newHour + ':' + newMinute);}
public static void setNote(JFrame frame,String newNote){timeLabel.setText(newNote.toLowerCase() + ' ');}
}
