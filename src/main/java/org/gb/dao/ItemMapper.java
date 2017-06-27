package org.gb.dao;



import org.gb.util.PageUtil;
import org.gb.vo.Item;

import java.math.BigDecimal;
import java.util.List;

public interface ItemMapper {

    int selectItemCount(PageUtil<Item> page);

    List<Item> selectItem(PageUtil<Item> page);

    int deleteById(Item item);

  /*  int selectById(Item item);
*/


    int insertSelective(Item item);

    int deleteLogic(Item item);

    int deleteLogicMany(List<BigDecimal> idList);

    int deleteItemMany(List<BigDecimal> idList);
}