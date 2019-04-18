package moods;

public class MoodAngry extends MoodCore implements MoodClone{
	public MoodAngry (int p){
		super (p);
		name="Angry";
	
	}

	@Override
	public MoodCore copy() {
		MoodCore m =null;
		try {
			m = (MoodAngry)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return m;
	}
	
//	
}
