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

package org.ow2.proactive.catalog.client.api;

import com.sun.jersey.api.client.GenericType;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.Pair;

import org.ow2.proactive.catalog.client.model.CatalogObjectMetadata;
import org.ow2.proactive.catalog.client.model.CatalogObjectMetadataList;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-04T11:48:46.837+02:00")
public class CatalogObjectControllerApi {
  private ApiClient apiClient;

  public CatalogObjectControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a new catalog object
   * 
   * @param bucketName bucketName (required)
   * @param kind Kind of the new object (required)
   * @param commitMessage Commit message (required)
   * @param objectContentType The content type of CatalogRawObject - MIME type (required)
   * @param file The content of CatalogRawObject (required)
   * @param sessionID sessionID (optional)
   * @param name Name of the object or empty when a ZIP archive is uploaded (All objects inside the archive are stored inside the catalog). (optional)
   * @return CatalogObjectMetadataList
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectMetadataList createUsingPOST1(String bucketName, String kind, String commitMessage, String objectContentType, File file, String sessionID, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createUsingPOST1");
    }
    
    // verify the required parameter 'kind' is set
    if (kind == null) {
      throw new ApiException(400, "Missing the required parameter 'kind' when calling createUsingPOST1");
    }
    
    // verify the required parameter 'commitMessage' is set
    if (commitMessage == null) {
      throw new ApiException(400, "Missing the required parameter 'commitMessage' when calling createUsingPOST1");
    }
    
    // verify the required parameter 'objectContentType' is set
    if (objectContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'objectContentType' when calling createUsingPOST1");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling createUsingPOST1");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
    localVarQueryParams.addAll(apiClient.parameterToPair("kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPair("commitMessage", commitMessage));
    localVarQueryParams.addAll(apiClient.parameterToPair("objectContentType", objectContentType));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CatalogObjectMetadataList> localVarReturnType = new GenericType<CatalogObjectMetadataList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a catalog object
   * Delete the entire catalog object as well as its revisions. Returns the deleted CatalogObject&#39;s metadata.
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param sessionID sessionID (optional)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectMetadata deleteUsingDELETE1(String bucketName, String name, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteUsingDELETE1");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteUsingDELETE1");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets the raw content of the last revision of a catalog object
   * 
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param sessionID sessionID (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getRawUsingGET(String bucketName, String name, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getRawUsingGET");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getRawUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}/raw"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a catalog object&#39;s metadata by IDs
   * Returns metadata associated to the latest revision of the catalog object.
   * @param bucketName bucketName (required)
   * @param name name (required)
   * @param sessionID sessionID (optional)
   * @return CatalogObjectMetadata
   * @throws ApiException if fails to make API call
   */
  public CatalogObjectMetadata getUsingGET(String bucketName, String name, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getUsingGET");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources/{name}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CatalogObjectMetadata> localVarReturnType = new GenericType<CatalogObjectMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists catalog objects metadata
   * Returns catalog objects metadata associated to the latest revision.
   * @param bucketName bucketName (required)
   * @param sessionID sessionID (optional)
   * @param kind Filter according to kind. (optional)
   * @param name Give a list of name separated by comma to get them in an archive (optional)
   * @return List&lt;CatalogObjectMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CatalogObjectMetadata> listUsingGET1(String bucketName, String sessionID, String kind, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling listUsingGET1");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}/resources"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CatalogObjectMetadata>> localVarReturnType = new GenericType<List<CatalogObjectMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
