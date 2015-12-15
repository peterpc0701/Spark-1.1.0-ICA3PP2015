package org.apache.spark.deploy.yarn;
/**
 * Contains util methods to interact with Hadoop from spark.
 */
public  class YarnSparkHadoopUtil extends org.apache.spark.deploy.SparkHadoopUtil {
  static public  scala.Option<java.lang.String> addToEnvironment (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String variable, java.lang.String value, java.lang.String classPathSeparator) { throw new RuntimeException(); }
  static public  void setEnvFromInputString (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String envString, java.lang.String classPathSeparator) { throw new RuntimeException(); }
  static private  java.lang.String getEnvironmentVariableRegex () { throw new RuntimeException(); }
  static public  java.lang.String getUIHistoryAddress (org.apache.spark.SparkContext sc, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Escapes a string for inclusion in a command line executed by Yarn. Yarn executes commands
   * using <code>bash -c "command arg1 arg2"</code> and that means plain quoting doesn't really work. The
   * argument is enclosed in single quotes and some key characters are escaped.
   * <p>
   * @param arg A single argument.
   * @return Argument quoted for execution via Yarn's generated shell script.
   */
  static public  java.lang.String escapeForShell (java.lang.String arg) { throw new RuntimeException(); }
  public   YarnSparkHadoopUtil () { throw new RuntimeException(); }
  public  void transferCredentials (org.apache.hadoop.security.UserGroupInformation source, org.apache.hadoop.security.UserGroupInformation dest) { throw new RuntimeException(); }
  public  boolean isYarnMode () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newConfiguration () { throw new RuntimeException(); }
  public  void addCredentials (org.apache.hadoop.mapred.JobConf conf) { throw new RuntimeException(); }
  public  org.apache.hadoop.security.Credentials getCurrentUserCredentials () { throw new RuntimeException(); }
  public  void addCurrentUserCredentials (org.apache.hadoop.security.Credentials creds) { throw new RuntimeException(); }
  public  void addSecretKeyToUserCredentials (java.lang.String key, java.lang.String secret) { throw new RuntimeException(); }
  public  byte[] getSecretKeyFromUserCredentials (java.lang.String key) { throw new RuntimeException(); }
}
