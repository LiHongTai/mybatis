package com.roger.mybatis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
	private static final long serialVersionUID = 2719841906925045224L;
	private Integer id;
	private String orderNo;
	private Double orderPrice;
}
