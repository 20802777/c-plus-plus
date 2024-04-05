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
public class Payment implements Serializable{
    private  int payment_id;
  private  int cust_id;
  private float amount;

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public float getAmount() {
        return amount;
    }

    public Payment(int payment_id, int cust_id, float amount) {
        this.payment_id = payment_id;
        this.cust_id = cust_id;
        this.amount = amount;
    }
  
    
}
