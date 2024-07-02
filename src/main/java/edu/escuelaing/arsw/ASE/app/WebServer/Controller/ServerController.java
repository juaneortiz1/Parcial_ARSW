package edu.escuelaing.arsw.ASE.app.WebServer.Controller;

import edu.escuelaing.arsw.ASE.app.WebServer.CacheQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Controller in charge of handling client request
 */
@RestController
public class ServerController {

    @Autowired
    private CacheQuery apiCache;

    /**
     * Controller method in charge of handling client's petition based on params
     * @param function param that defines query for time
     * @param symbol para that defines what company the client wants
     * @return Information requested in JS requested
     */
    @GetMapping("/ServerController")
    public String getApiData(
            @RequestParam String function, @RequestParam String symbol
    ) {
        String cachedResponse = apiCache.get(symbol);

        if (cachedResponse != null) {
            return cachedResponse;
        }

        String apiUrl = "https://www.alphavantage.co/query?function=" + function + "&symbol=" + symbol;

        if ("TIME_SERIES_INTRADAY".equals(function)) {
            apiUrl += "&interval=5min&outputsize=full";
        }

        apiUrl += "&apikey=demo";

        RestTemplate restTemplate = new RestTemplate();
        String apiResponse = restTemplate.getForObject(apiUrl, String.class);

        apiCache.put(symbol, apiResponse);

        return apiResponse;
    }
}

