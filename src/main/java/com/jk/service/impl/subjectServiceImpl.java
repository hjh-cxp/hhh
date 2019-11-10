package com.jk.service.impl;

import com.jk.mapper.subjectDao;
import com.jk.model.Treebean;
import com.jk.model.studentBean;
import com.jk.service.subjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class subjectServiceImpl implements subjectService{
    @Autowired
    private subjectDao dao;



    public List<Treebean> initTreeView() {
        Integer id = 0;
        return queryNodes(id);
    }

    public List<studentBean> queryStudent() {
        return null;
    }

    private List<Treebean> queryNodes(Integer id) {
        List<Treebean> navTrees = dao.findNavNodes(id);
        for (Treebean navTree : navTrees) {
            List<Treebean> queryNodes = queryNodes(navTree.getId());
            if (queryNodes == null || queryNodes.size() <= 0) {
                navTree.setSelectable(true);
            }else {
                navTree.setNodes(queryNodes);
            }
        }
        return navTrees;
    }
}
