package com.xie.service.impl;

import com.xie.dao.RecordEntityMapper;
import com.xie.entity.RecordEntity;
import com.xie.entity.RecordEntityExample;
import com.xie.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:26
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordEntityMapper recordEntityMapper;

    public int addRecord(RecordEntity recordEntity) {
        recordEntity.setRecordCtime(new Date());
        recordEntity.setRecordMtime(new Date());
        return recordEntityMapper.insertSelective(recordEntity);
    }

    public int updateRecord(RecordEntity recordEntity) {
        recordEntity.setRecordMtime(new Date());
        return recordEntityMapper.updateByPrimaryKeySelective(recordEntity);
    }

    public int deleteRecord(long id) {
        return recordEntityMapper.deleteByPrimaryKey(id);
    }

    public List<RecordEntity> recordList(RecordEntityExample recordEntityExample) {
        return recordEntityMapper.selectByExample(recordEntityExample);
    }
}
