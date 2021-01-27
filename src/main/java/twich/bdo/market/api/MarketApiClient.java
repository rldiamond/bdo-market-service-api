package twich.bdo.market.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twich.bdo.market.api.data.BdoItem;
import twich.bdo.market.api.rest.RestClient;

import java.util.Optional;

/**
 * This class will be implemented by clients for access to this service.
 */
public class MarketApiClient implements MarketApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarketApiClient.class);

    private static final String GET_ITEM_BY_NAME_ENDPOINT = "/bdo/market/item/name=?";
    private static final String GET_ITEM_BY_ID_ENDPOINT = "/bdo/market/item/id=?";

    private final RestClient myRestClient;


    private MarketApiClient(RestClient restClient) {
        myRestClient = restClient;

    }

    /**
     * Build the Market API Client given the address variable. The address should resolve to the base location of the
     * market API. ex- http://www.bdoapi.mywebsite.com/
     *
     * @param address The address should resolve to the base location of the market API. ex- http://www.bdoapi.mywebsite.com/
     * @return Fully constructed Market API Client
     */
    public static MarketApiClient build(String address) {
        // Construct the rest client
        //todo
        RestClient restClient = RestClient.build(address);
        return new MarketApiClient(restClient);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<BdoItem> getItemByName(String itemName) {
        return Optional.empty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<BdoItem> getItemById(long id) {
        return Optional.empty();
    }
}
