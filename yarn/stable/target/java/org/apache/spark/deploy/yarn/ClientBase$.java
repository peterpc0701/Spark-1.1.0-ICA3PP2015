package org.apache.spark.deploy.yarn;
// no position
public  class ClientBase$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ClientBase$ MODULE$ = null;
  public   ClientBase$ () { throw new RuntimeException(); }
  public  java.lang.String SPARK_JAR () { throw new RuntimeException(); }
  public  java.lang.String APP_JAR () { throw new RuntimeException(); }
  public  java.lang.String LOCAL_SCHEME () { throw new RuntimeException(); }
  public  java.lang.String CONF_SPARK_JAR () { throw new RuntimeException(); }
  /**
   * This is an internal config used to propagate the location of the user's jar file to the
   * driver/executors.
   */
  public  java.lang.String CONF_SPARK_USER_JAR () { throw new RuntimeException(); }
  /**
   * This is an internal config used to propagate the list of extra jars to add to the classpath
   * of executors.
   */
  public  java.lang.String CONF_SPARK_YARN_SECONDARY_JARS () { throw new RuntimeException(); }
  public  java.lang.String ENV_SPARK_JAR () { throw new RuntimeException(); }
  /**
   * Find the user-defined Spark jar if configured, or return the jar containing this
   * class if not.
   * <p>
   * This method first looks in the SparkConf object for the CONF_SPARK_JAR key, and in the
   * user environment if that is not found (for backwards compatibility).
   */
  public  java.lang.String sparkJar (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  scala.collection.Iterable<scala.collection.Seq<java.lang.String>> populateHadoopClasspath (org.apache.hadoop.conf.Configuration conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  private  scala.Option<scala.collection.Seq<java.lang.String>> getYarnAppClasspath (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  scala.Option<scala.collection.Seq<java.lang.String>> getMRAppClasspath (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> getDefaultYarnApplicationClasspath () { throw new RuntimeException(); }
  /**
   * In Hadoop 0.23, the MR application classpath comes with the YARN application
   * classpath.  In Hadoop 2.0, it's an array of Strings, and in 2.2+ it's a String.
   * So we need to use reflection to retrieve it.
   */
  public  scala.Option<scala.collection.Seq<java.lang.String>> getDefaultMRApplicationClasspath () { throw new RuntimeException(); }
  public  void populateClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, scala.Option<java.lang.String> extraClassPath) { throw new RuntimeException(); }
  /**
   * Adds the user jars which have local: URIs (or alternate names, such as APP_JAR) explicitly
   * to the classpath.
   */
  private  void addUserClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.spark.SparkConf conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
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
  private  void addFileToClasspath (java.lang.String path, java.lang.String fileName, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Returns the local path if the URI is a "local:" URI, or null otherwise.
   */
  private  java.lang.String getLocalPath (java.lang.String resource) { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> addClasspathEntry (java.lang.String path, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /** 
   * Get the list of namenodes the user may access.
   */
  private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> getNameNodesToAccess (org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  private  java.lang.String getTokenRenewer (org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Obtains tokens for the namenodes passed in and adds them to the credentials.
   */
  private  void obtainTokensForNamenodes (scala.collection.immutable.Set<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.security.Credentials creds) { throw new RuntimeException(); }
}
