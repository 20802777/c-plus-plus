/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
    private  int emp_id;
  private  String first_name;
  private String last_name;
  private  float salary;
  private  Date start_work;

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setStart_work(Date start_work) {
        this.start_work = start_work;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public float getSalary() {
        return salary;
    }

    public Date getStart_work() {
        return start_work;
    }

    public Employee(int emp_id, String first_name, String last_name, float salary, Date start_work) {
        this.emp_id = emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        this.start_work = start_work;
    }
}
