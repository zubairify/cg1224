package com.zs.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private int mid;
	private String name;
	private int age;
	private String email;
	private String password;
}
