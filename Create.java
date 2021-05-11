import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
  JFrame f ;
  public Create(ToDoApp fenetre, String texte){
    super(texte);

    this.fenetre = fenetre;
  }

  public void actionPerformed(ActionEvent e) {
    try {
      ImageIcon icon = new ImageIcon(new URL("http://www.tutorialspoint.com/images/css.png"));    JLabel label = new JLabel(icon);
          JPanel panel = new JPanel(new GridBagLayout());
          panel.add(label);
          JPanel textPanel = new JPanel(new GridLayout(5, 3));
          for (int i = 0; i < 10; i++) {
             textPanel.add(new JLabel("Learn CSS"));
          }
          JPanel panel2 = new JPanel(new BorderLayout());
          panel2.add(textPanel);
          panel2.add(panel, BorderLayout.EAST);
          JOptionPane.showMessageDialog(null, panel2, "Course",JOptionPane.DEFAULT_OPTION);
      } catch ( Exception a){
    }
    //JOptionPane(Object message, int messageType, int optionType, Icon icon)
    //f=new JFrame();
    //JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");
    //String[] options = {"1", "2", "3"};
    //ImageIcon icon = new ImageIcon("src/images/turtle32.png");
    //String mTrimester1 = (String)JOptionPane.showInputDialog(null, "Enter Trimester", "Trimester", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
    }
}
