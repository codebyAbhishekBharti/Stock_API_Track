package com.Stock.StockApplication.entity;

/**
 * Represents stock data for a specific stock symbol, including prices, changes, and volume.
 */
public class StockData {
    // The stock symbol (e.g., "AAPL" for Apple Inc.).
    private String symbol;

    // The opening price of the stock.
    private Double openPrice;

    // The closing price of the stock.
    private Double closePrice;

    // The timestamp indicating the latest update time.
    private String timeStamp;

    // The change in price from open to close.
    private Double change;

    // The percentage change in price from open to close.
    private Double percentChange;

    // The trading volume for the stock.
    private Integer volume;

    /**
     * Default constructor.
     */
    public StockData() {
    }

    /**
     * Constructs a new StockData instance with specified details.
     *
     * @param symbol        the stock symbol
     * @param openPrice     the opening price
     * @param closePrice    the closing price
     * @param timeStamp     the latest update timestamp
     * @param change        the change in price
     * @param percentChange the percentage change in price
     * @param volume        the trading volume
     */
    public StockData(String symbol, Double openPrice, Double closePrice, String timeStamp, Double change, Double percentChange, Integer volume) {
        this.symbol = symbol;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.timeStamp = timeStamp;
        this.change = change;
        this.percentChange = percentChange;
        this.volume = volume;
    }

    /**
     * Gets the stock symbol.
     *
     * @return the stock symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the stock symbol.
     *
     * @param symbol the stock symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets the opening price.
     *
     * @return the opening price
     */
    public Double getOpeningPrice() {
        return openPrice;
    }

    /**
     * Sets the opening price.
     *
     * @param openPrice the opening price to set
     */
    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    /**
     * Gets the closing price.
     *
     * @return the closing price
     */
    public Double getClosingPrice() {
        return closePrice;
    }

    /**
     * Sets the closing price.
     *
     * @param closePrice the closing price to set
     */
    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    /**
     * Gets the latest update timestamp.
     *
     * @return the latest update timestamp
     */
    public String getLatestTime() {
        return timeStamp;
    }

    /**
     * Sets the latest update timestamp.
     *
     * @param timeStamp the latest update timestamp to set
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Gets the price change.
     *
     * @return the price change
     */
    public Double getChange() {
        return change;
    }

    /**
     * Sets the price change.
     *
     * @param change the price change to set
     */
    public void setChange(Double change) {
        this.change = change;
    }

    /**
     * Gets the percentage change in price.
     *
     * @return the percentage change in price
     */
    public Double getPercentChange() {
        return percentChange;
    }

    /**
     * Sets the percentage change in price.
     *
     * @param percentChange the percentage change to set
     */
    public void setPercentChange(Double percentChange) {
        this.percentChange = percentChange;
    }

    /**
     * Gets the trading volume.
     *
     * @return the trading volume
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Sets the trading volume.
     *
     * @param volume the trading volume to set
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
