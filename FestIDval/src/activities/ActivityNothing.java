package activities;
import moods.*;
import concretes.Person;
import core.Organizer;
import core.Participant;

public class ActivityNothing extends ActivityCore implements ActivityPers{
	public ActivityNothing(){
		super();
		name = "Nothing";
		energyDecrease=1; 
	}
	@Override
	public MoodCore perform(Person p){
		System.out.println("Hello! I am "+ p.getName() +" and I do nothing");
		return p.getMood();
	}
	public MoodCore perform(Organizer p){
		System.out.println("Hello! I am "+ p.getName() +" and I do nothing");
		return p.getMood();
	}
	public MoodCore perform(Participant p){
		System.out.println("Hello! I am "+ p.getName() +" and I do nothing");
		return p.getMood();
	}
	
	
}