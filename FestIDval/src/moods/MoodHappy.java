package moods;

public class MoodHappy extends MoodCore implements MoodClone {
	public MoodHappy (int p){
		super (p);
		name="Happy";
	
	}

	@Override
	public MoodCore copy() {
		
			MoodCore m =null;
			try {
				m = (MoodHappy)super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}
			return m;
		}
	
}
