package com.ifreedom.ifreedom.stocks;

import com.ifreedom.ifreedom.stocks.model.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestOperations;

import java.util.List;

@Controller
public class OperationController {

    @Autowired
    private RestOperations restOperations;

    @GetMapping ("/operations")
    public String operations(Model model){
        List<Operation> operations =restOperations.getForObject("http://localhost:8080/api/operations", List.class);
        model.addAttribute("operations", operations);
        return "operations";
    }


}
