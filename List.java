import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.Component;
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
	private JLabel nameLabel;
  private JLabel listLabel;
  public List(ToDoApp fenetre, String texte){
		super(texte);

		this.fenetre = fenetre;
	}
	public void actionPerformed(ActionEvent e) {
			String name = JOptionPane.showInputDialog("Name : ");
			String listElements = JOptionPane.showInputDialog("List Elements (separated by comas) : ");
			String[] elementsList = listElements.split(",");
			int j = elementsList.length ;

			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			nameLabel = new JLabel(name.toUpperCase());
			nameLabel.setBounds(50, 50, 100, 30);
			nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			nameLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
			panel.add(nameLabel);
			listLabel = new JLabel("<html>" + elementsList[0] + "<br>" + elementsList[1] + "</html>");
			listLabel.setBounds(50, 50, 100, 30);
			listLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
			panel.add(listLabel);
			JOptionPane.showMessageDialog(null, panel, name,JOptionPane.DEFAULT_OPTION);
	}
}
