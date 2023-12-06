package org.example.sem2.example2;

public class FullStack extends Developer implements BackendAction, FrontendAction{
    @Override
    public void makeBack() {
        System.out.println("program backend");
    }

    @Override
    public void makeFront() {
        System.out.println("program frontend");
    }
}
