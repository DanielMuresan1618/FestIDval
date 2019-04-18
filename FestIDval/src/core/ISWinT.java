package core;
import concretes.*;

import java.util.*;

public class ISWinT extends Festival {
	private ArrayList<Workshop> workshop = new ArrayList<Workshop>();
	public void load(int editie, Time p1, Time p2,int bu){
	edition = editie;
	beginPeriod=p1;
	endPeriod=p2;
	budget=bu;
	name="ISWinT";
	}
	public void addWSH(Workshop w){
		boolean app=false;
		for(Workshop w1 : workshop)
			if (w1.equals(w))
				{
					app=true;
					break;
				}
		if (!app)
		workshop.add(w);
	}	
	public void removeWSH(Workshop w){
		for(Workshop w1 : workshop)
			if (w1.equals(w))
				{
					workshop.remove(w1);
					break;
				}
	}
	public Workshop getWSH(String name){
		for(Workshop w1 : workshop)
			if (name.equals(w1.getName()))
				return w1;
			return null;
	}
	public void seeWorkshops(){
		System.out.println("");
		for(Workshop w:workshop)
			System.out.print(w.getName()+ " ");
	}
	public void removeWSH(int x){
		workshop.remove(x);
	}
}
