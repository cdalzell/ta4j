package eu.verdelhan.ta4j.indicators.simple;

import eu.verdelhan.ta4j.TimeSeries;
import eu.verdelhan.ta4j.mocks.MockTimeSeries;
import static org.assertj.core.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class OpenPriceIndicatorTest {
	private OpenPriceIndicator openPriceIndicator;

	TimeSeries timeSeries;

	@Before
	public void setUp() {
		timeSeries = new MockTimeSeries();
		openPriceIndicator = new OpenPriceIndicator(timeSeries);
	}

	@Test
	public void testIndicatorShouldRetrieveTickOpenPrice() {
		for (int i = 0; i < 10; i++) {
			assertThat(timeSeries.getTick(i).getOpenPrice()).isEqualTo(openPriceIndicator.getValue(i));
		}
	}
}