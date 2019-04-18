package core;

import java.util.ArrayList;
import concretes.*;
import activities.*;
import moods.*;

public class FestIDval {

	public static void main(String[] args) {
		MoodCore.init_map();
		/*for(ArrayList<MoodCore> it:MoodCore.moods_map)
		{for(MoodCore it2:it)
			System.out.print(it2.getName()+ " ");
		System.out.println(" ");
		}*/
		
		Festival iswint = new ISWinT();
		iswint.load(26,Time.STARTISWINT1,Time.ENDISWINT1,67000); 
		Person stefi = new Organizer("Stefi",22);
		Organizer stefi_o = (Organizer)stefi;
		Person luca = new Organizer("Luca",21);
		iswint.addOrganizer((Organizer)luca);
		iswint.addOrganizer(stefi_o);//aggregation<- this because of SOrCE
		Person omar =new Participant("Omar",23,Country.ARABIA);
		Participant omar_p = (Participant)omar;
		iswint.addParticipant((Participant)omar);
		((ISWinT)iswint).addWSH(new Workshop("Bettering the world","inset some description here"));
		Workshop BTW_wsh = ((ISWinT)iswint).getWSH("Bettering the world");
		BTW_wsh.addParticipant((Participant)omar);
		
		Activity walk = new ActivityWalk();
		Activity org_party= new ActivityOrgParty();
		
		
		stefi.planActivity(walk);
		stefi.planActivity(org_party);
		MoodCore test= stefi.doActivity();
		System.out.println(test.getName()+" "+test.getProgress());
		test = stefi.doActivity();
		System.out.println(test.getName()+" "+test.getProgress());
		
		iswint.seeOrganizers();
		iswint.seeParticipants();
		((ISWinT)iswint).seeWorkshops();
	}

}
