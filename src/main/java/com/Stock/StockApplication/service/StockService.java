package com.Stock.StockApplication.service;

import com.Stock.StockApplication.entity.StockData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.Stock.StockApplication.ApiHandler.StockDataRetriver;

/**
 * Service class for retrieving stock information.
 */
@Service
public class StockService {

    /**
     * Retrieves stock information for multiple stock symbols.
     *
     * @param symbols a comma-separated list of stock symbols
     * @return a list of stock data for the specified symbols
     */
    public List<StockData> getStocksInfo(String symbols) {
        String[] separatedSymbols = symbols.split(",");
        ArrayList<StockData> stockList = new ArrayList<>();
        StockDataRetriver stockDataRetriver = new StockDataRetriver();

        for (String i : separatedSymbols) {
            stockList.add(stockDataRetriver.FetchStockInfo(i.trim()));
        }

        return stockList;
    }

}
