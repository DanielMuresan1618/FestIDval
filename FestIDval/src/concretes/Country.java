package concretes;

public class Country {
	protected String name;
	protected String continent;
	protected long surface;
	protected String language;
	protected String coin;
	protected String religion;
	public Country(String _name, String _continent, String _language, String _coin, String _religion,long _surface){
		name=_name;
		continent=_continent;
		language=_language;
		coin=_coin;
		religion=_religion;
		surface=_surface;
	}
	
	public String getName(){
		return name;
	}
	public String getReligion(){
		return religion;
	}
	public String getContinent(){
		return continent;
	}
	public String getCoin(){
		return coin;
	}
	public String getLanguage(){
		return language;
	}
	public long getSurface(){
		return surface;
	}
public static final Country ROMANIA = new Country ("Romania","Europe","romanian","lei","orthodox",200000);
public static final Country ARABIA = new Country ("ARABIA","ASIA","arabian","?","islam",1000000);
}

