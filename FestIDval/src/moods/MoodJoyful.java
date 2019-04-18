package moods;

public class MoodJoyful extends MoodCore implements MoodClone{
	public MoodJoyful (int p){
		super (p);
		name="Joyful";
	}

	@Override
	public MoodCore copy() {
			MoodCore m =null;
			try {
				m = (MoodJoyful)super.clone();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}
			return m;
		}
}
