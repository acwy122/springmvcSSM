package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    public EmpService getEmpService() {
        return empService;
    }

    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    @RequestMapping("show.do")
    public ModelAndView show(){

        ModelAndView mv=new ModelAndView();
        List<Emp> list=empService.findAll();
        mv.addObject("list",list);
        mv.setViewName("/jsp/show.jsp");

        return mv;
    }
}
