package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class UserInfo implements Serializable{
	
	private Long id;
	
	private String name;
	
	private String address;
	
	private String phone;
	
	private Date updateDate;
	
	private Date createDate;
	
	private Date deleteDate;
	
}