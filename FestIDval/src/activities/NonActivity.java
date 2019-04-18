package activities;

public class NonActivity extends RuntimeException{
	public NonActivity(){}
	public NonActivity(String details){super(details);}
}
