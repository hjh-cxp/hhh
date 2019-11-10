package com.jk.service;

import com.jk.model.Treebean;
import com.jk.model.studentBean;

import java.util.List;

public interface subjectService {
    List<Treebean> initTreeView();

    List<studentBean> queryStudent();
}
