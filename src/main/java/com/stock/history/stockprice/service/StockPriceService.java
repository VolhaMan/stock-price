package com.stock.history.stockprice.service;

import com.stock.history.stockprice.model.StockPrice;
import com.stock.history.stockprice.repository.StockPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockPriceService {
    @Autowired
    StockPriceRepository stockPriceRepository;

    public List<StockPrice> getHistory(String stockCode) {
        return stockPriceRepository.findByStockCode(stockCode);
    }
}
