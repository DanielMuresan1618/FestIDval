package core;
import activities.*;
import moods.*;
import concretes.*;

public class Participant extends Person{
	private Workshop wsh;
	public Participant (String n,int a, Country c){
		super (n,a,c);
	}
@Override
public void planActivity(Activity a) throws NonActivity{
	int len =activities_ref.size();
	if (a instanceof ActivityCore){
		if (a instanceof ActivityPart){
			ActivityPart a1 = (ActivityPart)a;
			if (len==0)
				activities_ref.add(len,a1);
				else 
					activities_ref.add(len-1,a1);
		}
		else{
			System.err.println("(Part-Part)planActivity(a) nu e interfata buna"); 
			throw new NonActivity("(Part-Part)planActivity(a) nu e interfata buna");
		}
		if (a instanceof ActivityPers){
			ActivityPers a1 = (ActivityPers)a;
			if (len==0)
				activities_ref.add(len,a1);
				else 
					activities_ref.add(len-1,a1);
			}
		else{
			System.err.println("(Part-Pers)planActivity(a) nu e interfata buna"); 
			throw new NonActivity("(Part-Pers)planActivity(a) nu e interfata buna");
		}}
			else{
				System.err.println("(Part)planActivity(a), a nu e activitate");
				throw new NonActivity("(Part)planActivity(a), a nu e activitate");
			}
}
	
	@Override
	public MoodCore doActivity() throws NonActivity{ //accept visitor
		Activity a;
		if (activities_ref.size()>1)
		a =activities_ref.pop();
		else
		a=activities_ref.getFirst();
		if (a instanceof ActivityCore){
			if (a instanceof ActivityPart){
				ActivityPart a1 = (ActivityPart)a;
				mood= a1.perform(this);//<--new version
			}
			else{ 
				System.err.println("(Part-Part)doActivity(a) nu e interfata buna");
				throw new NonActivity("(Part-Part)doActivity(a) nu e interfata buna");
			}		
			return mood;
		}
		else 
		{System.err.println("(Part)doActivity(a), a nu e activitate");
		throw new NonActivity("(Part)doActivity(a), a nu e activitate");
		}
	}
	public void setWSH(Workshop w){
		wsh=w;
	}
}
