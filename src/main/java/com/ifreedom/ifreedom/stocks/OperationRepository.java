package com.ifreedom.ifreedom.stocks;

import com.ifreedom.ifreedom.stocks.model.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface OperationRepository extends CrudRepository<Operation, UUID> {

}
