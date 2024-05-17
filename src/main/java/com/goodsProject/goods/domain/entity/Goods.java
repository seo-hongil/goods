package com.goodsProject.goods.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "GOODS")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;                        //기본키
    private Long goodsno;                   //상품번호
    private String name;                    //이름
    private String image;                   //이미지
    private Long price;                     //가격
    private Long count;                     //수량
    private Long stock;                     //재고
    private String origin;                  //원산지
    private String manufacturer;            //제조처
    private String manufacturerarea;        //제조지역
    private LocalDateTime expirationdate;   //유통기한
    private LocalDateTime regdate;          //상품등록일자

}
