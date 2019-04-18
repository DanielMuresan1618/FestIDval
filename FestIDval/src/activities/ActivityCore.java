package activities;

import java.util.ArrayList;

import concretes.Person;
import moods.*;

abstract public class ActivityCore {
	protected String name;
	protected int rnd_1;
	protected int rnd_2;
	
	protected int energyDecrease;
	//functie de update dinamica; vine
	
	
	public String getName(){
		return name;
	}
	public int getEngDec(){
		return energyDecrease;
	}
	public MoodCore react(Person p,MoodCore m){
		int new_energy=p.getEnergy()-energyDecrease;
		if (new_energy<=0) //too tired
			return m;
		int in=-1,rez;
		ArrayList<MoodCore> current= new ArrayList<MoodCore>();
		for(ArrayList<MoodCore> it:MoodCore.moods_map){ //find Mood grouping
			if (it.indexOf(m)!=-1){ //found the current mood in the map
				current = it;
				in = MoodCore.moods_map.indexOf(it);
				break;
			}
		}
		
		if (current.isEmpty())
			System.err.println("ArrayList empty");				
		if (m.getProgress()<0) //bad current mood
			rez = (int)(Math.random()*rnd_2+rnd_1 + m.getProgress()*10/p.getEnergy() ); // replace 10 if needed
		else
			rez = (int)(Math.random()*rnd_2+rnd_1 + m.getProgress()*p.getEnergy()/100 ); // replace 100 if needed
		
		MoodCore new_m;
		if (in!=-1){
		if (rez>=100)
			while(rez>=100  && in<MoodCore.moods_map.size()-1){ //progress superior, caut Mood superior
				in++;
				rez-=100;
			}
		if (rez<=-100 )
			while(rez<=-100 && in>0){ //progress superior, caut Mood superior
				in--;
				rez+=100;
			}
			ArrayList<MoodCore> aux = MoodCore.moods_map.get(in);
		new_m=aux.get((int)(Math.random()*(aux.size()-1))); 
		MoodCore fin = new_m.copy();
		fin.setProgress(rez);
		return fin;
		}
		else return m;
	}

}
