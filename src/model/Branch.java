package model;

import java.util.List;

public class Branch {
   private String location;
   private String branchManager;
   private List<Product> products;

   public Branch(String location, String branchManager, List<Product> listOfProducts) {
      this.location = location;
      this.branchManager = branchManager;
      this.products = listOfProducts;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getBranchManager() {
      return this.branchManager;
   }

   public void setBranchManager(String branchManager) {
      this.branchManager = branchManager;
   }

   public List<Product> getProducts() {
      return this.products;
   }

   public void setProducts(List<Product> products) {
      this.products = products;
   }
}
