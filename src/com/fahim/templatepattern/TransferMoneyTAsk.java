package com.fahim.templatepattern;

public class TransferMoneyTAsk extends Task {
    public TransferMoneyTAsk(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }


}
