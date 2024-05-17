package com.goodsProject.goods.service;

import com.goodsProject.goods.domain.entity.Goods;
import com.goodsProject.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    // 카테고리는 db에 때려 넣으면 되니까 상품등록만

    @Transactional
    public String getGoods(Long goodsNo){
        Optional<Goods> byId = goodsRepository.findById(1L);
        Goods goods = goodsRepository.findByGoodsno(goodsNo);
        if(goods == null){
            throw new IllegalArgumentException("해당 상품이 존재하지 않습니다.");
        }
        return goods.getName();
    }
}
