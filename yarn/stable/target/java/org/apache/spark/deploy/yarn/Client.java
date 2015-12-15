package org.apache.spark.deploy.yarn;
/**
 * Version of {@link org.apache.spark.deploy.yarn.ClientBase} tailored to YARN's stable API.
 */
public  class Client implements org.apache.spark.deploy.yarn.ClientBase, org.apache.spark.Logging {
  static public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
  public   Client (org.apache.spark.deploy.yarn.ClientArguments clientArgs, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf spConf) { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.client.api.YarnClient yarnClient () { throw new RuntimeException(); }
  public   Client (org.apache.spark.deploy.yarn.ClientArguments clientArgs, org.apache.spark.SparkConf spConf) { throw new RuntimeException(); }
  public   Client (org.apache.spark.deploy.yarn.ClientArguments clientArgs) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.ClientArguments args () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.ipc.YarnRPC rpc () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationId runApp () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  public  void logClusterResourceDetails () { throw new RuntimeException(); }
  public  int calculateAMMemory (org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse newApp) { throw new RuntimeException(); }
  public  void setupSecurityToken (org.apache.hadoop.yarn.api.records.ContainerLaunchContext amContainer) { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationId submitApp (org.apache.hadoop.yarn.api.records.ApplicationSubmissionContext appContext) { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationReport getApplicationReport (org.apache.hadoop.yarn.api.records.ApplicationId appId) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  boolean monitorApplication (org.apache.hadoop.yarn.api.records.ApplicationId appId) { throw new RuntimeException(); }
}
