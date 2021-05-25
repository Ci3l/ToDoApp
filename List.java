import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
public class List extends AbstractAction {
	private ToDoApp fenetre;
	private String name ;
	private String listElements ;
  public List(ToDoApp fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
	}
	public void actionPerformed(ActionEvent e) {Checklist.Checklist();}
}
