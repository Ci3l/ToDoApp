import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
public class Templates extends AbstractAction {
	private ToDoApp fenetre;
  public Templates(ToDoApp fenetre, String texte){
		super(texte);

		this.fenetre = fenetre;
	}

	public void actionPerformed(ActionEvent e) {
			//copy an old one 
	}
}
