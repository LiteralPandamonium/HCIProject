package model;

public class Task {

	public String name;
	public double plannedHours;
	public double completedHours;
	public int status;
	
	public Task() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPlannedHours() {
		return plannedHours;
	}

	public void setPlannedHours(double plannedHours) {
		this.plannedHours = plannedHours;
	}

	public double getCompletedHours() {
		return completedHours;
	}

	public void setCompletedHours(double completedHours) {
		this.completedHours = completedHours;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public double getRemainingHours() {
		return plannedHours - completedHours;
	}


}