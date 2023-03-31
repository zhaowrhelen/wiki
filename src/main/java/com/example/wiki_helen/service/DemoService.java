package com.example.wiki_helen.service;

import com.example.wiki_helen.domain.Demo;
import com.example.wiki_helen.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
