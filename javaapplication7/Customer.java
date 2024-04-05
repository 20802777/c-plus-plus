/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;
import java.io.Serializable;
/**
 *
 * @author clinic computer
 */
public class Customer implements Serializable{

    
  private  int cust_id;  
  private  int order_id;
  private  float balance;
  private  String first_name;
  private  String last_name;
  private  String phone;
  private  String email;

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCust_id() {
        return cust_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public float getBalance() {
        return balance;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Customer(int cust_id, int order_id, float balance, String first_name, String last_name, String phone, String email) {
        this.cust_id = cust_id;
        this.order_id = order_id;
        this.balance = balance;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
    }
    
}
