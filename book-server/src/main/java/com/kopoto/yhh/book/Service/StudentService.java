package com.kopoto.yhh.book.Service;

import com.kopoto.yhh.book.dao.StudentDao;
import com.kopoto.yhh.book.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Student one(int id) {
        return studentDao.one(id);
    }
}
