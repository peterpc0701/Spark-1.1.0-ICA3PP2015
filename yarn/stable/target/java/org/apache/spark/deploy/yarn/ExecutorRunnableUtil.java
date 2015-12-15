package org.apache.spark.deploy.yarn;
public abstract interface ExecutorRunnableUtil extends org.apache.spark.Logging {
  public abstract  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () ;
  public abstract  org.apache.spark.SparkConf sparkConf () ;
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env () ;
  public  scala.collection.immutable.List<java.lang.String> prepareCommand (java.lang.String masterAddress, java.lang.String slaveId, java.lang.String hostname, int executorMemory, int executorCores, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources) ;
  private  void setupDistributedCache (java.lang.String file, org.apache.hadoop.yarn.api.records.LocalResourceType rtype, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, java.lang.String timestamp, java.lang.String size, java.lang.String vis) ;
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> prepareLocalResources () ;
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> prepareEnvironment () ;
}
