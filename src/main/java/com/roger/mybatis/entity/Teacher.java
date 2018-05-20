package com.roger.mybatis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {
	private static final long serialVersionUID = 3249979207181401037L;
	
	private Integer id;
	private String name;
}
