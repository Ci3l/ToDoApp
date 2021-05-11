import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.BorderLayout;
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
      ImageIcon icon = new ImageIcon(new URL("https://cdn.tutsplus.com/mac/authors/legacy/Josh%20Johnson/2012/09/26/Stickies1.png"));
      JLabel label = new JLabel(icon);
      JPanel panel = new JPanel(new GridBagLayout());
      panel.add(label);
      JPanel textPanel = new JPanel(new GridLayout(5, 3));
      nameLabel = new JLabel(name.toUpperCase());
      nameLabel.setBounds(50, 50, 100, 30);
      nameLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
      textPanel.add(nameLabel);
      monthLabel = new JLabel(strMonth + ' ' + strDate);
      monthLabel.setBounds(50, 50, 100, 30);
      monthLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
      textPanel.add(monthLabel);
      timeLabel = new JLabel(strHour + ':' + strMinute);
      timeLabel.setBounds(50, 50, 100, 30);
      timeLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
      textPanel.add(timeLabel);
      noteLabel = new JLabel(note.toLowerCase());
      noteLabel.setBounds(50, 50, 100, 30);
      noteLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
      textPanel.add(noteLabel);

      JPanel panel2 = new JPanel(new BorderLayout());
      panel2.add(textPanel, BorderLayout.EAST);
      panel2.add(panel, BorderLayout.WEST);
      JOptionPane.showMessageDialog(null, panel2, name,JOptionPane.DEFAULT_OPTION);
      } catch ( Exception a){
    }
  }
}
