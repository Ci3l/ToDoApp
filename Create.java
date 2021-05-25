import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
public class Create extends AbstractAction{
  private ToDoApp fenetre;
  public Create(ToDoApp fenetre, String texte){
    super(texte);

    this.fenetre = fenetre;
  }

  public void actionPerformed(ActionEvent e) {
    String name = ToDoApp.getNameTextField();
    String note = ToDoApp.getNoteTextField();
    Object month = ToDoApp.getMonth().getSelectedItem() ;
    Object date = ToDoApp.getDates().getSelectedItem() ;
    Object hour = ToDoApp.getHours().getSelectedItem() ;
    Object minute = ToDoApp.getMinutes().getSelectedItem() ;
    String strMonth = month.toString();
    String strDate = date.toString();
    String strHour = hour.toString();
    String strMinute = minute.toString();
    PostIt.PostIt(name,note,month,date,hour,minute,strMonth, strDate,strHour,strMinute);
  }
}
