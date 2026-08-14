package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeServices {

    @Autowired
    private IEmployeeRepository repository;

  

    @Override
    public List<Employee> getEmployeesByPage(int pageNumber, int pageSize) {

        PageRequest pageRequest =PageRequest.of(pageNumber, pageSize);

        Page<Employee> page =repository.findAll(pageRequest);

        return page.getContent();
    }

    @Override
    public List<Employee> getEmployeesSortedBySalary() {

        List<Employee> list = new ArrayList<>();

        repository.findAll(
                Sort.by(Sort.Direction.ASC, "salary"))
                .forEach(list::add);

        return list;
    }

    @Override
    public List<Employee> getEmployeesSortedByName() {

        List<Employee> list = new ArrayList<>();

        repository.findAll(
                Sort.by(Sort.Direction.ASC, "employeeName"))
                .forEach(list::add);

        return list;
    }
}