package com.trevorphillips.pipprep.requests;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class RequestPojo implements Serializable {

    @NotNull
    public int[] ListOfNumbers;

    public int[] getListOfNumbers() {
        return ListOfNumbers;
    }

    public void setListOfNumbers(int[] listOfNumbers) {
        ListOfNumbers = listOfNumbers;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    String number1;



}
