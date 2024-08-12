package com.Stock.StockApplication.controller;

import com.Stock.StockApplication.ApiHandler.StockDataRetriver;
import com.Stock.StockApplication.entity.StockData;
import com.Stock.StockApplication.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MyController {
    @GetMapping("/stock/{symbol}")
    public StockData stockInfo(@PathVariable String symbol){
        StockDataRetriver stockService = new StockDataRetriver();
        return stockService.FetchStockInfo(symbol);
    }
    @GetMapping("stocks/{symbols}")
    public List<StockData> stocksInfo(@PathVariable String symbols){
        StockService stockService = new StockService();
        return stockService.getStocksInfo(symbols);
    }

}
