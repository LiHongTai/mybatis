package com.roger.mybatis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clazz implements Serializable {
	private static final long serialVersionUID = -701185187603149567L;
	
	private Integer id;
	private String name;
	private Teacher teacher;
}
