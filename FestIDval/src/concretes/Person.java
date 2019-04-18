package concretes;
import activities.*;

import java.util.LinkedList;
import moods.*;

public class Person {
	protected String name;
	protected int age;
	protected Country country;
	//lista de activitati; prima e cea ongoing
	//protected LinkedList<ActivityCore> activities= new LinkedList<ActivityCore> ();
	protected MoodCore mood; 
	protected Location location;
	protected LinkedList<Activity> activities_ref= new LinkedList<Activity> ();
	protected boolean location_set = false; 
	protected int energy;
	
	public Person(String n,int a, Country c){
		name = n;
		age =a ;
		country = c;
		activities_ref.addFirst(new ActivityNothing());
		location = Location.NOWHERE;
		energy=100;
		mood = new MoodNeutral(0);	
	}
	public void setLocation(Location l){
		if (!location_set)
		{
			location = l;
			location_set = true;
		}
	}
	public MoodCore getMood(){
		return mood;
	}
	public Location getLocation(){
		return location;
	}
	public String getName(){
		return name;
	}
	public int getEnergy(){
		return energy;
	}
	public LinkedList<Activity> getActivities(){
		return activities_ref;
	}
	public void planActivity(Activity a) throws NonActivity{
		if (a instanceof ActivityCore){
			if (a instanceof ActivityPers){
				ActivityPers a1 = (ActivityPers)a;
				activities_ref.add(activities_ref.size()-1,a1);
			}
			else {System.err.println("(Pers)planActivity(a), a nu e activitate");
			throw new NonActivity("(Pers)planActivity(a), a nu e activitate");
		}}
	else
		{System.err.println("(Org)planActivity(a) nu e interfata buna");
		throw new NonActivity("(Pers)planActivity(a), a nu e interfata acceptata");
		}
	}
	public MoodCore doActivity() throws NonActivity{ 
		Activity a;
		if (activities_ref.size()>1) //has something to do
		a =activities_ref.pop();
		else
		a=activities_ref.getFirst(); //never pop ActivityNothing!
		
		if (a instanceof ActivityCore) // safety check
			if (a instanceof ActivityPers){ 
				ActivityPers a1= (ActivityPers)a;				
				mood=a1.perform(this);
				return mood;
			}
			else{
				System.err.println("(Pers)doActivity(a) nu e interfata buna");
				throw new NonActivity("(Pers)doActivity(a), a nu e interfata acceptata");
			}
		else {
		System.err.println("(Pers)doActivity(a), a nu e activitate");
		throw new NonActivity("(Pers)doActivity(a), a nu e activitate");
		}
	}
}
