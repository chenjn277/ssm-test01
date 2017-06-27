package org.gb.dao;



import org.gb.vo.Workbook;

import java.util.List;

public interface WorkbookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workbook record);

    int insertSelective(Workbook record);

    Workbook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workbook record);

    int updateByPrimaryKey(Workbook record);

    List<Workbook> selectDdzt();
}