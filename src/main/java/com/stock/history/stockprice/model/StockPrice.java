package com.stock.history.stockprice.model;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "stock_prices")
@IdClass(StockPriceId.class)
public class StockPrice implements Serializable {
    @Id
    @Column(name = "stock_code")
    String stockCode;
    @Id
    @Column(name = "timestamp")
    Date timestamp;
    @Column(name = "price")
    double price;
}
