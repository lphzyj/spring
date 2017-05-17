package com.lph.app.core.dao;

import com.lph.app.core.entity.Stock;

public interface StockDao {

    void save(Stock stock);

    void update(Stock stock);

    void delete(Stock stock);

    Stock findByStockCode(String stockCode);
}
