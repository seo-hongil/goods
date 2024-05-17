package com.goodsProject.goods.controller;

import com.goodsProject.goods.service.GoodsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/goods")
@Tag(name = "Goods API", description = "Goods API Documentation")
@RequiredArgsConstructor
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getGoods/{goodsNo}")
    public String getGoods(@PathVariable("goodsNo") Long goodsNo){
        String goodsName = goodsService.getGoods(goodsNo);
        return goodsName;
    }

}
