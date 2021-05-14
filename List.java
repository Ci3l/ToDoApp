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
	private JLabel nameLabel;
  private JLabel listLabel;
  public List(ToDoApp fenetre, String texte){
		super(texte);

		this.fenetre = fenetre;
	}
	public void actionPerformed(ActionEvent e) {
			String name = JOptionPane.showInputDialog("Name : ");
			String listElements = JOptionPane.showInputDialog("List Elements (separated by comas) : ");
			String[] elementsList = listElements.split(",") ;
			ArrayList<String> elementsListArray = new ArrayList<String>(20) ;
			for (String i : elementsList) { elementsListArray.add("-> " + i);}
			int j = elementsListArray.size() ;
			while(j <= 20) { elementsListArray.add(" "); j ++ ;}
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			nameLabel = new JLabel(name.toUpperCase());
			nameLabel.setBounds(50, 50, 100, 30);
			nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			nameLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));
			panel.add(nameLabel);
			listLabel = new JLabel("<html>" +   elementsListArray.get(0).toString() + "<br>" +  elementsListArray.get(1).toString() + "<br>" +  elementsListArray.get(2).toString() + "<br>" +  elementsListArray.get(3).toString() + "<br>" +  elementsListArray.get(4).toString() + "<br>" +  elementsListArray.get(5).toString() + "<br>" +  elementsListArray.get(6).toString() + "<br>" +  elementsListArray.get(7).toString() + "<br>" +  elementsListArray.get(8).toString() + "<br>" +  elementsListArray.get(9).toString() + "<br>" +  elementsListArray.get(10).toString() + "<br>" +  elementsListArray.get(11).toString() + "<br>" +  elementsListArray.get(12).toString() + "<br>" +  elementsListArray.get(13).toString() + "<br>" +  elementsListArray.get(14).toString() + "<br>" +  elementsListArray.get(15).toString() + "<br>" +  elementsListArray.get(16).toString() + "<br>" +  elementsListArray.get(17).toString() + "<br>" +  elementsListArray.get(18).toString() + "<br>" +  elementsListArray.get(19).toString() + "<br>" +  elementsListArray.get(20).toString() + "</html>");
			listLabel.setBounds(50, 50, 100, 30);
			listLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
			panel.add(listLabel);
			JOptionPane.showMessageDialog(null, panel, name,JOptionPane.DEFAULT_OPTION);
			int g = ToDoApp.getAccomplishmentForList();
			g ++ ;
			ToDoApp.setAccomplishmentForList(g);
			if (g % 10 == 1){
				JOptionPane.showMessageDialog(null,"It's your " + g + "st list", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
			else if (g % 10 == 2){
				JOptionPane.showMessageDialog(null,"It's your " + g + "nd list", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
			else if (g % 10 == 3){
				JOptionPane.showMessageDialog(null,"It's your " + g + "rd list", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
			else {
				JOptionPane.showMessageDialog(null,"It's your " + g + "th list", "Accomplishment",
				JOptionPane.INFORMATION_MESSAGE);}
	}
}
