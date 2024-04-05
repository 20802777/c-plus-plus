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
public class Product implements Serializable{
    private  int product_id;
  private  String name;
  private String size;
  private  String color;

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Product(int product_id, String name, String size, String color) {
        this.product_id = product_id;
        this.name = name;
        this.size = size;
        this.color = color;
    }
  
}
