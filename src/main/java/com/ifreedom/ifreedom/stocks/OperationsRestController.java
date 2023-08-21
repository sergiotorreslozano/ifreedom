package com.ifreedom.ifreedom.stocks;

import com.ifreedom.ifreedom.stocks.model.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperationsRestController {

    @Autowired
    private OperationRepository operationRepository;

    @GetMapping("/api/operations")
    public List<Operation> findOperations(){
        return (List) operationRepository.findAll();
    }
}
