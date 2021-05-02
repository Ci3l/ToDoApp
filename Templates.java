import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
public class Templates extends AbstractAction {
	private ToDoApp fenetre;
  public Templates(ToDoApp fenetre, String texte){
		super(texte);

		this.fenetre = fenetre;
	}

	public void actionPerformed(ActionEvent e) {
    String[] options = {"1", "2", "3"};
    String mTrimester1 = (String)JOptionPane.showInputDialog(null, "Enter Trimester","Trimester", JOptionPane.QUESTION_MESSAGE, options, options[2]);

	}
}
