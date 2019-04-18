package activities;

import core.Organizer;
import moods.MoodCore;

public class ActivityOrgParty extends ActivityCore implements ActivityOrg {

	
	public ActivityOrgParty(){
		super();
		energyDecrease=30;
		name="Walking";
		rnd_1=0;
		rnd_2=-150;
	}
	public MoodCore perform(Organizer o) {
		
		MoodCore m = react(o,o.getMood());
		
		return m;
	}

}
