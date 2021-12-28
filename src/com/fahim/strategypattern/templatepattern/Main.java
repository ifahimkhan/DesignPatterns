package com.fahim.strategypattern.templatepattern;

public class Main {
    public static void main(String[] args) {
        GenerateReportTask generateReportTask=new GenerateReportTask(new AuditTrail());
        generateReportTask.execute();
        TransferMoneyTAsk transferMoneyTask=new TransferMoneyTAsk(new AuditTrail());
        transferMoneyTask.execute();
    }
}
