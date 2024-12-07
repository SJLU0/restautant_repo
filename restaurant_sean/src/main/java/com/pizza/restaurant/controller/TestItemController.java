package com.pizza.restaurant.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pizza.restaurant.entity.TestItem;
import com.pizza.restaurant.service.TestItemService;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class TestItemController {

    @Autowired
    private TestItemService test_ItemService;

    // 取得所有菜單項目
    @GetMapping
    public List<TestItem> getAllItems() {
        return test_ItemService.list();
    }

    //依ID取得單一菜單項目
    @GetMapping("/{id}")
    public TestItem getItem(@PathVariable Long id) {
        return test_ItemService.getById(id);
    }

    //建立新菜單項目
    @PostMapping
    public boolean createItem(@RequestBody TestItem testItem) {
        return test_ItemService.save(testItem);
    }

    //更新菜單項目
    @PostMapping("/{id}/update")
    public boolean updateItem(@PathVariable Long id, @RequestBody TestItem testItem) {
        testItem.setId(id);
        return test_ItemService.updateById(testItem);
    }

    //刪除菜單項目
    @PostMapping("/{id}/delete")
    public boolean deleteItem(@PathVariable Long id) {
        return test_ItemService.removeById(id);
    }
}
