package twich.bdo.market.api;

import org.junit.jupiter.api.Test;
import twich.bdo.market.api.data.BdoItem;

public class MarketApiClientTest {

    @Test
    public void testMarketApiClient() {
        String address = "http://twich-net.com:9002/api/";
        MarketApiClient client = MarketApiClient.build(address);
        BdoItem item = client.getItemById(721003).get();

        System.out.println(item);
    }

}
