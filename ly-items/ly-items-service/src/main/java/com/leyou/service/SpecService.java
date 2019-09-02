package com.leyou.service;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import com.leyou.mapper.SpecGroupMapper;
import com.leyou.mapper.SpecParamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecService {
    @Autowired
    private SpecGroupMapper specGroupMapper;
    @Autowired
    private SpecParamMapper specParamMapper;

    public List<SpecGroup> querySpecGroups(Long cid) {

        SpecGroup specGroup = new SpecGroup();

        specGroup.setCid(cid);
        return  specGroupMapper.select(specGroup);
        //select * from spec_group where cid="76"
    }

    public List<SpecParam> querySpecParam(Long gid, Long cid, Boolean searching, Boolean generic) {
        SpecParam specParam = new SpecParam();
        specParam.setCid(cid);
        specParam.setSearching(searching);
        specParam.setGeneric(generic);
        specParam.setGroupId(gid);
        return specParamMapper.select(specParam);
        //select * from spec_param where gid= and cid=? and searching=? and generic=?
    }
}
