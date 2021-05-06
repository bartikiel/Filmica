package com.gitlab.filmica.model;

 public enum AgeRating{
    G("General Audiences"),
    PG("Parental Guidance Suggested"),
    PG13("Parents Strongly Cautioned"),
    R("Restricted"),
    NC17("Adults Only");

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