import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.Component;
import javax.swing.BoxLayout ;
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
		Checklist.Checklist();
	}
}
