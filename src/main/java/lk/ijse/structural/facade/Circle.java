package lk.ijse.structural.facade;

import com.sun.security.jgss.GSSUtil;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle Method..!");
    }
}
