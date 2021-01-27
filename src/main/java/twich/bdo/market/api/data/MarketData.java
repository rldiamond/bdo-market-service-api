package twich.bdo.market.api.data;

import java.text.DecimalFormat;

/**
 * Data object containing information for an items Market Data.
 */
public class MarketData {

    private long quantityAvailable;
    private double cost;

    public MarketData() {

    }

    /**
     * @return The quantity of item available on the Central Market.
     */
    public long getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * The {@link #getCostFormatted()} method is provided to get a pretty-printed silver value.
     *
     * @return The current cost of item on the Central Market.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Set the quantity of the item available in the Central Market.
     *
     * @param quantityAvailable
     */
    public void setQuantityAvailable(long quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    /**
     * Set the current cost of the item in the Central Market.
     *
     * @param cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Provides easy conversion from an integer cost to a displayable pretty printed silver cost for the item.
     *
     * @return A string formatted with the cost of the item pretty printed in the following template: "#,###s".
     */
    private String getCostFormatted() {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(getCost()) + "s";
    }

    @Override
    public String toString() {
        return "MarketData{" +
                "quantityAvailable=" + quantityAvailable +
                ", cost=" + cost +
                '}';
    }
}
