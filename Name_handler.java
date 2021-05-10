import javax.swing.DefaultComboBoxModel;

public class Minutes_handler extends DefaultComboBoxModel {
	private ArrayList<Integer> operateurs;

	public Minutes_handler(){
		super();

		minutes = new ArrayList<Integer>();
    int i = 0
    while (i < 60){
  		minutes.add(i);
      i ++ ;
    }
	}

	public Integer getSelectedMinutes(){
		return (Integer)getSelectedItem();
	}
}
