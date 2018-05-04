import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller implements ChangeListener{
	private DataModel model;
	private GUI view;

	public Controller(GUI g, DataModel d) {
		this.view = g;
		this.model = d;
		model.attatchToModel(this);
		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// Update view
		
	}
}


