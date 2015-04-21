package mvc.supereasyexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		
		this.view.setButtonListeners(this);
		this.view.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		if ("Today's Date".equals(actionCommand)) {
			String currentDate = model.getCurrentDate();
			view.setCurrentDate(currentDate);
		}
	}
}
