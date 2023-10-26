package com.finance.Finance.dbAdapter.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Income")
public class IncomeDao {
	private String source;
	private Integer amount;
}
