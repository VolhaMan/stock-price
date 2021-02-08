package com.stock.history.stockprice.controller;
import com.stock.history.stockprice.model.StockPrice;
import com.stock.history.stockprice.service.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockPriceController {
    @Autowired
    StockPriceService stockPriceService;
    @GetMapping("/history")
    public List<StockPrice> getHistory(@RequestParam(value = "stock-code") String stockCode) {
        return stockPriceService.getHistory(stockCode);
    }
}
