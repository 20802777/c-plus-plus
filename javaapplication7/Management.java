/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author clinic computer
 */
public class Management {
    public static List customers, orders, employees, products, payments;
    
    public static void main(String[] args) {
       
       
        customers = new ArrayList();
        orders = new ArrayList();
        employees = new ArrayList();
        products = new ArrayList();
        payments = new ArrayList();
        
        Management.add_customer(1, 1, 1000.65f, "Cengiz", "Ferid", "+92 34444", "cengiz@gmail.com");
        Management.add_customer(2, 2, 95.0f, "Udoye", "Musavi", "+98 066666", "udoye@gmail.com");
        Management.add_customer(3, 3, 76.90f, "Salih", "Majidi", "+90 0444444", "salih@gmail.com");
        Management.add_customer(4, 4, 600.0f, "Mohammad", "Faruqi", "+21 34455555", "mohammad@gmail.com");
        Management.add_customer(5, 5, 88.0f, "Faruq", "Farid", "+34 567777", "faruq@gmail.com");
        Management.list_customers();
        Management.edit_customer(2, 2, 1000.5f, "Mahissa", "Salehnezhad", "+90 539 1111", "20802777@emu.edu.tr");
        Management.list_customers();
        Management.delete_customer(3);
        Management.list_customers();
        
        Management.add_order(1, 1,1, 5, 600.0f);
        Management.add_order(2, 1, 2, 2, 34.5f);
        Management.add_order(3, 2, 3, 3, 50.0f);
        Management.add_order(4, 3, 4, 4, 67.90f);
        Management.list_orders();
        Management.edit_order(2, 2, 1, 1, 100.5f);
        Management.list_orders();
        Management.delete_order(3);
        Management.list_orders();
        
        String dateString="20/12/2022";
        Date date;
        try{SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        date=dateFormat.parse(dateString);
        } catch(ParseException e){
e.printStackTrace();
return;
        }
        Management.add_employee(1, "Mahissa","Salehnezhad", 1000.0f, date);
        
        String dateString2="22/11/2022";
        Date date2;
        try{SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        date2=dateFormat.parse(dateString2);
        } catch(ParseException e){
e.printStackTrace();
return;
        }
        Management.add_employee(2, "Farid", "Zobeidi", 10000.0f, date2);
        String dateString3="03/01/2022";
        Date date3;
        try{SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        date3=dateFormat.parse(dateString3);
        } catch(ParseException e){
e.printStackTrace();
return;
        }
        Management.add_employee(3, "Sina", "Ahmadi", 20000.0f, date3);
        Management.list_employees();
        Management.edit_employee(2, "Marzie", "Zobeidi", 1000.0f, date3);
        Management.list_employees();
        Management.delete_employee(3);
        Management.list_employees();
        
        Management.add_product(1,"PC", "20x50", "blue");
        Management.add_product(2, "PS", "30x27", "green");
        Management.add_product(3, "Gaming Mouse", "33x15", "purple");
        Management.add_product(4, "Headset", "89x90", "orange");
        Management.add_product(5, "Keyboard", "30x40", "black");
        Management.list_products();
        Management.edit_product(2, "Gaming Lamp", "30x27", "green");
        Management.list_products();
        Management.delete_product(3);
        Management.list_products();
        
        Management.add_payment(1,1, 90.0f);
        Management.add_payment(2, 2, 14.9f);
        Management.add_payment(3, 3, 20.5f);
        Management.add_payment(4,4, 200.0f);
        Management.add_payment(5, 5, 67.0f);
        Management.add_payment(6, 1, 10.78f);
        Management.add_payment(7, 2, 100.0f);
        Management.add_payment(5, 5, 1000.5f);
        Management.list_payments();
        Management.edit_payment(2, 2, 100.0f);
        Management.list_payments();
        Management.delete_payment(3);
        Management.list_payments();
        
        System.out.printf("\n");
    }
    
       public static void add_customer(int cust_id, int order_id, float balance, String first_name,
            String last_name, String phone, String email) {
            Customer cr =new Customer(cust_id, order_id, balance, first_name,
                                    last_name, phone, email);
            customers.add(cr);
    }
       public static void edit_customer(int cust_id, int order_id, float balance, String first_name,
            String last_name, String phone, String email) {
      Customer cr=null;
      Boolean found=false;
      Iterator <Customer> itr = customers.iterator();
      while (itr.hasNext()) {
          cr = itr.next(); 
          if(cust_id==cr.getCust_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          cr.setCust_id(cust_id);
          cr.setOrder_id(order_id);
          cr.setBalance(balance);
          cr.setFirst_name(first_name);
          cr.setLast_name(last_name);
          cr.setPhone(phone);
          cr.setEmail(email);
      }
      }
       public static void delete_customer(int cust_id) {
      Customer cr=null;
      Boolean found=false;
      Iterator <Customer> itr = customers.iterator();
      while (itr.hasNext()) {
          cr = itr.next(); 
          if(cust_id==(cr.getCust_id())) {
              found=true;
              break;
          }
      }
      if (found) customers.remove(cr);
      }
        public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
        public static void list_customers() {
      Customer cr;
      Iterator <Customer> itr = customers.iterator();
      System.out.printf("\n%2s %10s %15s %15s %10s %12s %12s",
              "Customer Id", "Order Id","Balance", "First Name", 
              "Last Name","Phone", "Email");
        draw_line(100);
        
      while (itr.hasNext()) {
          cr = itr.next(); 
          System.out.printf("\n%2d   %10d          %5.3f  %15s  %10s   %12s   %12s", 
              cr.getCust_id(), cr.getOrder_id(), 
              cr.getBalance(), cr.getFirst_name(),
              cr.getLast_name(), cr.getPhone(), cr.getEmail());
      }
      draw_line(100);
        
    }
        public static void add_order(int order_id, int product_id, int emp_id, int p_no, float total) {
            Order or =new Order( order_id, product_id, emp_id, p_no, total);
            orders.add(or);
    }
         public static void edit_order(int order_id, int product_id, int emp_id, int p_no, float total) {
      Order or=null;
      Boolean found=false;
      Iterator <Order> itr = orders.iterator();
      while (itr.hasNext()) {
          or = itr.next(); 
          if(order_id==or.getOrder_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          or.setOrder_id(order_id);
          or.setEmp_id(emp_id);
          or.setP_no(p_no);
          or.setProduct_id(product_id);
         or.setTotal(total);
          
      }
      }
       public static void delete_order(int order_id) {
      Order or=null;
      Boolean found=false;
      Iterator <Order> itr = orders.iterator();
      while (itr.hasNext()) {
          or = itr.next(); 
          if(order_id==(or.getOrder_id())) {
              found=true;
              break;
          }
      }
      if (found) orders.remove(or);
      }
        
        public static void list_orders() {
      Order or;
      Iterator <Order> itr = orders.iterator();
      System.out.printf("\n%2s %10s %15s %15s %10s ",
              "Order Id", "Product Id","Employee Id", "  Number of Products", 
              "Total");
        draw_line(79);
        
      while (itr.hasNext()) {
          or = itr.next(); 
          System.out.printf("\n%2d %10d %15d %15d           %4.3f ", 
              or.getOrder_id(), or.getProduct_id(), 
              or.getEmp_id(), or.getP_no(),
              or.getTotal());
      }
      draw_line(79);
        
    }
            public static void add_employee(int emp_id, String first_name, String last_name, float salary, Date start_work) {
            Employee ee =new Employee( emp_id, first_name, last_name, salary, start_work);
            employees.add(ee);
    }
         public static void edit_employee(int emp_id, String first_name, String last_name, float salary, Date start_work) {
      Employee ee=null;
      Boolean found=false;
      Iterator <Employee> itr = employees.iterator();
      while (itr.hasNext()) {
          ee = itr.next(); 
          if(emp_id==ee.getEmp_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          ee.setEmp_id(emp_id);
          ee.setFirst_name(first_name);
          ee.setLast_name(last_name);
          ee.setSalary(salary);
          ee.setStart_work(start_work);
      }
      }
       public static void delete_employee(int emp_id) {
      Employee ee=null;
      Boolean found=false;
      Iterator <Employee> itr = employees.iterator();
      while (itr.hasNext()) {
          ee = itr.next(); 
          if(emp_id==(ee.getEmp_id())) {
              found=true;
              break;
          }
      }
      if (found) employees.remove(ee);
      }
        
        public static void list_employees() {
      Employee ee;
      Iterator <Employee> itr = employees.iterator();
      System.out.printf("\n%2s   %10s %15s %15s   %10s ",
              "Employee Id", "  First Name","Last Name", "Salary", 
              "  Start Working Date");
        draw_line(100);
        
      while (itr.hasNext()) {
          ee = itr.next(); 
          System.out.printf("\n%2d      %10s %15s      %15f      %10s ", 
              ee.getEmp_id(), ee.getFirst_name(), 
              ee.getLast_name(), ee.getSalary(),
              ee.getStart_work());
      }
      draw_line(100);
        
    }
         public static void add_product(int product_id, String name, String size, String color) {
            Product pt =new Product( product_id, name, size, color);
            products.add(pt);
    }
         public static void edit_product(int product_id, String name, String size, String color) {
      Product pt=null;
      Boolean found=false;
      Iterator <Product> itr = products.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(product_id==pt.getProduct_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          pt.setProduct_id(product_id);
          pt.setName(name);
          pt.setSize(size);
          pt.setColor(color);
      }
      }
       public static void delete_product(int product_id) {
      Product pt=null;
      Boolean found=false;
      Iterator <Product> itr = products.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(product_id==(pt.getProduct_id())) {
              found=true;
              break;
          }
      }
      if (found) products.remove(pt);
      }
        
        public static void list_products() {
      Product pt;
      Iterator <Product> itr = products.iterator();
      System.out.printf("\n%2s %10s %15s %15s ",
              "Product Id", "Name","Size", "Color");
        draw_line(79);
        
      while (itr.hasNext()) {
          pt = itr.next(); 
          System.out.printf("\n%2d      %10s %15s %15s ", 
              pt.getProduct_id(), pt.getName(), 
              pt.getSize(),pt.getColor());
      }
      draw_line(79);
        
    }
         public static void add_payment(int payment_id, int cust_id, float amount) {
            Payment pnt =new Payment( payment_id, cust_id, amount);
            payments.add(pnt);
    }
         public static void edit_payment(int payment_id, int cust_id, float amount) {
      Payment pnt=null;
      Boolean found=false;
      Iterator <Payment> itr = payments.iterator();
      while (itr.hasNext()) {
          pnt = itr.next(); 
          if(payment_id==pnt.getPayment_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          pnt.setPayment_id(payment_id);
          pnt.setCust_id(cust_id);
          pnt.setAmount(amount);
      }
      }
       public static void delete_payment(int payment_id) {
      Payment pnt=null;
      Boolean found=false;
      Iterator <Payment> itr = payments.iterator();
      while (itr.hasNext()) {
          pnt = itr.next(); 
          if(payment_id==(pnt.getPayment_id())) {
              found=true;
              break;
          }
      }
      if (found) payments.remove(pnt);
      }
        
        public static void list_payments() {
      Payment pnt;
      Iterator <Payment> itr = payments.iterator();
      System.out.printf("\n%2s %10s %15s ",
              "Payment Id", "Customer Id","Amount");
        draw_line(79);
        
      while (itr.hasNext()) {
          pnt = itr.next(); 
          System.out.printf("\n%2d %10d      %15f ", 
              pnt.getPayment_id(), pnt.getCust_id(), 
              pnt.getAmount());
      }
      draw_line(79);
        
    }
}

