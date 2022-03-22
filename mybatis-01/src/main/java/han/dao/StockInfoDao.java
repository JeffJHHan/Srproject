package han.dao;

import pojo.StockInfo;

import java.util.List;

public interface StockInfoDao {
    List <StockInfo> getStockInfoList(String id);
    void createTable(String id);
}
