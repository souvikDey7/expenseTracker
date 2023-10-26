package com.finance.Finance.dbAdapter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.finance.Finance.dbAdapter.dao.CredentialDao;

public interface CredentialRepository extends MongoRepository<CredentialDao, String> {

}
