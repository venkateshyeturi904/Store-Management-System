// Source code is decompiled from a .class file using FernFlower decompiler.
package model;

import java.text.DateFormat;

public class Product {
   private String name;
   private String brandName;
   private Branch branch;
   private int price;
   private DateFormat warrrantyDate;

   public Product(String name, String brandName, int price, Branch branch, DateFormat warrantyDate) {
      this.name = name;
      this.brandName = brandName;
      this.price = price;
      this.warrrantyDate = warrantyDate;
      this.branch = branch;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getBrandName() {
      return this.brandName;
   }

   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   public Branch getBranch() {
      return this.branch;
   }

   public int getPrice() {
      return this.price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public void setBranch(Branch branch) {
      this.branch = branch;
   }

   public String getbrandName() {
      return this.brandName;
   }

   public void setbrandName(String brandName) {
      this.brandName = brandName;
   }

   public DateFormat getWarrrantyDate() {
      return this.warrrantyDate;
   }

   public void setWarrrantyDate(DateFormat warrrantyDate) {
      this.warrrantyDate = warrrantyDate;
   }

   public String toString() {
      String var10000 = this.brandName;
      return var10000 + " " + this.name + " available in " + this.branch.getLocation() + " branch, price=" + this.price + "$";
   }
}
