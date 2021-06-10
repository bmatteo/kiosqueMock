package com.comarch.kiosque.mock.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

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
  * Message d'erreur
 **/
@ApiModel(description="Message d'erreur")
public class ErrorMessage  {
  
  @ApiModelProperty(value = "Code d'erreur")
 /**
   * Code d'erreur
  **/
  private BigDecimal code;

  @ApiModelProperty(value = "Une chaÃ®ne de caractÃ¨re courte et localisÃ©e qui dÃ©crit l'erreur")
 /**
   * Une chaÃ®ne de caractÃ¨re courte et localisÃ©e qui dÃ©crit l'erreur
  **/
  private String message;

  @ApiModelProperty(value = "Une description longue de l'erreur. Elle peut contenir des informations prÃ©cises")
 /**
   * Une description longue de l'erreur. Elle peut contenir des informations prÃ©cises
  **/
  private String description;

  @ApiModelProperty(value = "Une URL vers une documentation en ligne dÃ©crivant plus prÃ©cisÃ¨ment l'erreur")
 /**
   * Une URL vers une documentation en ligne dÃ©crivant plus prÃ©cisÃ¨ment l'erreur
  **/
  private String infoURL;
 /**
   * Code d&#39;erreur
   * @return code
  **/
  @JsonProperty("code")
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }

  public ErrorMessage code(BigDecimal code) {
    this.code = code;
    return this;
  }

 /**
   * Une chaÃ®ne de caractÃ¨re courte et localisÃ©e qui dÃ©crit l&#39;erreur
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorMessage message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Une description longue de l&#39;erreur. Elle peut contenir des informations prÃ©cises
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorMessage description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Une URL vers une documentation en ligne dÃ©crivant plus prÃ©cisÃ¨ment l&#39;erreur
   * @return infoURL
  **/
  @JsonProperty("infoURL")
  public String getInfoURL() {
    return infoURL;
  }

  public void setInfoURL(String infoURL) {
    this.infoURL = infoURL;
  }

  public ErrorMessage infoURL(String infoURL) {
    this.infoURL = infoURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    infoURL: ").append(toIndentedString(infoURL)).append("\n");
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

