package com.rosy.im.main.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rosy.im.main.domain.dto.item.ItemQueryRequest;
import com.rosy.im.main.domain.entity.Item;
import com.rosy.im.main.domain.vo.ItemVO;

/**
 * <p>
 * 物品表 服务类
 * </p>
 *
 * @author Rosy
 * @since 2025-01-19
 */
public interface IItemService extends IService<Item> {

    ItemVO getItemVO(Item item);

    LambdaQueryWrapper<Item> getQueryWrapper(ItemQueryRequest itemQueryRequest);
}
