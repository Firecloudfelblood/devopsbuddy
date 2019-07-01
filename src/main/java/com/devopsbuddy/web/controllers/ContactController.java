package com.devopsbuddy.web.controllers;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    public static final  String FEEDBACK_MODEL_KEY = "feedback";
    public static final  String CONTACT_US_VIEW_NAME = "contact/contact";

    @RequestMapping(value ="/contact", method= RequestMethod.GET)
    public String contactGet(ModelMap model){
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }
}
