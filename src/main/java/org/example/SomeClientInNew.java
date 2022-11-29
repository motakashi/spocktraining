package org.example;

public class SomeClientInNew {

    public int execute(int no){
        SomeServiceInNew someServiceInNew = new SomeServiceInNew();
        return someServiceInNew.calculate(no);
    }

}
