package org.apache.spark.deploy.yarn;
// no position
public  class YarnSparkHadoopUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final YarnSparkHadoopUtil$ MODULE$ = null;
  public   YarnSparkHadoopUtil$ () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> addToEnvironment (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String variable, java.lang.String value, java.lang.String classPathSeparator) { throw new RuntimeException(); }
  public  void setEnvFromInputString (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String envString, java.lang.String classPathSeparator) { throw new RuntimeException(); }
  private  java.lang.String getEnvironmentVariableRegex () { throw new RuntimeException(); }
  public  java.lang.String getUIHistoryAddress (org.apache.spark.SparkContext sc, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Escapes a string for inclusion in a command line executed by Yarn. Yarn executes commands
   * using <code>bash -c "command arg1 arg2"</code> and that means plain quoting doesn't really work. The
   * argument is enclosed in single quotes and some key characters are escaped.
   * <p>
   * @param arg A single argument.
   * @return Argument quoted for execution via Yarn's generated shell script.
   */
  public  java.lang.String escapeForShell (java.lang.String arg) { throw new RuntimeException(); }
}
