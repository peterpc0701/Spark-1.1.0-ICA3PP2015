package org.apache.spark.deploy.yarn;
public  class ExecutorRunnable implements java.lang.Runnable, org.apache.spark.deploy.yarn.ExecutorRunnableUtil, org.apache.spark.Logging {
  public   ExecutorRunnable (org.apache.hadoop.yarn.api.records.Container container, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf spConf, java.lang.String masterAddress, java.lang.String slaveId, java.lang.String hostname, int executorMemory, int executorCores) { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.ipc.YarnRPC rpc () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.client.api.NMClient nmClient () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.nio.ByteBuffer> startContainer () { throw new RuntimeException(); }
}
