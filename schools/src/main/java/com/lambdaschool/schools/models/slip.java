package com.lambdaschool.schools.models;

public class slip {

  private long id;
  private String advice;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAdvice() {
    return advice;
  }

  public void setAdvice(String advice) {
    this.advice = advice;
  }

  @Override
  public String toString() {
    return System.class.getName().toLowerCase() +"{\n" +
        "id':" + this.id +",\n"+
        "advice':" + this.getAdvice() + "\n" +
        '}'+ "\n";
  }
}
