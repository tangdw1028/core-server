package org.tang.mapper;

import org.apache.ibatis.annotations.Param;
import org.tang.bean.Department;

import java.util.List;

/**
 * Created by tang on 2018/1/7.
 */
public interface DepartmentMapper {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}
