package com.comarch.kiosque.mock.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * EmployÃ©e
 **/
@ApiModel(description="EmployÃ©e")
public class Employee  {
  
  @ApiModelProperty(example = " 5bc047ad-72bb-4140-8738-331a1b12bfa8", value = "UUID")
 /**
   * UUID
  **/
  private String id;

  @ApiModelProperty(example = "abcd1234", required = true, value = "Le CUID")
 /**
   * Le CUID
  **/
  private String cuid;

  @ApiModelProperty(example = "John", required = true, value = "Le prÃ©nom")
 /**
   * Le prÃ©nom
  **/
  private String firstname;

  @ApiModelProperty(example = "DOE", required = true, value = "Le nom")
 /**
   * Le nom
  **/
  private String lastname;

  @ApiModelProperty(value = "Si eligible Ã  la remise salariÃ©")
 /**
   * Si eligible Ã  la remise salariÃ©
  **/
  private Boolean eligible;
 /**
   * UUID
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Le CUID
   * @return cuid
  **/
  @JsonProperty("cuid")
  public String getCuid() {
    return cuid;
  }

  public void setCuid(String cuid) {
    this.cuid = cuid;
  }

  public Employee cuid(String cuid) {
    this.cuid = cuid;
    return this;
  }

 /**
   * Le prÃ©nom
   * @return firstname
  **/
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Employee firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

 /**
   * Le nom
   * @return lastname
  **/
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Employee lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

 /**
   * Si eligible Ã  la remise salariÃ©
   * @return eligible
  **/
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cuid: ").append(toIndentedString(cuid)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

