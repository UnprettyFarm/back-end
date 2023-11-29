package com.kosta.farm.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Order {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	// FK
	@Column
	private Integer userId;
	@Column
	private Integer farmerId;
	@Column
	private Integer requestId;
	@Column
	private Integer productId;
	@Column
	private Integer quotationId;
	@Column
	private Integer paymentId;
//	@Column
//	private String quotationName; productId로 대체
	
	@Column
	private Date createDate;
	@Column
	private String state; // 결제완료, 판매취소, 배송완료
	
	
}
