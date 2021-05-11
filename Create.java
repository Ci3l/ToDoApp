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
  public Create(ToDoApp fenetre, String texte){
    super(texte);

    this.fenetre = fenetre;
  }

  public void actionPerformed(ActionEvent e) {
    try {
      ImageIcon icon = new ImageIcon(new URL("https://cdn.tutsplus.com/mac/authors/legacy/Josh%20Johnson/2012/09/26/Stickies1.png"));
      JLabel label = new JLabel(icon);
      JPanel panel = new JPanel(new GridBagLayout());
      panel.add(label);
      JPanel textPanel = new JPanel(new GridLayout(5, 3));
      for (int i = 0; i < 10; i++) {
         textPanel.add(new JLabel("Learn CSS"));
      }
      JPanel panel2 = new JPanel(new BorderLayout());
      panel2.add(textPanel);
      panel2.add(panel, BorderLayout.WEST);
      JOptionPane.showMessageDialog(null, panel2, "Course",JOptionPane.DEFAULT_OPTION);
      } catch ( Exception a){
    }
  }
}
