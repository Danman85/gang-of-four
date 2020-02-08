package nl.danman85.gang.of.four.patterns.builder;

public class Carpenter {

	private ChairBuilder chairBuilder;
	
	public Carpenter(final ChairBuilder chairBuilder) {
		this.chairBuilder = chairBuilder;
	}

	public Chair constructChair() {
		this.chairBuilder.buildLegType();
		this.chairBuilder.buildSeat();
		this.chairBuilder.buildArmRests();
		this.chairBuilder.varnishChair();
		this.chairBuilder.setAmountOfLegs();
		
		return this.chairBuilder.getChair();
	}
}
