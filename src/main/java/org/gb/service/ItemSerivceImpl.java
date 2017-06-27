package org.gb.service;

import org.gb.dao.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/27.
 */
@Service
public class ItemSerivceImpl implements ItemService{

    @Autowired
    private ItemMapper itemMapper;
}
