//package dvp.swing.bases.menu;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class Hours_handler extends DefaultComboBoxModel {
	private ArrayList<Integer> hours;

	public Hours_handler(){
		super();

		hours = new ArrayList<Integer>();
    int i = 0 ;
    while (i < 60){
  		hours.add(i);
      i ++ ;
    }
	}

	public Integer getSelectedHours(){
		return (Integer)getSelectedItem();
	}
}
