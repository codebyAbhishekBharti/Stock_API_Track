package com.Stock.StockApplication.entity;

public class StockData {
    private String symbol;
    private Double openPrice;
    private Double closePrice;
    private String timeStamp;
    private Double change;
    private Double percentChange;
    private Integer volume;

    public StockData() {
    }

    public StockData(String symbol, Double openPrice, Double closePrice, String timeStamp, Double change, Double percentChange, Integer volume) {
        this.symbol = symbol;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.timeStamp = timeStamp;
        this.change = change;
        this.percentChange = percentChange;
        this.volume = volume;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getOpeningPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getClosingPrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public String getLatestTime() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(Double percentChange) {
        this.percentChange = percentChange;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "symbol='" + symbol + '\'' +
                ",\n openPrice=" + openPrice +
                ",\n closePrice=" + closePrice +
                ".\n timeStamp='" + timeStamp + '\'' +
                ",\n change=" + change +
                ",\n percentChange=" + percentChange +
                ",\n volume=" + volume +
                '}';
    }
}
