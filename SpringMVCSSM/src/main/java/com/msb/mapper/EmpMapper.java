package com.msb.mapper;

import com.msb.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    public List<Emp> selectAllEmpAndDept();

}
