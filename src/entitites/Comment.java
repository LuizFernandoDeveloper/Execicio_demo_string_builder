package entitites;

public class Comment {

	private String text ;
	
	public Comment() { // Construtor padrão
		
	}
	public Comment(String text) { // Segundo construtor 
		
		this.text = text;
		
		
	}
	
	//get and set 
	
	public String getText() {
		
		return text;
		
	}
	
	public void setText(String text) {
		
		this.text = text;
		
	}
}
