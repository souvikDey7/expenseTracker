package com.finance.Finance.dbAdapter.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Document(collection  = "ExpenseData")
public class IndividualExpenseDataDao {

	private Integer spentAmount;

	private String date;
}
