package org.apache.spark.deploy.yarn;
/** Client side methods to setup the Hadoop distributed cache */
public  class ClientDistributedCacheManager implements org.apache.spark.Logging {
  public   ClientDistributedCacheManager () { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<java.lang.String, scala.Tuple3<java.lang.String, java.lang.String, java.lang.String>> distCacheFiles () { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<java.lang.String, scala.Tuple3<java.lang.String, java.lang.String, java.lang.String>> distCacheArchives () { throw new RuntimeException(); }
  /**
   * Add a resource to the list of distributed cache resources. This list can
   * be sent to the ApplicationMaster and possibly the executors so that it can
   * be downloaded into the Hadoop distributed cache for use by this application.
   * Adds the LocalResource to the localResources HashMap passed in and saves 
   * the stats of the resources to they can be sent to the executors and verified.
   * <p>
   * @param fs FileSystem
   * @param conf Configuration
   * @param destPath path to the resource
   * @param localResources localResource hashMap to insert the resource into
   * @param resourceType LocalResourceType 
   * @param link link presented in the distributed cache to the destination
   * @param statCache cache to store the file/directory stats 
   * @param appMasterOnly Whether to only add the resource to the app master
   */
  public  void addResource (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.fs.Path destPath, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, org.apache.hadoop.yarn.api.records.LocalResourceType resourceType, java.lang.String link, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache, boolean appMasterOnly) { throw new RuntimeException(); }
  /**
   * Adds the necessary cache file env variables to the env passed in
   * @param env
   */
  public  void setDistFilesEnv (scala.collection.mutable.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Adds the necessary cache archive env variables to the env passed in
   * @param env
   */
  public  void setDistArchivesEnv (scala.collection.mutable.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Returns the local resource visibility depending on the cache file permissions
   * @param conf
   * @param uri
   * @param statCache
   * @return LocalResourceVisibility
   */
  public  org.apache.hadoop.yarn.api.records.LocalResourceVisibility getVisibility (org.apache.hadoop.conf.Configuration conf, java.net.URI uri, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache) { throw new RuntimeException(); }
  /**
   * Returns a boolean to denote whether a cache file is visible to all(public)
   * or not
   * @param conf
   * @param uri
   * @param statCache
   * @return true if the path in the uri is visible to all, false otherwise
   */
  public  boolean isPublic (org.apache.hadoop.conf.Configuration conf, java.net.URI uri, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache) { throw new RuntimeException(); }
  /**
   * Returns true if all ancestors of the specified path have the 'execute'
   * permission set for all users (i.e. that other users can traverse
   * the directory heirarchy to the given path)
   * @param fs
   * @param path
   * @param statCache
   * @return true if all ancestors have the 'execute' permission set for all users
   */
  public  boolean ancestorsHaveExecutePermissions (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache) { throw new RuntimeException(); }
  /**
   * Checks for a given path whether the Other permissions on it 
   * imply the permission in the passed FsAction
   * @param fs
   * @param path
   * @param action
   * @param statCache
   * @return true if the path in the uri is visible to all, false otherwise
   */
  public  boolean checkPermissionOfOther (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.permission.FsAction action, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache) { throw new RuntimeException(); }
  /**
   * Checks to see if the given uri exists in the cache, if it does it 
   * returns the existing FileStatus, otherwise it stats the uri, stores
   * it in the cache, and returns the FileStatus.
   * @param fs
   * @param uri
   * @param statCache
   * @return FileStatus
   */
  public  org.apache.hadoop.fs.FileStatus getFileStatus (org.apache.hadoop.fs.FileSystem fs, java.net.URI uri, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache) { throw new RuntimeException(); }
}
