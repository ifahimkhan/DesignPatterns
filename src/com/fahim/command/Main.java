package com.fahim.command;

import com.fahim.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerService();
        AddCustomerCommand command=new AddCustomerCommand(customerService);
        Button button=new Button(command);
        button.click();

        CompositeCommand compositeCommand=new CompositeCommand();
        compositeCommand.addCommand(new ResizeCommand());
        compositeCommand.addCommand(new BlackAndWhiteCommand());
        compositeCommand.execute();
    }
}
