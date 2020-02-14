
public class TimePeriod {
	private int hours;
	private int minutes;

	public TimePeriod() {
		this.hours = 0;
		this.minutes = 0;
	}

	public void addHours(int hoursToAdd) {
		if (hoursToAdd >= 0 && this.hours < 99)
			this.hours += hoursToAdd;
	}

	public void addMinutes(int minutesToAdd) {
		if (minutesToAdd >= 0 && minutesToAdd < 60 && this.hours < 99)
			this.minutes += minutesToAdd;
		if (this.minutes >= 60) {
			if (this.hours < 99) {
				this.minutes -= 60;
				this.hours++;
			}
			else
				this.minutes -= minutesToAdd;
		}
	}

	public String toString() {
		return this.hours + " h " + this.minutes + " min";
	}
}
