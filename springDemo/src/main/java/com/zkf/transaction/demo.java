package com.zkf.transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

public class demo {

    public static void main(String[] args) {
        PlatformTransactionManager transactionManager = new JtaTransactionManager();

    }
}
