package com.tts.subscriberlist.subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SubscriberController {

    @GetMapping
    public String index(Subscriber subscriber){
        //Where we want to go when our application is started
        return "subscriber/index";

    }
}
