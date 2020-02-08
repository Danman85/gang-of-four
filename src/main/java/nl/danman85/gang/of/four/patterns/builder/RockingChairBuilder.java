package nl.danman85.gang.of.four.patterns.builder;

public class RockingChairBuilder implements ChairBuilder {

	private Chair chair;
	
	public RockingChairBuilder(final Chair chair) {
		this.chair = chair;
	}

	@Override
	public void buildLegType() {
		this.chair.setLegType("Curved wooden legs");
	}

	@Override
	public void buildSeat() {
		this.chair.setSeat("Wooden bowl with cushion");
	}

	@Override
	public void buildArmRests() {
		this.chair.setArmRests("Decorated ash armrests");
	}

	@Override
	public void varnishChair() {
		this.chair.setVarnished(true);
	}

	@Override
	public void setAmountOfLegs() {
		this.chair.setLegCount(2);
	}

	@Override
	public Chair getChair() {
		return this.chair;
	}

}
