package com.gitlab.filmica.model;

 public enum AgeRating {
     G("General Audiences"),
     NC17("Adults Only"),
     PG("Parental Guidance Suggested"),
     PG13("Parents Strongly Cautioned"),
     R("Restricted");

     private String description;

     AgeRating(String description) {
         this.description = description;
     }


     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }
 }