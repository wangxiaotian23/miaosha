package com.imooc.miaosha.dao;

import com.imooc.miaosha.domain.OrderInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 09:05
 * @Description:
 */
@Mapper
public interface OrderDao {



    @Delete("delete from order_info")
    void deleteorders();

    @Delete("delete from miaosha_order")
    void deleteMiaoShaOrders();
}
