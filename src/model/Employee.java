// Source code is decompiled from a .class file using FernFlower decompiler.
package model;

import java.util.List;

public class Employee {
   private String employeeName;
   private Role employeeRole;
   private int employeeExperience;
   private String employeeBranch;
   private int salary;
   private List<String> employeeSkills;

   public Employee(String employeeName, Role employeeRole, int employeeExperience, String employeeBranch, int salary, List<String> employeeSkills) {
      this.employeeName = employeeName;
      this.employeeRole = employeeRole;
      this.employeeExperience = employeeExperience;
      this.employeeBranch = employeeBranch;
      this.salary = salary;
      this.employeeSkills = employeeSkills;
   }

   public String getEmployeeName() {
      return this.employeeName;
   }

   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }

   public Role getEmployeeRole() {
      return this.employeeRole;
   }

   public void setEmployeeRole(Role employeeRole) {
      this.employeeRole = employeeRole;
   }

   public int getEmployeeExperience() {
      return this.employeeExperience;
   }

   public void setEmployeeExperience(int employeeExperience) {
      this.employeeExperience = employeeExperience;
   }

   public String getEmployeeBranch() {
      return this.employeeBranch;
   }

   public void setEmployeeBranch(String employeeBranch) {
      this.employeeBranch = employeeBranch;
   }

   public int getSalary() {
      return this.salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getEmployeeSalary() {
      return this.salary;
   }

   public void setEmployeeSalary(int salary) {
      this.salary = salary;
   }

   public List<String> getEmployeeSkills() {
      return this.employeeSkills;
   }

   public void setEmployeeSkills(List<String> employeeSkills) {
      this.employeeSkills = employeeSkills;
   }

   public String toString() {
      return "Employee{employeeName='" + this.employeeName + "', employeeRole=" + this.employeeRole + ", employeeBranch='" + this.employeeBranch + "', salary=" + this.salary + "}";
   }
}
