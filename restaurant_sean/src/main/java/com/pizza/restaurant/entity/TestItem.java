package com.pizza.restaurant.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;


@Data
@TableName("test_items")  // 指定資料庫表格名稱
public class TestItem {
    @TableId(value = "test_itemid", type = IdType.AUTO)  // 對應自增主鍵
    private Long id;  // 對應資料庫中的 test_itemid 欄位，BIGINT

    @TableField("test_name")  // 對應資料庫中的 test_name 欄位，VARCHAR
    private String name;

    @TableField("test_description")  // 對應資料庫中的 test_description 欄位，TINYTEXT
    private String description;

    @TableField("test_image")  // 對應資料庫中的 test_image 欄位，VARCHAR
    private String image;

    @TableField("test_price")  // 對應資料庫中的 test_price 欄位
    private Integer price;
}
