package com.kosta.farm.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Builder
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId; // 서버에서 사용하는 userId
	@Column
	private Long farmerId;
	@Column
	private String userName; // 이름 (실명)
	@Column
	private String userEmail; // 로그인 ID
	@Column
	private String userPassword;
	@Column
	private String userNickname;
	@Column
	private String userTel;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String address3;
	@Column
	private String provider;
	@Column
	private String providerId;
	@Column
	private String userRoles; // user, farmer, admin
	@CreationTimestamp
	@Column
	private Timestamp createDate;
	@Column
	private boolean userState;
}
