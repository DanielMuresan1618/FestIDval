package moods;

public class MoodNeutral extends MoodCore implements MoodClone{
	
	public MoodNeutral (int p){
		super (p);
		name = "Neutral";
		
	}

	@Override
	public MoodCore copy() {
		MoodCore m =null;
		try {
			m = (MoodNeutral)super.clone();
			if (m!=null)
				System.out.println(m.getName());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return m;
	}
}
