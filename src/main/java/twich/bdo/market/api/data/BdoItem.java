package twich.bdo.market.api.data;

public class BdoItem {

    private String name;
    private long id;
    private MarketData marketData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MarketData getMarketData() {
        return marketData;
    }

    public void setMarketData(MarketData marketData) {
        this.marketData = marketData;
    }

    @Override
    public String toString() {
        return "BdoItem{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marketData=" + marketData +
                '}';
    }
}
