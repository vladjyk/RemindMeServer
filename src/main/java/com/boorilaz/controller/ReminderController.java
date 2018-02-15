package com.boorilaz.controller;

import com.boorilaz.entity.RemindEntity;
import com.boorilaz.repositories.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public RemindEntity getRemind(){

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
