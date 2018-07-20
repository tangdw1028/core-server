package org.tang.mapper;

import org.tang.bean.Menu;

import java.util.List;

/**
 * Created by tang on 2017/12/28.
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
