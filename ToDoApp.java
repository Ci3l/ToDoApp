import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
public class ToDoApp extends JFrame{
  private ToDoApp main_frame = this ;
  public ToDoApp() {
    super();
    buid();
  }
  public void buid(){
    JMenuBar menuBar = new JMenuBar() ;

    JMenu menu1 = new JMenu("new");

    JMenuItem from_scratch = new JMenuItem(new FromSratch(this,"from scratch"));
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

    return panel;
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
