package com.roger.mybatis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {

	private static final long serialVersionUID = -1490480351584915243L;
	
	private Integer id;
	private String name;
	private String sex;

}
