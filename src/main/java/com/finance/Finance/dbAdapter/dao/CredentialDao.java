package com.finance.Finance.dbAdapter.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Document(collection = "Credentials")
public class CredentialDao {
	@Id
	private String userId;

	private String password;
}
