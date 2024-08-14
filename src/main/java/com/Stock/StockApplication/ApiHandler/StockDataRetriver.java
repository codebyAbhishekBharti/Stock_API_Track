package com.Stock.StockApplication.ApiHandler;

import com.Stock.StockApplication.entity.StockData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class responsible for retrieving stock data from an external API.
 */
public class StockDataRetriver {

    /**
     * Default constructor.
     */
    public StockDataRetriver() {
    }

    /**
     * Fetches stock information for a given symbol using the Alpha Vantage API.
     *
     * @param symbol the stock symbol to fetch information for
     * @return a StockData object containing the stock information, or null if an error occurs
     */
    public StockData FetchStockInfo(String symbol) {
        String apiKey = "O20WGJA6FBJ0RTQM";
        String interval = "1min";
        try {
            String urlString = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol="
                    + symbol + "&interval=" + interval + "&apikey=" + apiKey;

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuffer content;
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String inputLine;
                    content = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                }

                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonre = objectMapper.readTree(content.toString());

                JsonNode metaData = jsonre.get("Meta Data");
                String symbolMeta = metaData.get("2. Symbol").asText();
                String lastRefreshed = metaData.get("3. Last Refreshed").asText();
                JsonNode timeSeries = jsonre.get("Time Series (1min)");

                String firstTimestamp = timeSeries.fieldNames().next();
                JsonNode data = timeSeries.get(firstTimestamp);
                Double open = Double.parseDouble(data.get("1. open").asText());
                Double high = Double.parseDouble(data.get("2. high").asText());
                String low = data.get("3. low").asText();
                Double close = Double.parseDouble(data.get("4. close").asText());
                Integer volume = Integer.parseInt(data.get("5. volume").asText());
                Double change = close - open;
                Double percentChange = (change / open) * 100;

                StockData stockData = new StockData(symbolMeta, open, close, lastRefreshed, change, percentChange, volume);
                return stockData;
            } else {
                return null;
            }
        } catch (IOException | JSONException e) {
            return null;
        }
    }

}
