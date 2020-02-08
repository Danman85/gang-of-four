package nl.danman85.gang.of.four.patterns.builder;

public class Chair {

	private String legType;
	private int legCount;
	private String seat;
	private String armRests;
	private boolean isVarnished;
	public void setLegType(String legType) {
		this.legType = legType;
	}
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public void setArmRests(String armRests) {
		this.armRests = armRests;
	}
	public void setVarnished(boolean isVarnished) {
		this.isVarnished = isVarnished;
	}
	
	@Override
	public String toString() {
		return "Chair [legType=" + legType + ", legCount=" + legCount + ", seat=" + seat + ", armRests=" + armRests
				+ ", isVarnished=" + isVarnished + "]";
	}
	
}
