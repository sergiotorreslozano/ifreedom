package com.ifreedom.ifreedom;

import com.ifreedom.ifreedom.stocks.OperationRepository;
import com.ifreedom.ifreedom.stocks.model.Operation;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoadDatabase {

    @Autowired
    private OperationRepository operationRepository;

    Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @PostConstruct
    public void init() {
        logger.debug("Initializing mock operation list");
        List operations = new ArrayList<>();
        Operation operation = new Operation("AAPL", new BigDecimal(100L),
                10L, LocalDate.parse("2023-08-12").atStartOfDay());
        operations.add(operation);
        operationRepository.saveAll(operations);
    }
}
