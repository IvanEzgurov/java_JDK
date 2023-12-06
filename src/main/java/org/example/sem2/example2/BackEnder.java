package org.example.sem2.example2;

public class BackEnder extends Developer implements BackendAction{
    @Override
    public void makeBack() {
        System.out.println("program backend");
    }
}
