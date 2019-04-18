package concretes;

public class Location {
	protected double x; // x coordinate
	protected double y; // y coordinate
	protected String name;
	public Location(double _x, double _y, String _name){
		x=_x;
		y=_y;
		name=_name;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String getName(){
		return name;
	}
//static finals are the way!	
	public static final Location Camin21 = new Location (45.747308, 21.236575,"Camin21");
	public static final Location CATEDRALA = new Location (45.750572, 21.224130, "Catedrala Mitropolitana Ortodoxa");
public static final Location NOWHERE = new Location(0,0,"NOWHERE");
}
