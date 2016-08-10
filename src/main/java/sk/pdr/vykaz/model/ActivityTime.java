package sk.pdr.vykaz.model;

import java.time.LocalDateTime;

public class ActivityTime extends AbstractEntity {
	private LocalDateTime start;
	private LocalDateTime end;
	private Activity activity;
	
	public ActivityTime(LocalDateTime start, LocalDateTime end, Activity activity) {
		this(start, end);
		this.setActivity(activity);
	}
	
	public ActivityTime(LocalDateTime start, LocalDateTime end) {
		this.start = start;
		this.end = end;
	} 
	
	public ActivityTime() {}
	
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
}
