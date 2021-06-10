package com.comarch.kiosque.mock.controllers;

import com.comarch.kiosque.mock.model.Employee;
import com.comarch.kiosque.mock.model.ErrorMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.HeaderParam;
import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
public class MockController {

    @RequestMapping(value = "/eligibilityRequests/v1", method = RequestMethod.POST)
    public ResponseEntity eligibilityRequests(@HeaderParam("X-OAPI-Application-Id")  String xOAPIApplicationId, @HeaderParam("X-OAPI-User-Id")  String xOAPIUserId, @HeaderParam("X-OAPI-Channel")  String xOAPIChannel, @HeaderParam("X-OAPI-Origin")  String xOAPIOrigin, @HeaderParam("X-OAPI-Validated-Scope") ArrayList<String> xOAPIValidatedScope, @RequestBody Employee employee) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(new BigDecimal(1));
        errorMessage.setMessage("Internal Server Error");
        errorMessage.setDescription("Internal Server Error");

        return ResponseEntity.status(500).body(errorMessage);
    }
}
