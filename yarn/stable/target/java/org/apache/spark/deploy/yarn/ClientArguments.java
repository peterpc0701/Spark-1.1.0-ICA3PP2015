package org.apache.spark.deploy.yarn;
public  class ClientArguments {
  public  java.lang.String[] args () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  // not preceding
  public   ClientArguments (java.lang.String[] args, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public  java.lang.String addJars () { throw new RuntimeException(); }
  public  java.lang.String files () { throw new RuntimeException(); }
  public  java.lang.String archives () { throw new RuntimeException(); }
  public  java.lang.String userJar () { throw new RuntimeException(); }
  public  java.lang.String userClass () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> userArgs () { throw new RuntimeException(); }
  public  int executorMemory () { throw new RuntimeException(); }
  public  int executorCores () { throw new RuntimeException(); }
  public  int numExecutors () { throw new RuntimeException(); }
  public  java.lang.String amQueue () { throw new RuntimeException(); }
  public  int amMemory () { throw new RuntimeException(); }
  public  java.lang.String amClass () { throw new RuntimeException(); }
  public  java.lang.String appName () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.scheduler.InputFormatInfo> inputFormatInfo () { throw new RuntimeException(); }
  public  int priority () { throw new RuntimeException(); }
  private  void parseArgs (scala.collection.immutable.List<java.lang.String> inputArgs) { throw new RuntimeException(); }
  public  java.lang.String getUsageMessage (Object unknownParam) { throw new RuntimeException(); }
}
