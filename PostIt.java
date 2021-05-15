import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.BorderLayout;
import javax.swing.BoxLayout ;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PostIt {
  private static JLabel nameLabel;
  private static JLabel noteLabel;
  private static JLabel monthLabel;
  private static JLabel timeLabel;
  public static void PostIt(String name, String note, Object month, Object date, Object hour, Object minute, String strMonth, String strDate, String strHour, String strMinute){
    try {
      ImageIcon icon = new ImageIcon(new URL("https://cdn.tutsplus.com/mac/authors/legacy/Josh%20Johnson/2012/09/26/Stickies1.png"));//https://upload.wikimedia.org/wikipedia/commons/4/43/Nuvola_apps_user_with_note.svg
      JLabel label = new JLabel(icon);
      JPanel panel = new JPanel(new GridBagLayout());
      panel.add(label);
      JPanel textPanel = new JPanel() ;
      textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
      nameLabel = new JLabel(name.toUpperCase());
      nameLabel.setBounds(50, 50, 100, 30);
      nameLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
      textPanel.add(nameLabel,Component.CENTER_ALIGNMENT);
      monthLabel = new JLabel(strMonth + ' ' + strDate);
      monthLabel.setBounds(50, 50, 100, 30);
      monthLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
      textPanel.add(monthLabel,Component.CENTER_ALIGNMENT);
      timeLabel = new JLabel(strHour + ':' + strMinute);
      timeLabel.setBounds(50, 50, 100, 30);
      timeLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
      textPanel.add(timeLabel,Component.CENTER_ALIGNMENT);
      noteLabel = new JLabel(note.toLowerCase());
      noteLabel.setBounds(50, 50, 100, 30);
      noteLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
      textPanel.add(noteLabel,Component.CENTER_ALIGNMENT);
      JPanel panel2 = new JPanel(new BorderLayout());
      panel2.add(textPanel, BorderLayout.EAST);
      panel2.add(panel, BorderLayout.WEST);
      String[] options = {"done", "cancel", "modify"};
      int retour = JOptionPane.showOptionDialog(null, panel2, name,
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
      if (retour == 0){
        int g = ToDoApp.getAccomplishment();
        g ++ ;
        ToDoApp.setAccomplishment(g);
        if (g % 10 == 1){
          JOptionPane.showMessageDialog(null,"It's your " + g + "st done post-it", "Accomplishment",
          JOptionPane.INFORMATION_MESSAGE);}
        else if (g % 10 == 2){
          JOptionPane.showMessageDialog(null,"It's your " + g + "nd done post-it", "Accomplishment",
          JOptionPane.INFORMATION_MESSAGE);}
        else if (g % 10 == 3){
          JOptionPane.showMessageDialog(null,"It's your " + g + "rd done post-it", "Accomplishment",
          JOptionPane.INFORMATION_MESSAGE);}
        else {
          JOptionPane.showMessageDialog(null,"It's your " + g + "th done post-it", "Accomplishment",
          JOptionPane.INFORMATION_MESSAGE);}}
      else if (retour == 1){
        //close;
      }
      else {
        //JOptionPane for modification;
      }
      } catch ( Exception a){
    }
  }
}
