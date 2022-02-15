package com.main;

import com.employee.model.Employee;
import com.util.EmployeeUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Predicate<Employee> predicate = new Predicate<Employee>(){
            @Override
            public boolean test(Employee employee) {
                boolean out = false;
                if(employee.getAge() > 30 && employee.getGender().equalsIgnoreCase("Male") ){
                    out = true;
                }



                return out ;
            }
        };
        List<Employee> employeeList = EmployeeUtils.getEmployeeData();

        //employeeList.stream().filter( predicate).forEach(System.out::println);


       /* employeeList.stream().filter(employee -> employee.getName().startsWith("M"))
                .forEach(System.out::println);*/

       /* employeeList.stream().filter(employee -> employee.getYearOfJoining() < 2012 )
                .forEach(System.out::println);*/


        /*Optional<Employee> highestPaidEmployeeWrapper=
                employeeList.stream().collect(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))*/;

        List<Employee> employeeListnew=   employeeList.stream().sorted((e1,e2) -> e1.getAge() > e2.getAge() ? 1 : -1 )
                //.forEach(System.out::println);

              .collect(Collectors.toList());





       /* EmployeeUtils.getEmployeeData().stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                EmployeeUtils.getEmployeeData().stream()
                        .collect(Collectors
                                    .groupingBy(
                                            Employee::getDepartment,
                                            Collectors.averagingInt(Employee::getAge)
                                    ));

        System.out.println(avgAgeOfMaleAndFemaleEmployees);*/

        // ->
    }
}
