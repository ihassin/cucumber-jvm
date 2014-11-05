package com.demo.warehouse;

public class Manager {
    private boolean loginState = false;

    public boolean LogIn(boolean state)
    {
        loginState = state;
        return(loginState);
    }

}
