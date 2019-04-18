package activities;

import core.Organizer;
import java.util.Scanner;
import core.Participant;
import moods.*;
import concretes.Location;
import concretes.Person;
import java.util.ArrayList;

public class ActivityWalk extends ActivityCore implements ActivityPers,ActivityOrg,ActivityPart{
	Location s;
	Location f;
	
	public ActivityWalk(){
		super();
		energyDecrease=10;
		name="Walking";
		rnd_1=-10;
		rnd_2=20;
	}
	public MoodCore perform(Person p){
		MoodCore param = p.getMood();
		MoodCore m = react(p,param);
		
		/*s= p.getLocation();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Where should "+p.getName() +" go?");
		f = new Location(keyboard.nextDouble(),keyboard.nextDouble(), "Unknown");
		keyboard.close(); */
			System.out.println("Hello! I amm "+ p.getName());
		//System.out.println("Hello! I am "+ p.getName() +" and I walk from " + s.getX()+","+s.getY() + " to " + f.getX()+","+f.getY());
		return m;
		
	}
	public MoodCore perform(Organizer p){
		System.out.println("Org:");
		return perform((Person)p);
	}
	public MoodCore perform(Participant p){
		System.out.println("Part:");
		return perform((Person)p);	
	}
}
