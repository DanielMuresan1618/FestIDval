package core;
import java.util.*;

import concretes.Country;

public class Wanted extends Organizer{
	private Workshop wsh;
	public Wanted (String n,int a){
		super (n,a);
	}
	public void setWSH(Workshop w){
		wsh=w;
	}
}
