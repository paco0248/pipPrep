package com.trevorphillips.pipprep.PipController;


import com.trevorphillips.pipprep.Service.PipLogic;
import com.trevorphillips.pipprep.requests.RequestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

@RestController
public class PipController {

    @Autowired
    PipLogic pipLogic;

    @GetMapping(value="/greetings")
    public String sendGreetings(){
        return "GMT";
    }

    @PostMapping(value="/getMostRepeatedNumber")
    public String getMostRepeatedNumber(@RequestBody @NotEmpty(message = "Input movie list cannot be empty.")
                                            @Valid RequestPojo requestPojo){

//        System.out.println(requestPojo.getNumber1());
//
//        for (Integer e: requestPojo.getListOfNumbers()) {
//            System.out.println(e + " :ghj");
//
//        }

        Integer mostRepeatedInt = pipLogic.getMostFrecNumber(requestPojo);

        System.out.println(mostRepeatedInt);
        return "GMT";
    }

}
