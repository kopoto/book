package com.kopoto.yhh.book.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private int id;
    private String name;
    private String author;
    private int chapterAmount;
    private String desc;
    private String picUrl;
}
