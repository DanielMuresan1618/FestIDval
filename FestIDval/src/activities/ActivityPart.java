package activities;
import core.Participant;
import moods.*;

public interface ActivityPart extends Activity{
	 public MoodCore perform(Participant p) ;
}
