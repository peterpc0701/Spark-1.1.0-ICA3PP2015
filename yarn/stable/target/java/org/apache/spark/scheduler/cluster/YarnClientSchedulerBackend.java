package org.apache.spark.scheduler.cluster;
private  class YarnClientSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend implements org.apache.spark.Logging {
  public   YarnClientSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.Client client () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationId appId () { throw new RuntimeException(); }
  public  java.lang.Thread checkerThread () { throw new RuntimeException(); }
  public  boolean stopping () { throw new RuntimeException(); }
  public  int totalExpectedExecutors () { throw new RuntimeException(); }
  private  void addArg (java.lang.String optionName, java.lang.String envVar, java.lang.String sysProp, scala.collection.mutable.ArrayBuffer<java.lang.String> arrayBuf) { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void waitForApp () { throw new RuntimeException(); }
  private  java.lang.Thread yarnApplicationStateCheckerThread () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered () { throw new RuntimeException(); }
}
