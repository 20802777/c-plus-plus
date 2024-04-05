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
public class Order implements Serializable{
   
  private  int order_id;
  private  int product_id;
  private  int emp_id;
  private  int p_no;
  private  float total;

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setP_no(int p_no) {
        this.p_no = p_no;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public int getP_no() {
        return p_no;
    }

    public float getTotal() {
        return total;
    }

    public Order(int order_id, int product_id, int emp_id, int p_no, float total) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.emp_id = emp_id;
        this.p_no = p_no;
        this.total = total;
    }
    
}
