package com.Stock.StockApplication.service;

import com.Stock.StockApplication.entity.StockData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.Stock.StockApplication.ApiHandler.StockDataRetriver;
@Service
public class StockService {
    public List<StockData> getStocksInfo(String symbols){
        String[] separatedSymbols= symbols.split(",");
        ArrayList<StockData> stockList= new ArrayList<>();
        StockDataRetriver stockDataRetriver = new StockDataRetriver();
        for(String i: separatedSymbols){
           stockList.add(stockDataRetriver.FetchStockInfo(i.trim()));
        }
        return stockList;
    }

}
