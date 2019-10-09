package com.imooc.miaosha.service;


import com.imooc.miaosha.vo.GoodsVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 李清依
 * @Date: 2019/10/7 18:37
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsServiceTest {
    @Autowired
    private GoodsService goodsService;

    @Test
    public void listGoodsVo() {
        List<GoodsVo> list=goodsService.listGoodsVo();
        for (GoodsVo gs:list
             ) {
            System.out.println(gs);
        }
    }
}
