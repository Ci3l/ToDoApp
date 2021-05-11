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
    setSize(550,120);
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

    Object[] months = new Object[]{"Janvier", "Février", "Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
    month_deadline = new JComboBox(months);
		panel.add(month_deadline);

    Object[] dates = new Object[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    date_deadline = new JComboBox(dates);
		panel.add(date_deadline);

    Object[] hours = new Object[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
    hours_deadline = new JComboBox(hours);
		panel.add(hours_deadline);

    Object[] minutes = new Object[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
    minutes_deadline = new JComboBox(minutes);
		panel.add(minutes_deadline);

    note = new JTextField();
		note.setColumns(20);
    panel.add(note);

    return panel;
  }

  public JTextField getNameTextField(){return nameTextField;}
  public JComboBox getMonth(){return month_deadline;}


  public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        ToDoApp main_frame = new ToDoApp();
        main_frame.setVisible(true);
      }
    });
  }
}
