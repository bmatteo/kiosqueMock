package com.comarch.kiosque.mock.model;

import com.comarch.kiosque.mock.model.ComponentStatus;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Status  {
  
  @ApiModelProperty(value = "Nom de l'application")
 /**
   * Nom de l'application
  **/
  private String name;

  @ApiModelProperty(value = "Statut de l'application")
 /**
   * Statut de l'application
  **/
  private String status;

  @ApiModelProperty(value = "Version de l'application")
 /**
   * Version de l'application
  **/
  private String version;

  @ApiModelProperty(value = "Liste des composants")
 /**
   * Liste des composants
  **/
  private List<ComponentStatus> components = null;
 /**
   * Nom de l&#39;application
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Status name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Statut de l&#39;application
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Status status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Version de l&#39;application
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Status version(String version) {
    this.version = version;
    return this;
  }

 /**
   * Liste des composants
   * @return components
  **/
  @JsonProperty("components")
  public List<ComponentStatus> getComponents() {
    return components;
  }

  public void setComponents(List<ComponentStatus> components) {
    this.components = components;
  }

  public Status components(List<ComponentStatus> components) {
    this.components = components;
    return this;
  }

  public Status addComponentsItem(ComponentStatus componentsItem) {
    this.components.add(componentsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

