import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
public class ToDoApp extends JFrame{
  private JTextField nameTextField ;
  private JTextField note ;
  private JComboBox month_deadline ;
  private JComboBox date_deadline ;
  private JComboBox hours_deadline ;
  private JComboBox minutes_deadline ;
  private ToDoApp main_frame = this ;
  public ToDoApp() {
    super();
    buid();
  }
  public void buid(){
    JMenuBar menuBar = new JMenuBar() ;

    JMenu menu1 = new JMenu("new");

    JMenuItem from_scratch = new JMenuItem(new FromScratch(this,"from scratch"));
		menu1.add(from_scratch);

    JMenuItem templates = new JMenuItem(new Templates(this,"templates"));
    menu1.add(templates);

    menuBar.add(menu1);

    setJMenuBar(menuBar);
    setTitle("To Do");
    setSize(400,800);
    setLocationRelativeTo(null);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(buildContentPane());
  }
  public JPanel buildContentPane(){
    JPanel panel = new JPanel();
    panel.setBackground(Color.white);

    nameTextField = new JTextField();
		nameTextField.setColumns(10);
    panel.add(nameTextField);

    month_deadline = new JComboBox(new Month_handler());
		panel.add(month_deadline);

    date_deadline = new JComboBox(new Date_handler());
		panel.add(date_deadline);

    hours_deadline = new JComboBox(new Hours_handler());
		panel.add(hours_deadline);

    minutes_deadline = new JComboBox(new Minutes_handler());
		panel.add(minutes_deadline);

    note = new JTextField();
		note.setColumns(10);
    panel.add(note);

    return panel;
  }

  public JTextField getNameTextField(){
		return nameTextField;
	}

  public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        ToDoApp main_frame = new ToDoApp();
        main_frame.setVisible(true);
      }
    });
  }
}
