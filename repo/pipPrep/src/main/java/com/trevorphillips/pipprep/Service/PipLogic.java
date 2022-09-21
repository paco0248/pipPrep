package com.trevorphillips.pipprep.Service;

import com.trevorphillips.pipprep.requests.RequestPojo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class PipLogic {

//    public RequestPojo requestPojo;

    public Integer getMostFrecNumber(RequestPojo requestPojo){
        int[] numbers = requestPojo.getListOfNumbers();
        System.out.println("this is list of numbers" + numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
// find the max frequency using linear traversal
        int max_count = 1, res = numbers[0];
        int curr_count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1])
                curr_count++;
            else
                curr_count = 1;

            if (curr_count > max_count) {
                max_count = curr_count;
                res = numbers[i - 1];
            }
        }

        System.out.println("this is res" + res);

        return res;
    }



}
