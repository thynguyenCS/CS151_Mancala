
public class MancalaTester {
	public static void main(String[] args) {
	DataModel model = new DataModel();
		GUI view = new GUI(new DataModel());
		
		Controller c = new Controller(view, model);
	}
}
