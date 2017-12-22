/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CatalogObjectMetadata;
import java.util.ArrayList;
import java.util.List;

/**
 * CatalogObjectMetadataList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-22T17:17:55.479+01:00")
public class CatalogObjectMetadataList {
  @JsonProperty("object")
  private List<CatalogObjectMetadata> object = null;

  public CatalogObjectMetadataList object(List<CatalogObjectMetadata> object) {
    this.object = object;
    return this;
  }

  public CatalogObjectMetadataList addObjectItem(CatalogObjectMetadata objectItem) {
    if (this.object == null) {
      this.object = new ArrayList<>();
    }
    this.object.add(objectItem);
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")
  public List<CatalogObjectMetadata> getObject() {
    return object;
  }

  public void setObject(List<CatalogObjectMetadata> object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObjectMetadataList catalogObjectMetadataList = (CatalogObjectMetadataList) o;
    return Objects.equals(this.object, catalogObjectMetadataList.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObjectMetadataList {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

