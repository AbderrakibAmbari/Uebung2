package mvc1;

public class AnwendersystemControl {
	private Course model;
	private AnwendersystemView view;
	public AnwendersystemControl(Course model, AnwendersystemView view) {
		
		this.model = model;
		this.view = view;
	}
	
	
	public String getCourseName() {
		return model.getCourseName();
	}
	public void setCourseName(String courseName) {
		model.setCourseName(courseName);
	}
	public String getCourseId() {
		return model.getCourseId();
	}
	public void setCourseId(String courseId) {
		model.setCourseId(courseId);
	}
	public String getCourseStrategy() {
		return model.getCourseStrategy();
	}
	public void setCourseStrategy(String courseStrategy) {
		model.setCourseStrategy(courseStrategy);
	}
	public void updateView() {
		view.printdetails(model.getCourseName(), model.getCourseId(), model.getCourseStrategy());
	}
	
	
}
