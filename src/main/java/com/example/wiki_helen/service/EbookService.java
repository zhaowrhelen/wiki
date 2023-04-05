package com.example.wiki_helen.service;
import com.example.wiki_helen.domain.Ebook;
import com.example.wiki_helen.domain.EbookExample;
import com.example.wiki_helen.mapper.EbookMapper;
import com.example.wiki_helen.req.EbookReq;
import com.example.wiki_helen.resp.EbookResp;
import com.example.wiki_helen.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(req.getName())){
        criteria.andNameLike("%" + req.getName()+"%");}
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        return CopyUtil.copyList(ebookList,EbookResp.class);
//        List<EbookResp> respList = new ArrayList<>();
//        for(Ebook ebook : ebookList){
//            EbookResp ebookResp = new EbookResp();
//            BeanUtils.copyProperties(ebook,ebookResp);
//            respList.add(ebookResp);
//        }
//        return respList;
    }
}
