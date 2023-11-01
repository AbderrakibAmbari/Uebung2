package mvc1;

public class Main {
	public static void main (String args[]) {
		Course model=new Course();
		model.setCourseId("25");
		model.setCourseName("java");
		model.setCourseStrategy("Hard learning");
		
		AnwendersystemView view=new AnwendersystemView();
		AnwendersystemControl control =new AnwendersystemControl(model,view);
		
		control.updateView();
		control.setCourseName("algorithmen");
		control.setCourseStrategy("theoritische");
		control.updateView();
		
		
		
	}
}
