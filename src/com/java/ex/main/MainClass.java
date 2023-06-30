package com.java.ex.main;

import com.java.ex.data.Child;
import com.java.ex.data.Parent;

public class MainClass {
    public static void main(String[] args) {
        Child c1 = new Child();
        Parent p1 = new Parent();
        p1.hobby();
        c1.getName();
        c1.getPapaName();
        c1.getMamaName();
        c1.hobby();
    }
}
