package com.example.wiki_helen.service;

import com.example.wiki_helen.domain.Test;
import com.example.wiki_helen.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }
}
