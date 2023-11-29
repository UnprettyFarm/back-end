package com.kosta.farm.entity;

import java.sql.Timestamp;

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
	private Integer userId;
	
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userNickname;
	private String userTel;
	private String address1;
	private String address2;
	private String address3;
	
	private String provider;
	private String providerId;
	private String userRoles;
	private boolean state;
	private String accessToken;
	@CreationTimestamp
	private Timestamp createDate;
}
