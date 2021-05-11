import java.awt.event.ActionEvent;
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
      textPanel.add(new JLabel(name));
      textPanel.add(new JLabel(note));
      textPanel.add(new JLabel(strMonth));
      textPanel.add(new JLabel(strDate));
      textPanel.add(new JLabel(strHour));
      textPanel.add(new JLabel(strMinute));
      JPanel panel2 = new JPanel(new BorderLayout());
      panel2.add(textPanel);
      panel2.add(panel, BorderLayout.WEST);
      JOptionPane.showMessageDialog(null, panel2, "Course",JOptionPane.DEFAULT_OPTION);
      } catch ( Exception a){
    }
  }
}
