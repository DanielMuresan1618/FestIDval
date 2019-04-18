package concretes;

public class Time {
	private int h;
	private int m;
	private int s;
	private int day;
	private int month;
	private int year;
	public Time (int _day,int _month,int _year,int _h, int _m, int _s){
		day = _day;
		month = _month;
		year = _year;
		h=_h;
		m=_m;
		s=_s;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public int getH(){
		return h;
	}
	public int getM(){
		return m;
	}
	public int getS(){
		return s;
	}
	public static final Time STARTISWINT1 = new Time (25,7,2019,0,0,0);
	public static final Time ENDISWINT1 = new Time (3,8,2019,23,59,59);
}
