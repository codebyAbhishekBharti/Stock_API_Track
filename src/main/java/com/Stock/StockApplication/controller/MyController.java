package com.Stock.StockApplication.controller;

import com.Stock.StockApplication.ApiHandler.StockDataRetriver;
import com.Stock.StockApplication.entity.StockData;
import com.Stock.StockApplication.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for handling stock-related requests.
 */
@RestController
public class MyController {

    /**
     * Retrieves stock information for a specific symbol.
     *
     * @param symbol the stock symbol to retrieve information for
     * @return the stock data for the specified symbol
     */
    @GetMapping("/stock/{symbol}")
    public StockData stockInfo(@PathVariable String symbol) {
        StockDataRetriver stockService = new StockDataRetriver();
        return stockService.FetchStockInfo(symbol);
    }

    /**
     * Retrieves stock information for multiple symbols.
     *
     * @param symbols a comma-separated list of stock symbols
     * @return a list of stock data for the specified symbols
     */
    @GetMapping("stocks/{symbols}")
    public List<StockData> stocksInfo(@PathVariable String symbols) {
        StockService stockService = new StockService();
        return stockService.getStocksInfo(symbols);
    }

}
