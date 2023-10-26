package com.finance.Finance.dbAdapter.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "ExpensePeriodDao")
public class ExpensePeriodDao {

	private String month;
	
	private String year;
	
	private ExpenseDataDao expenseDataDao;
}
