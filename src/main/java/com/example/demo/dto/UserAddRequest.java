package com.example.demo.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

//ユーザー情報登録リクエスト
@Data
public class UserAddRequest implements Serializable {
	
	//名前
	@NotEmpty
	(message = "名前を入力して下さい")
	@Size
	(max = 100, message = "名前は100桁以内で入力して下さい")
	private String name;
	
	//住所
	@Size
	(max = 255, message ="住所は255桁以内で入力して下さい")
	private String address;
	
	//電話番号
	@Pattern
	(regexp = "0¥¥d(1,4)-¥¥d(1,4)-¥¥d{4}")
	private String phone;
}
