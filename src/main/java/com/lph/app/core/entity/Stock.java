package com.lph.app.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="stock",catalog="spring",uniqueConstraints={
	@UniqueConstraint(columnNames="STOCK_NAME"),
	@UniqueConstraint(columnNames="STOCK_CODE")})
public class Stock implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long stockId;
    
    private String stockCode;
    
    private String stockName;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="STOCK_ID",unique=true,nullable=false)
    public Long getStockId() {
        return stockId;
    }

    @Column(name="STOCK_CODE",unique=true,nullable=false,length=10)
    public String getStockCode() {
        return stockCode;
    }

    @Column(name="STOCK_NAME",unique=true,nullable=false,length=20)
    public String getStockName() {
        return stockName;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    
    
}
