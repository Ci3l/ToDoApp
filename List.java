import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
public class List extends AbstractAction {
	private ToDoApp fenetre;
	private String name ;
	private String listElements ;
  public List(ToDoApp fenetre, String texte){
		super(texte);

		this.fenetre = fenetre;
	}
	public void actionPerformed(ActionEvent e) {
			String name = JOptionPane.showInputDialog("Name : ");
			String listElements = JOptionPane.showInputDialog("List Elements (separated by comas) : ");
			String[] elementsList = listElements.split(",");
			int j = elementsList.length ;
			System.out.println(j);
	}
}
