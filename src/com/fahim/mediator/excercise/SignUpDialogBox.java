package com.fahim.mediator.excercise;

import org.w3c.dom.Text;

public class SignUpDialogBox {
    TextBox username = new TextBox();
    TextBox password = new TextBox();
    CheckBox checkBox = new CheckBox();
    Button button = new Button();

    public SignUpDialogBox() {
        username.addEventHandler(this::controlChanged);
        password.addEventHandler(this::controlChanged);
        checkBox.addEventHandler(this::controlChanged);
    }

    private void controlChanged() {
        button.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return (username.getContent() != null && !username.getContent().isEmpty() &&
                password.getContent() != null && !password.getContent().isEmpty() &&
                checkBox.isChecked());
    }

    public void simulateSignupDialogBox(){
        username.setContent("Fahim");
        password.setContent("1234");
        checkBox.setChecked(true);
        System.out.println("Button :"+button.isEnabled());
    }


}
