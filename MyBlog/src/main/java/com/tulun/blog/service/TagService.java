package com.tulun.blog.service;

import com.tulun.blog.mapper.TagMapper;
import com.tulun.blog.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    TagMapper tagMapper;


    public List<Tag> getAllTags() {
        return tagMapper.selectAllTags();
    }
}
