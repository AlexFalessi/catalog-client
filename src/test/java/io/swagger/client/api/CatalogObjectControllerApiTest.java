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


package io.swagger.client.api;

import io.swagger.client.model.CatalogObjectMetadataList;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CatalogObjectControllerApi
 */
@Ignore
public class CatalogObjectControllerApiTest {

    private final CatalogObjectControllerApi api = new CatalogObjectControllerApi();

    
    /**
     * Creates a new catalog object
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsingPOST1Test() {
        String bucketName = null;
        String kind = null;
        String commitMessage = null;
        String objectContentType = null;
        File file = null;
        String sessionID = null;
        String name = null;
        CatalogObjectMetadataList response = api.createUsingPOST1(bucketName, kind, commitMessage, objectContentType, file, sessionID, name);

        // TODO: test validations
    }
    
    /**
     * Delete a catalog object
     *
     * Delete the entire catalog object as well as its revisions. Returns the deleted CatalogRawObject&#39;s metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingDELETE1Test() {
        String bucketName = null;
        String name = null;
        String sessionID = null;
        Object response = api.deleteUsingDELETE1(bucketName, name, sessionID);

        // TODO: test validations
    }
    
    /**
     * Gets the raw content of the last revision of a catalog object
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawUsingGETTest() {
        String bucketName = null;
        String name = null;
        String sessionID = null;
        File response = api.getRawUsingGET(bucketName, name, sessionID);

        // TODO: test validations
    }
    
    /**
     * Gets a catalog object&#39;s metadata by IDs
     *
     * Returns metadata associated to the latest revision of the catalog object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsingGETTest() {
        String bucketName = null;
        String name = null;
        String sessionID = null;
        Object response = api.getUsingGET(bucketName, name, sessionID);

        // TODO: test validations
    }
    
    /**
     * Lists catalog objects metadata
     *
     * Returns catalog objects metadata associated to the latest revision.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsingGET1Test() {
        String bucketName = null;
        String sessionID = null;
        String kind = null;
        String name = null;
        Object response = api.listUsingGET1(bucketName, sessionID, kind, name);

        // TODO: test validations
    }
    
    /**
     * Restore a catalog object revision
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreUsingPUTTest() {
        String bucketName = null;
        String name = null;
        Long commitTime = null;
        String sessionID = null;
        Object response = api.restoreUsingPUT(bucketName, name, commitTime, sessionID);

        // TODO: test validations
    }
    
}
