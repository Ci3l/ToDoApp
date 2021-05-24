import java.util.ArrayList;
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
import javax.swing.JPanel;
public class ModifyChecklist extends AbstractAction{
  private JFrame frame;
  public ModifyChecklist(JFrame frame, String texte){
    super(texte);
    this.frame = frame;
  }

  public void actionPerformed(ActionEvent e) {
    String[] options = {"name", "list"};
    int retour = JOptionPane.showOptionDialog(null, "What would you modify ?", "Modification",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    if (retour == 0){
      String newName = JOptionPane.showInputDialog("Enter the new name");
      Checklist.setListName(frame,newName);
    } else if (retour == 1){
      String listElements = JOptionPane.showInputDialog("List Elements (separated by comas) : ");
      String[] elementsList = listElements.split(",") ;
      ArrayList<String> elementsListArray = new ArrayList<String>(20) ;
      for (String i : elementsList) { elementsListArray.add("-> " + i);}
      int j = elementsListArray.size() ;
      while(j <= 20) { elementsListArray.add(" "); j ++ ;}
      Checklist.setList(frame, elementsListArray);
    }
  }
}
