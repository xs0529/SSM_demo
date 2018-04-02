package com.xie.service;

import com.xie.entity.RecordEntity;
import com.xie.entity.RecordEntityExample;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/2 14:18
 */
public interface RecordService {
    int addRecord(RecordEntity recordEntity);
    int updateRecord(RecordEntity recordEntity);
    int deleteRecord(long id);
    List<RecordEntity> recordList(RecordEntityExample recordEntityExample);
}
