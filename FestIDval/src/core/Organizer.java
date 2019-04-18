package core;
import activities.*;
import concretes.Country;
import concretes.Person;
import moods.*;

public class Organizer extends Person{

	public Organizer(String n,int a){
		super (n,a,Country.ROMANIA);
	}
	public void setMood(MoodCore m){
		mood=m;
	}
	@Override
	public boolean equals(Object o){
		if (o==this)
			return true;
		Organizer w = (Organizer ) o;
		if (w instanceof Organizer )
			return w.name.equals(name);
		return false;
	}
	@Override
	public void planActivity(Activity a)throws NonActivity{
		int len =activities_ref.size();	
		if (a instanceof ActivityCore){
				if (a instanceof ActivityOrg){
				ActivityOrg a1 = (ActivityOrg)a;
				
				if (len==0)
				activities_ref.add(len,a1);
				else 
					activities_ref.add(len-1,a1);
				}
		else{ 
			System.err.println("(Org-Org)planActivity(a) nu e interfata buna");
			throw new NonActivity("(Org-Org)planActivity(a) nu e interfata buna");	
		}
			
		}
		else {
			System.err.println("(Org)planActivity(a), a nu e activitate");
			throw new NonActivity("(Org)planActivity(a), a nu e activitate");
		}
	}
	@Override
	public MoodCore doActivity() throws NonActivity{
		Activity a;
		if (activities_ref.size()>1)
		a =activities_ref.pop();
		else
		a=activities_ref.getFirst();
		if (a instanceof ActivityCore){
			
			if (a instanceof ActivityOrg){
					ActivityOrg a1 = (ActivityOrg)a;
					mood=a1.perform(this);//<--new version
					
				}
			else{
			System.err.println("(Org-Org)doActivity(a) nu e interfata buna");
			throw new NonActivity("(Org-Org)doActivity(a) nu e interfata buna");
			}
			
			return mood;
		}
		else{
			System.err.println("(Org)doActivity(a), a nu e activitate");
			throw new NonActivity("(Org)doActivity(a), a nu e activitate");				
				} 
		
		
	}
	public void analyse(Participant p) {	
		try{
		System.out.println(p.getName() + " " + p.getActivities().getClass().getName() + " " + p.getMood().getName());
		}
		catch (NonActivity e){
			System.out.println(p.getName() + " NONACTIVITY!!! " + p.getMood().getName());
		}
	}
}
