package org.example.spocktraining;

public class SomeClient {

    private SomeService service;

    public SomeClient(SomeService service) {
        this.service = service;
    }

    public int execute(int no){
        return this.service.calculate(no);
    }

}
