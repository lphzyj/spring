package com.lph.app.core.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;
import com.lph.app.core.common.HibernateTemplate;
import com.lph.app.core.dao.StockDao;
import com.lph.app.core.entity.Stock;
@Repository("stockDaoImpl")
public class StockDaoImpl extends HibernateTemplate implements StockDao {

    
//    @Transactional
    @Override
    public void save(Stock stock) {
	getHibernateTemplate().save(stock);
    }

    @Override
    public void update(Stock stock) {
	getHibernateTemplate().update(stock);
    }

    @Override
    public void delete(Stock stock) {
	getHibernateTemplate().delete(stock);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Stock findByStockCode(String stockCode) {
	List list = getHibernateTemplate().find("from Stock where stockCode=?", stockCode);
	return (Stock) list.get(0);
    }

}
