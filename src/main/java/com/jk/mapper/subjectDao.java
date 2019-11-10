package com.jk.mapper;

import com.jk.model.Treebean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface subjectDao {
    @Select("select * from t_tree where pid = #{id}")
    List<Treebean> findNavNodes(Integer id);
}
