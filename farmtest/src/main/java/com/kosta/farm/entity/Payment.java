package com.kosta.farm.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Payment {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer paymentId;
	@Column
	private String paymentBank; // 결제 은행
	@Column
	private String paymentDelivery; // 배송비
	@Column
	private String paymentPrice; // 상품금액
	@Column
	@CreationTimestamp
	private Timestamp createDate;
	@Column
	private String state; // 결제완료, 결제취소
	
}
