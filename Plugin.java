package com.my.company.swagger.api;

import java.util.Objects;
@javax.annotation.Generated(value = "class com.my.company.codegen.IafCodegenGenerator", date = "2016-06-28T11:12:52.731-04:00")
public class Plugin   {
  
  private String pluginID = null;
  private String status = null;
  private String jarFileName = null;
  private String configFileName = null;

  /**
   **/
  public Plugin pluginID(String pluginID) {
    this.pluginID = pluginID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pluginID")
  public String getAnalyticID() {
    return pluginID;
  }
  public void setAnalyticID(String pluginID) {
    this.pluginID = pluginID;
  }

  /**
   * Plugin Status
   **/
  public Plugin status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Plugin Status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  public Plugin jarFileName(String jarFileName) {
    this.jarFileName = jarFileName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jarFileName")
  public String getJarFileName() {
    return jarFileName;
  }
  public void setJarFileName(String jarFileName) {
    this.jarFileName = jarFileName;
  }

  /**
   **/
  public Plugin configFileName(String configFileName) {
    this.configFileName = configFileName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configFileName")
  public String getConfigFileName() {
    return configFileName;
  }
  public void setConfigFileName(String configFileName) {
    this.configFileName = configFileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin Plugin = (Plugin) o;
    return Objects.equals(pluginID, Plugin.pluginID) &&
        Objects.equals(status, Plugin.status) &&
        Objects.equals(jarFileName, Plugin.jarFileName) &&
        Objects.equals(configFileName, Plugin.configFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginID, status, jarFileName, configFileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    
    sb.append("    pluginID: ").append(toIndentedString(pluginID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jarFileName: ").append(toIndentedString(jarFileName)).append("\n");
    sb.append("    configFileName: ").append(toIndentedString(configFileName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

