package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton view = new JButton();
	JButton add = new JButton();
	JLabel stuff = new JLabel();
	ArrayList<String> guests = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook xD = new GuestBook();
		xD.wat();
	}
	void wat() {
		frame.add(panel);
		panel.add(stuff);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		add.setText("Add Person");
		view.setText("View People");
		stuff.setText("Party currently contains "+guests.size()+" people. \n Add people by clicking Add Person. View the list by clicking View People.");
		frame.setVisible(true);
		frame.pack();
		//guests.add("wwewe");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			String added = JOptionPane.showInputDialog("Who are you adding?");
			guests.add(added);
			stuff.setText("Party currently contains "+guests.size()+" people. \n Add people by clicking Add Person. View the list by clicking View People.");
		}else { 
			String s="";
			for(int i=0; i<guests.size(); i++) {
				String n = guests.get(i);
				s+="Guest #"+(i+1)+": "+n+"\n";
			} 
			if(s=="") {
				JOptionPane.showMessageDialog(null, "Theres nothing in there!");
			}else {
				JOptionPane.showMessageDialog(null, s);
			}
		}
	}
}
