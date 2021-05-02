import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
public class FromScratch extends AbstractAction {
	private ToDoApp fenetre;
  public FromScratch(ToDoApp fenetre, String texte){
		super(texte);

		this.fenetre = fenetre;
	}

	public void actionPerformed(ActionEvent e) {
    String[] options = {"1", "2", "3"};
    String mTrimester1 = (String)JOptionPane.showInputDialog(null, "Enter Trimester","Trimester", JOptionPane.QUESTION_MESSAGE, options, options[2]);
	}
}
