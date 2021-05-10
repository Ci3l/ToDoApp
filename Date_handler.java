//package dvp.swing.bases.menu;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class Date_handler extends DefaultComboBoxModel {
	private ArrayList<Integer> date;

	public Date_handler(){
		super();

		date = new ArrayList<Integer>();
    int i = 0 ;
    while (i < 31){
  		date.add(i);
      i ++ ;
    }
	}

	public Integer getSelectedDate(){
		return (Integer)getSelectedItem();
	}
}
