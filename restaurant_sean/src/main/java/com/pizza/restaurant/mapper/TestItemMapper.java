
/*TestItemMapper 需要繼承 MyBatis-Plus 的 BaseMapper 介面。
這樣可以確保你能夠使用 MyBatis-Plus 進行 CRUD 操作*/
package com.pizza.restaurant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pizza.restaurant.entity.TestItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestItemMapper extends BaseMapper<TestItem> {
    
}
