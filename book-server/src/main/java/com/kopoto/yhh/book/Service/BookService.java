package com.kopoto.yhh.book.Service;

import com.kopoto.yhh.book.dao.BookDao;
import com.kopoto.yhh.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public Book one(int id) {
        return bookDao.one(id);
    }
}
