package com.boorilaz.controller;

import com.boorilaz.entity.RemindEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public RemindEntity gerRemind(ModelMap model){
        return mock();
    }

    private RemindEntity mock() {
        RemindEntity remindObject = new RemindEntity();
        remindObject.setId(1);
        remindObject.setRemindDate(new Date());
        remindObject.setTitle("Chikotilo");
        return remindObject;
    }


}
