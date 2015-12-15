package org.apache.spark.deploy.yarn;
public  class ApplicationMasterArguments {
  static public  int DEFAULT_NUMBER_EXECUTORS () { throw new RuntimeException(); }
  public  java.lang.String[] args () { throw new RuntimeException(); }
  // not preceding
  public   ApplicationMasterArguments (java.lang.String[] args) { throw new RuntimeException(); }
  public  java.lang.String userJar () { throw new RuntimeException(); }
  public  java.lang.String userClass () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> userArgs () { throw new RuntimeException(); }
  public  int executorMemory () { throw new RuntimeException(); }
  public  int executorCores () { throw new RuntimeException(); }
  public  int numExecutors () { throw new RuntimeException(); }
  private  void parseArgs (scala.collection.immutable.List<java.lang.String> inputArgs) { throw new RuntimeException(); }
  public  void printUsageAndExit (int exitCode, Object unknownParam) { throw new RuntimeException(); }
}
