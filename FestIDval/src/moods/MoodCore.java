package moods;
import java.util.ArrayList;

abstract public class MoodCore {
	protected String name;
	protected int progress; // the bar
	public static final ArrayList<ArrayList<MoodCore>> moods_map = new ArrayList<ArrayList<MoodCore>>();
	protected boolean doable;
	public MoodCore (int p){
		progress = p;

	}
	public static void init_map(){
		//primele sunt emotii POZITIVE, ca sunt my likely sa apara si timpul de cautare e mai bun
		ArrayList<MoodCore> happy = new ArrayList<MoodCore>()
		{{
			add(new MoodHappy(0));
			}};
		ArrayList<MoodCore> joyful = new ArrayList<MoodCore>()
			{{
				add(new MoodJoyful(0));
				}};
		ArrayList<MoodCore> neutral = new ArrayList<MoodCore>()
		{{
			add(new MoodNeutral(0));
		}};
		ArrayList<MoodCore> angry = new ArrayList<MoodCore>()
		{{
			add(new MoodAngry(0));
		}};
		moods_map.add(happy);
		moods_map.add(joyful);
		moods_map.add(neutral);
		moods_map.add(angry);
	}
	public String getName(){
		return name;
	}
	public int getProgress(){
		return progress;
	}	
	public boolean is_doable(){
		return doable;
	}
	@Override
	public boolean equals(Object o){
		if (o==this)
			return true;
		if (o instanceof MoodCore){
			MoodCore m = (MoodCore) o;
			if (name.equals(m.name))
				//System.out.println("A MERS COMPARATIA");
			 
				return true;

		}
		return false;
	}
	abstract public MoodCore copy();
	public void setProgress(int x){
		progress = x;
	}
	
	
	/* activitatile sa implementez interfete mood? dar atunci activitatile vor incapsula informatii
	 * despre mood si nu vreau asta...
	 * Mood separat de activity!!!
	 * reactiile hormonale separate de desfasurarea activitatii!
	 * activitatea da doar roll de mood
	 * ce activitati poate sa dea o activitate? numai cateva
	 * se pare ca voi returna tipuri concrete
	 * deci roll mood va fi un factory
	 */
}