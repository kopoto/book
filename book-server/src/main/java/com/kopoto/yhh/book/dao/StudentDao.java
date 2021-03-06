package com.kopoto.yhh.book.dao;


import com.kopoto.yhh.book.base.config.DaoManagement;
import com.kopoto.yhh.book.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao extends DaoManagement {
    protected String mapper() {
        return "StudentMapper";
    }

    public Student one(int id) {
        if (id <= 0) {
            return null;
        }
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return sqlSessionCommon.selectOne(st("one"), params);
    }
}
