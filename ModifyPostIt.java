import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
public class ModifyPostIt extends AbstractAction{
  private JFrame frame;
  public ModifyPostIt(JFrame frame, String texte){
    super(texte);
    this.frame = frame;
  }
  public void actionPerformed(ActionEvent e) {
    String[] options = {"name", "date", "note"};
    int retour = JOptionPane.showOptionDialog(null, "What would you modify ?", "Modification",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    if (retour == 0){
      String newName = JOptionPane.showInputDialog("Enter the new name");
      PostIt.setName(frame, newName);
    } else if (retour == 1){
      String[] dateChoice = {"date", "hour"};
      int dateRetour = JOptionPane.showOptionDialog(null, "What would you modify ?", "Modification",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dateChoice, dateChoice[0]);
      if (dateRetour == 0){
         String[] monthList = {"January", "February", "March","April","May","June","July","August","September","October","November","December"} ;
         String month = (String)JOptionPane.showInputDialog(null,"Month Selection","New Month", JOptionPane.QUESTION_MESSAGE,null,monthList, monthList[0]);
         String[] dateList = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"} ;
         String date = (String)JOptionPane.showInputDialog(null,"Date Selection","New Date", JOptionPane.QUESTION_MESSAGE,null,dateList, dateList[0]);
         PostIt.setDate(frame,month,date);
          } else {
          String[] hourList = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"} ;
          String hour = (String)JOptionPane.showInputDialog(null,"Hour Selection","New Hour", JOptionPane.QUESTION_MESSAGE,null,hourList, hourList[0]);
          String[] minuteList = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"} ;
          String minute = (String)JOptionPane.showInputDialog(null,"Minute Selection","New Time", JOptionPane.QUESTION_MESSAGE,null,minuteList, minuteList[0]);
          PostIt.setTime(frame,hour,minute);
          }
    } else if (retour == 2){
      String newNote = JOptionPane.showInputDialog("Enter the new note");
      PostIt.setNote(frame,newNote);
    }
  }
}
