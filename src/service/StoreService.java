// Source code is decompiled from a .class file using FernFlower decompiler.
package service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import model.Branch;
import model.Employee;
import model.Product;
import model.Role;

public class StoreService {
   private List<Product> listOfProducts = new ArrayList();
   private List<Branch> listOfBranches = new ArrayList();
   private List<Employee> listOfEmployees = new ArrayList();
   private List<Role> listOfRoles = new ArrayList();

   public StoreService() {
   }

   public void addTestData() throws ParseException {
      DateFormat warrantyDate = new SimpleDateFormat("dd/MM/yyyy");
      warrantyDate.parse("01/01/2030");
      this.listOfBranches.add(new Branch("Hyderabad", "jack", Arrays.asList(new Product("Mobile", "Sony", 100, new Branch("Hyderabad", "jack", this.listOfProducts), warrantyDate))));
      this.listOfBranches.add(new Branch("Mumbai", "jones", Arrays.asList(new Product("TV", "Sony", 1000, new Branch("Mumbai", "jones", this.listOfProducts), warrantyDate))));
      this.listOfBranches.add(new Branch("Bangalore", "michel", Arrays.asList(new Product("washing machine", "Sony", 50, new Branch("Bangalore", "Michel", this.listOfProducts), warrantyDate))));
      this.listOfBranches.add(new Branch("Delhi", "john", Arrays.asList(new Product("mobile", "Sony", 100, new Branch("Delhi", "john", this.listOfProducts), warrantyDate))));
      this.listOfBranches.add(new Branch("Noida", "ravi", Arrays.asList(new Product("Mobile", "Sony", 100, new Branch("Noida", "Ravi", this.listOfProducts), warrantyDate))));
      this.listOfBranches.add(new Branch("Gachibowli", "brendan", Arrays.asList(new Product("Mobile", "Sony", 100, new Branch("Gachibowli", "Brendan", this.listOfProducts), warrantyDate))));
      this.listOfProducts.add(new Product("Mobile", "Sony", 100, new Branch("Hyderabad", "jack", this.listOfProducts), warrantyDate));
      this.listOfProducts.add(new Product("TV", "Sony", 1000, new Branch("Mumbai", "jones", this.listOfProducts), warrantyDate));
      this.listOfProducts.add(new Product("washing machine", "Sony", 50, new Branch("Bangalore", "Michel", this.listOfProducts), warrantyDate));
      Role role = new Role("Branch manager", 10, "Hyderabad", Arrays.asList("english", "fundementals of business"));
      this.listOfEmployees.add(new Employee("jack", role, 5, "Hyderabad", 500, Arrays.asList("english", "fundementals of business", "management")));
      this.listOfEmployees.add(new Employee("jones", role, 6, "Mumbai", 1000, Arrays.asList("English", "management")));
      this.listOfEmployees.add(new Employee("michel", role, 7, "Bangalore", 700, Arrays.asList("english", "fundementals of business", "management")));
      this.listOfEmployees.add(new Employee("john", role, 8, "Delhi", 800, Arrays.asList("Problem solving")));
      this.listOfEmployees.add(new Employee("ravi", role, 9, "Noida", 900, Arrays.asList("Data Engineering", "English")));
      this.listOfEmployees.add(new Employee("brendan", role, 10, "Gachibowli", 1200, Arrays.asList("Fundementals of business")));
      this.listOfRoles.add(new Role("Branch manager", 10, "Hyderabad", Arrays.asList("english", "fundementals of business", "management")));
      System.out.println("Test Data Added !");
   }

   public void addProduct(String name, String brandName, int price, Branch branch, DateFormat warrantyDate) {
      Product p = new Product(name, brandName, price, branch, warrantyDate);
      this.listOfProducts.add(p);
   }

   public List<Product> getAllProducts() {
      return this.listOfProducts;
   }

   public void addBranch(String location, String managerName, List<Product> listOfP) {
      this.listOfBranches.add(new Branch(location, managerName, listOfP));
      this.listOfProducts.addAll(listOfP);
   }

   public Branch branchWithLocation(String branchLocation) {
      Branch branch = new Branch(branchLocation, "siva", this.listOfProducts);
      Iterator var3 = this.listOfBranches.iterator();

      Branch b;
      do {
         if (!var3.hasNext()) {
            return branch;
         }

         b = (Branch)var3.next();
      } while(!Objects.equals(b.getLocation(), branchLocation));

      return b;
   }

   public List<Branch> getAllBranches() {
      return this.listOfBranches;
   }

   public void addEmployee(String name, Role roleName, int employeeExperience, String branch, int salary, List<String> listOfSkills) {
      this.listOfEmployees.add(new Employee(name, roleName, employeeExperience, branch, salary, listOfSkills));
   }

   public List<String> getEmployeeWithRole(Role roleName) {
      List<String> listOfEmployeeNamesWithRole = new ArrayList();
      Iterator var3 = this.listOfEmployees.iterator();

      while(var3.hasNext()) {
         Employee employee = (Employee)var3.next();
         if (employee.getEmployeeRole() == roleName) {
            listOfEmployeeNamesWithRole.add(employee.getEmployeeName());
         }
      }

      return listOfEmployeeNamesWithRole;
   }

   public List<Employee> getAllEmployees() {
      return this.listOfEmployees;
   }

   public void addRole(String roleName, int experience, String location, List<String> skillsRequired) {
      this.listOfRoles.add(new Role(roleName, experience, location, skillsRequired));
   }

   public List<Role> getListOfRoles() {
      return this.listOfRoles;
   }
}
