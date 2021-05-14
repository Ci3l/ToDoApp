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
public class Create extends AbstractAction{
  private ToDoApp fenetre;
  private JLabel nameLabel;
  private JLabel noteLabel;
  private JLabel monthLabel;
  private JLabel timeLabel;
  public Create(ToDoApp fenetre, String texte){
    super(texte);

    this.fenetre = fenetre;
  }

  public void actionPerformed(ActionEvent e) {
    String name = ToDoApp.getNameTextField();
    String note = ToDoApp.getNoteTextField();
    Object month = ToDoApp.getMonth().getSelectedItem() ;
    Object date = ToDoApp.getDates().getSelectedItem() ;
    Object hour = ToDoApp.getHours().getSelectedItem() ;
    Object minute = ToDoApp.getMinutes().getSelectedItem() ;
    String strMonth = month.toString();
    String strDate = date.toString();
    String strHour = hour.toString();
    String strMinute = minute.toString();
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
      int x = JOptionPane.showOptionDialog(null, panel2, name,
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
      System.out.println(x);
      int g = ToDoApp.getAccomplishment();
			g ++ ;
			ToDoApp.setAccomplishment(g);
			if (g % 10 == 1){
				JOptionPane.showMessageDialog(null,"It's your " + g + "st post-it", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
			else if (g % 10 == 2){
				JOptionPane.showMessageDialog(null,"It's your " + g + "nd post-it", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
			else if (g % 10 == 3){
				JOptionPane.showMessageDialog(null,"It's your " + g + "rd post-it", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
			else {
				JOptionPane.showMessageDialog(null,"It's your " + g + "th post-it", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
      } catch ( Exception a){
    }
  }
}
