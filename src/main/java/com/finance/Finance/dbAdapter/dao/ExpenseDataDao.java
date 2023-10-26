package com.finance.Finance.dbAdapter.dao;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "ExpenseData")
public class ExpenseDataDao {

	private Integer budget;

	private List<IndividualExpenseDataDao> individualExpenseDataDaos;
}
