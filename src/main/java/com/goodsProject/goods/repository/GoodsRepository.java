package com.goodsProject.goods.repository;

import com.goodsProject.goods.domain.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
    Goods findByGoodsno(Long goodsno);
}
