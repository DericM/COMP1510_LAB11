package q3;

public abstract class Shape {
	
	private String shapeName;
	
	Shape(String shapeName){
		this.shapeName = shapeName;
	}
	
	
	
	public abstract double area();
		
	
	public String toString(){
		return "Shape Name: " + shapeName;
	}
	
	
}
