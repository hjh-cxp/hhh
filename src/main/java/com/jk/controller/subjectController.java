package com.jk.controller;

import com.jk.model.Treebean;
import com.jk.model.studentBean;
import com.jk.service.subjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sub")
public class subjectController {
    @Autowired
    private subjectService service;

    @RequestMapping("initTreeView")
    @ResponseBody
    public List<Treebean> initTreeView(){
        return service.initTreeView();
    }

    @RequestMapping("queryStudent")
    @ResponseBody
    private List<studentBean> queryStudent(){
        return service.queryStudent();
    }










}
