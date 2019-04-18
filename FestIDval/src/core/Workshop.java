package core;
import java.util.*;

import concretes.Person;
public class Workshop {
	private Trainer trainer;
	private String description;
	private String name;
	private ArrayList<Person> participants = new ArrayList<Person> ();
	public Workshop(String n, String d){
		name = n;
		description=d;
	}
	public void addParticipant(Participant w){
		boolean app=false;
		for(Object w1 : participants)
			if ((w1 instanceof Wanted || w1 instanceof Participant) && w1.equals(w))
				{
					app=true;
					break;
				}
		if (!app)
		participants.add(w);
	}
	
	public void setTrainer(Trainer t){
		trainer = t;
	}
	public String getName(){
		return name;
	}
	public boolean equals (Object o){
		if (o==this)
			return true;
		Workshop w = (Workshop) o;
		if (w instanceof Workshop)
			return w.name.equals(name);
		return false;
	}
}
