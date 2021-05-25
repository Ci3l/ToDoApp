import java.util.Enumeration;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.plaf.FontUIResource;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.UIManager ;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
public class ToDoApp extends JFrame{
  private static int accomplishment ;
  private static int accomplishmentForList ;
  private static JPanel panel ;
  private static JButton create ;
  private static JLabel name_label;
  private static JLabel deadline_label;
  private static JLabel date_deadline_label ;
  private static JLabel hour_deadline_label ;
  private static JLabel note_label ;
  private static JTextField nameTextField ;
  private static JTextField note ;
  private static JComboBox month_deadline ;
  private static JComboBox date_deadline ;
  private static JComboBox hours_deadline ;
  private static JComboBox minutes_deadline ;
  private ToDoApp main_frame = this ;
  public ToDoApp() {
    super();
    buid();
  }
  public void buid(){
    JMenuBar menuBar = new JMenuBar() ;

    JMenu menu1 = new JMenu("new list");

    JMenuItem templates = new JMenuItem(new List(this,"create"));
    menu1.add(templates);

    menuBar.add(menu1);

    setJMenuBar(menuBar);
    setTitle("To Do");
    setSize(600,140);
    setLocationRelativeTo(null);
    setUIFont (new javax.swing.plaf.FontUIResource("Monospaced",Font.PLAIN,12));
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(buildContentPane());
  }
  public JPanel buildContentPane(){
    panel = new JPanel();
    panel.setBackground(Color.white);

    JLabel name_label = new JLabel("Name : ");
    panel.add(name_label);

    nameTextField = new JTextField();
		nameTextField.setColumns(10);
    panel.add(nameTextField);

    JLabel deadline_label = new JLabel("Deadline : ");
    panel.add(deadline_label);

    JLabel date_deadline_label = new JLabel("   date");
    panel.add(date_deadline_label);

    Object[] months = new Object[]{"January", "February", "March","April","May","June","July","August","September","October","November","December"};
    month_deadline = new JComboBox(months);
		panel.add(month_deadline);

    Object[] dates = new Object[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    date_deadline = new JComboBox(dates);
		panel.add(date_deadline);

    JLabel hours_deadline_label = new JLabel("   hour");
    panel.add(hours_deadline_label);

    Object[] hours = new Object[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
    hours_deadline = new JComboBox(hours);
		panel.add(hours_deadline);

    Object[] minutes = new Object[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
    minutes_deadline = new JComboBox(minutes);
		panel.add(minutes_deadline);

    JLabel note_label = new JLabel("Note : ");
    panel.add(note_label);

    note = new JTextField();
		note.setColumns(20);
    panel.add(note);

    JButton create = new JButton(new Create(this, "CREATE"));
    panel.add(create);

    return panel;
  }
  public static String getNameTextField(){return nameTextField.getText();}
  public static String getNoteTextField(){return note.getText();}
  public static JComboBox getMonth(){return month_deadline;}
  public static JComboBox getDates(){return date_deadline;}
  public static JComboBox getHours(){return hours_deadline;}
  public static JComboBox getMinutes(){return minutes_deadline;}
  public static int getAccomplishment(){return accomplishment;}
  public static void setAccomplishment(int newValue ){ accomplishment = newValue ;}
  public static int getAccomplishmentForList(){return accomplishmentForList;}
  public static void setAccomplishmentForList(int newValue ){ accomplishmentForList = newValue ;}
  public static void setUIFont(FontUIResource f){
    Enumeration<Object> keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
        Object key = keys.nextElement();
        Object value = UIManager.get(key);
        if (value instanceof FontUIResource)
            UIManager.put(key, f);  }
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
