package nl.danman85.gang.of.four.patterns.builder;

public interface ChairBuilder {
	
	void buildLegType();
	void buildSeat();
	void buildArmRests();
	void varnishChair();
	void setAmountOfLegs();
	Chair getChair();
}
