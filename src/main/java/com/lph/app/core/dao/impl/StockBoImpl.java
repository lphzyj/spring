package com.lph.app.core.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lph.app.core.dao.StockDao;
import com.lph.app.core.entity.Stock;
@Service("stockBoImpl")
@Transactional
public class StockBoImpl implements StockDao {
    
    @Autowired
    StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
	this.stockDao = stockDao;
    }

    public void save(Stock stock) {
	stockDao.save(stock);
    }

    public void update(Stock stock) {
	stockDao.update(stock);
    }

    public void delete(Stock stock) {
	stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
	return stockDao.findByStockCode(stockCode);
    }

}
