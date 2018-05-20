package com.roger.mybatis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

	private static final long serialVersionUID = -4111185377830356956L;
	private Integer id;
	private String name;
}
