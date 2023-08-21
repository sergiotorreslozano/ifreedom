package com.ifreedom.ifreedom;

import com.ifreedom.ifreedom.stocks.OperationRepository;
import com.ifreedom.ifreedom.stocks.model.Operation;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoadDatabase {

    @Autowired
    private OperationRepository operationRepository;

    @PostConstruct
    public void init(){
        System.out.println("Initializing mock operation list");
        List operations = new ArrayList<>();
        Operation operation = new Operation("AAPL", 1L, new BigDecimal(100L), 10L);
        operations.add(operation);
        operationRepository.saveAll(operations);
    }
}
