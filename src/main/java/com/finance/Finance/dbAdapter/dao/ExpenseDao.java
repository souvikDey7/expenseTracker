package com.finance.Finance.dbAdapter.dao;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collation = "Expense")
public class ExpenseDao {
	private String category;
	private List<ExpensePeriodDao> expensePeriodDaos;
}
