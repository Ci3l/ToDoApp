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
		//no need for this one but just in case
	}
}
