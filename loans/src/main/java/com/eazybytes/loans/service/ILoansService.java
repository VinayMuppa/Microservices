package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {


    void createLoan(String mobileNumber);


    LoansDto fetchLoan(String mobileNumber);



}
