package com.AGroupInterviewTask.services;

import com.AGroupInterviewTask.entities.PersonLegalId;
import org.springframework.http.ResponseEntity;

public interface IPersonLegalIdService {

    ResponseEntity save(PersonLegalId personLegalId);

    ResponseEntity findOne(String asOfDate, Integer personId, String idType);

    ResponseEntity findAll(String asOfDate);

    ResponseEntity findAll(String asOfDate, Integer personId);

    ResponseEntity findAll(String asOfDate, String idType);

    ResponseEntity update(PersonLegalId personLegalId, Integer personId, String idType);

    ResponseEntity delete(Integer personId, String idType);

}
