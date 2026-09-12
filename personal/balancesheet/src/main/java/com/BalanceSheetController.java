package com.sharfin.balancesheet;

import org.springframework.web.bind.annotation.*;

@RestController
public class BalanceSheetController {

    @GetMapping("/calculate")
    public double calculateRevenue(
            @RequestParam double sales,
            @RequestParam double expenses) {

        return sales - expenses;
    }
}