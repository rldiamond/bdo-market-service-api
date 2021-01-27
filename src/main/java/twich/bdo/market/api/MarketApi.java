package twich.bdo.market.api;


import twich.bdo.market.api.data.BdoItem;

import java.util.Optional;

/**
 * Interface for accessing the Black Desert Market API using Java POJOs.
 * <p>
 * As the speed of the API used can be unpredictable, it is recommended that these be called in a separate thread/process.
 *
 */
public interface MarketApi {

    /**
     * Fetches a {@link BdoItem} from the API by ID. Will return an empty Optional if the item is not found.
     *
     * @param id The ID of the item to fetch from the API.
     * @return A nullable Optional containing the BdoItem requested.
     */
    Optional<BdoItem> getItemById(long id);


}
