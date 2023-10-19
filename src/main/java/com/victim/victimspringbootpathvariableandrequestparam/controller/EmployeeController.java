package com.victim.victimspringbootpathvariableandrequestparam.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Victim Musundire
 */


@RestController
public class EmployeeController {


    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    public String getEmployeeOne ( @PathVariable("employeeId") long employeeId) {
        // code to get employee by employee id
        return "The id is: " + employeeId;
    }

    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    public String getEmployeTwo ( @PathVariable long employeeId) {
        // code to get employee by employee id
        return "The id is: " + employeeId;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployeeThree ( @RequestParam( value = "employeeId", required = false ) long employeeId) {
        // code to get employee by employee id
        return "The id is: " + employeeId;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployeeFour ( @RequestParam long employeeId) {
        // code to get employee by employee id
        return "The id is: " + employeeId;
    }

}
