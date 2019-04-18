package core;
import java.util.ArrayList;

import concretes.Time;

public abstract class Festival {
	
	protected int edition;
	protected Time beginPeriod;
	protected Time endPeriod;
	protected String name;
	protected ArrayList<Organizer> organizers = new ArrayList<Organizer>();
	protected ArrayList<Participant> participants = new ArrayList<Participant>();
	protected double budget;
	abstract public void load(int editie, Time p1, Time p2,int bu);
	public void addOrganizer(Organizer o){
		boolean app=false;
		for(Organizer o1 : organizers)
			if (o1.equals(o))
				{
					app=true;
					break;
				}
		if (!app)
		organizers.add(o);
	}
	public void seeOrganizers(){
		System.out.println("");
		for(Organizer o:organizers)
			System.out.print(o.getName()+ " ");
	}
	public void seeParticipants(){
		System.out.println("");
		for(Participant p:participants)
			System.out.print(p.getName()+ " ");
	}
	public void addParticipant(Participant o){
		boolean app=false;
		for(Participant o1 : participants)
			if (o1.equals(o))
				{
					app=true;
					break;
				}
		if (!app)
		participants.add(o);
	}
	public void removeParticipant(Participant p){
		for(Participant p1: participants)
			if (p1.equals(p))
				{
					participants.remove(p1);
					break;
				}
	}
	public void removeOrganizer(Organizer o){
		for(Organizer o1 : organizers)
			if (o1.equals(o))
				{
				organizers.remove(o1);
					break;
				}
	}
	public void removeParticipant(int x){
		participants.remove(x);
	}
	public void removeOrganizer(int x){
		organizers.remove(x);
	}
	
}
