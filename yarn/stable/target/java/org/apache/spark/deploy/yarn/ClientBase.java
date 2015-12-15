package org.apache.spark.deploy.yarn;
/**
 * The entry point (starting in Client#main() and Client#run()) for launching Spark on YARN. The
 * Client submits an application to the YARN ResourceManager.
 * <p>
 * Depending on the deployment mode this will launch one of two application master classes:
 * 1. In cluster mode, it will launch an {@link org.apache.spark.deploy.yarn.ApplicationMaster}
 *      which launches a driver program inside of the cluster.
 * 2. In client mode, it will launch an {@link org.apache.spark.deploy.yarn.ExecutorLauncher} to
 *      request executors on behalf of a driver running outside of the cluster.
 */
public abstract interface ClientBase extends org.apache.spark.Logging {
  static public  java.lang.String SPARK_JAR () { throw new RuntimeException(); }
  static public  java.lang.String APP_JAR () { throw new RuntimeException(); }
  static public  java.lang.String LOCAL_SCHEME () { throw new RuntimeException(); }
  static public  java.lang.String CONF_SPARK_JAR () { throw new RuntimeException(); }
  /**
   * This is an internal config used to propagate the location of the user's jar file to the
   * driver/executors.
   */
  static public  java.lang.String CONF_SPARK_USER_JAR () { throw new RuntimeException(); }
  /**
   * This is an internal config used to propagate the list of extra jars to add to the classpath
   * of executors.
   */
  static public  java.lang.String CONF_SPARK_YARN_SECONDARY_JARS () { throw new RuntimeException(); }
  static public  java.lang.String ENV_SPARK_JAR () { throw new RuntimeException(); }
  /**
   * Find the user-defined Spark jar if configured, or return the jar containing this
   * class if not.
   * <p>
   * This method first looks in the SparkConf object for the CONF_SPARK_JAR key, and in the
   * user environment if that is not found (for backwards compatibility).
   */
  static public  java.lang.String sparkJar (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static public  scala.collection.Iterable<scala.collection.Seq<java.lang.String>> populateHadoopClasspath (org.apache.hadoop.conf.Configuration conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  static private  scala.Option<scala.collection.Seq<java.lang.String>> getYarnAppClasspath (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  static private  scala.Option<scala.collection.Seq<java.lang.String>> getMRAppClasspath (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.Seq<java.lang.String>> getDefaultYarnApplicationClasspath () { throw new RuntimeException(); }
  /**
   * In Hadoop 0.23, the MR application classpath comes with the YARN application
   * classpath.  In Hadoop 2.0, it's an array of Strings, and in 2.2+ it's a String.
   * So we need to use reflection to retrieve it.
   */
  static public  scala.Option<scala.collection.Seq<java.lang.String>> getDefaultMRApplicationClasspath () { throw new RuntimeException(); }
  static public  void populateClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, scala.Option<java.lang.String> extraClassPath) { throw new RuntimeException(); }
  /**
   * Adds the user jars which have local: URIs (or alternate names, such as APP_JAR) explicitly
   * to the classpath.
   */
  static private  void addUserClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.spark.SparkConf conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Adds the given path to the classpath, handling "local:" URIs correctly.
   * <p>
   * If an alternate name for the file is given, and it's not a "local:" file, the alternate
   * name will be added to the classpath (relative to the job's work directory).
   * <p>
   * If not a "local:" file and no alternate name, the environment is not modified.
   * <p>
   * @param path      Path to add to classpath (optional).
   * @param fileName  Alternate name for the file (optional).
   * @param env       Map holding the environment variables.
   */
  static private  void addFileToClasspath (java.lang.String path, java.lang.String fileName, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Returns the local path if the URI is a "local:" URI, or null otherwise.
   */
  static private  java.lang.String getLocalPath (java.lang.String resource) { throw new RuntimeException(); }
  static private  scala.Option<java.lang.String> addClasspathEntry (java.lang.String path, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /** 
   * Get the list of namenodes the user may access.
   */
  static private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> getNameNodesToAccess (org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  static private  java.lang.String getTokenRenewer (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Obtains tokens for the namenodes passed in and adds them to the credentials.
   */
  static private  void obtainTokensForNamenodes (scala.collection.immutable.Set<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.security.Credentials creds) { throw new RuntimeException(); }
  public abstract  org.apache.spark.deploy.yarn.ClientArguments args () ;
  public abstract  org.apache.hadoop.conf.Configuration conf () ;
  public abstract  org.apache.spark.SparkConf sparkConf () ;
  public abstract  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () ;
  public  org.apache.hadoop.security.Credentials credentials () ;
  private  java.lang.String SPARK_STAGING () ;
  private  org.apache.spark.deploy.yarn.ClientDistributedCacheManager distCacheMgr () ;
  public  org.apache.hadoop.fs.permission.FsPermission STAGING_DIR_PERMISSION () ;
  public  org.apache.hadoop.fs.permission.FsPermission APP_FILE_PERMISSION () ;
  protected  int memoryOverhead () ;
  public  void validateArgs () ;
  public  java.lang.String getAppStagingDir (org.apache.hadoop.yarn.api.records.ApplicationId appId) ;
  public  void verifyClusterResources (org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse app) ;
  /** See if two file systems are the same or not. */
  private  boolean compareFs (org.apache.hadoop.fs.FileSystem srcFs, org.apache.hadoop.fs.FileSystem destFs) ;
  /** Copy the file into HDFS if needed. */
  private  org.apache.hadoop.fs.Path copyRemoteFile (org.apache.hadoop.fs.Path dstDir, org.apache.hadoop.fs.Path originalPath, short replication, boolean setPerms) ;
  private  org.apache.hadoop.fs.Path qualifyForLocal (java.net.URI localURI) ;
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> prepareLocalResources (java.lang.String appStagingDir) ;
  /** Get all application master environment variables set on this SparkConf */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> getAppMasterEnv () ;
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> setupLaunchEnv (scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, java.lang.String stagingDir) ;
  public  java.lang.String userArgsToString (org.apache.spark.deploy.yarn.ClientArguments clientArgs) ;
  public abstract  int calculateAMMemory (org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse newApp) ;
  public abstract  void setupSecurityToken (org.apache.hadoop.yarn.api.records.ContainerLaunchContext amContainer) ;
  public  org.apache.hadoop.yarn.api.records.ContainerLaunchContext createContainerLaunchContext (org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse newApp, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) ;
}
