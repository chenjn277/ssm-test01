package org.gb.controller;

import org.gb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;
}
