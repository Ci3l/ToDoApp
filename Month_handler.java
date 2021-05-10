//package dvp.swing.bases.menu;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class Month_handler extends DefaultComboBoxModel {
	private ArrayList<String> months;

	public Month_handler(){
		super();

		months = new ArrayList<String>();

    months.add("Janvier");
    months.add("Février");
    months.add("Mars");
    months.add("Avril");
    months.add("Mai");
    months.add("Juin");
    months.add("Juillet");
    months.add("Août");
    months.add("Septembre");
    months.add("Octobre");
    months.add("Novembre");
    months.add("Décembre");
  }

  public String getSelectedMonth(){
		return (String)getSelectedItem();
	}
}
