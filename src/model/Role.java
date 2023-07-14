// Source code is decompiled from a .class file using FernFlower decompiler.
package model;

import java.util.ArrayList;
import java.util.List;

public class Role {
   private String roleName;
   private int experience;
   private String location;
   private List<String> skillsRequired = new ArrayList();

   public Role(String roleName, int experience, String location, List<String> skillsRequired) {
      this.roleName = roleName;
      this.experience = experience;
      this.location = location;
      this.skillsRequired = skillsRequired;
   }

   public String getRoleName() {
      return this.roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }

   public int getExperience() {
      return this.experience;
   }

   public void setExperience(int experience) {
      this.experience = experience;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public List<String> getSkillsRequired() {
      return this.skillsRequired;
   }

   public void setSkillsRequired(List<String> skillsRequired) {
      this.skillsRequired = skillsRequired;
   }

   public String toString() {
      return "Role{roleName='" + this.roleName + "', experience=" + this.experience + ", location='" + this.location + "', skillsRequired=" + this.skillsRequired + "}";
   }
}
