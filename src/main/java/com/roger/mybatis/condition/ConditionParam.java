package com.roger.mybatis.condition;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConditionParam implements Serializable{
	private static final long serialVersionUID = 4758459115178410056L;
	private String name;
	private Integer minAge;
	private Integer maxAge;
}
