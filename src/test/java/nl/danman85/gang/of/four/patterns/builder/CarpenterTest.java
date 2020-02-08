package nl.danman85.gang.of.four.patterns.builder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CarpenterTest {

	@Test
	public void carpenter_constructsKitchenChair() {
		final KitchenChairBuilder builder = new KitchenChairBuilder(new Chair());
		final Carpenter carpenter = new Carpenter(builder);
		final Chair chair = carpenter.constructChair();
		assertNotNull(chair);
	}

	@Test
	public void carpenter_constructsRockingChair() {
		final RockingChairBuilder builder = new RockingChairBuilder(new Chair());
		final Carpenter carpenter = new Carpenter(builder);
		final Chair chair = carpenter.constructChair();
		assertNotNull(chair);
	}

}
