package org.apache.spark.deploy.yarn;
// no position
public  class YarnAllocationHandler$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final YarnAllocationHandler$ MODULE$ = null;
  public   YarnAllocationHandler$ () { throw new RuntimeException(); }
  public  java.lang.String ANY_HOST () { throw new RuntimeException(); }
  public  int PRIORITY () { throw new RuntimeException(); }
  public  int MEMORY_OVERHEAD () { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> hostToRack () { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.String>> rackToHostSet () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.YarnAllocationHandler newAllocator (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.YarnAllocationHandler newAllocator (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.spark.deploy.yarn.ApplicationMasterArguments args, scala.collection.Map<java.lang.String, scala.collection.Set<org.apache.spark.scheduler.SplitInfo>> map, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.YarnAllocationHandler newAllocator (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, int maxExecutors, int executorMemory, int executorCores, scala.collection.Map<java.lang.String, scala.collection.Set<org.apache.spark.scheduler.SplitInfo>> map, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  private  scala.Tuple2<scala.collection.immutable.Map<java.lang.String, java.lang.Object>, scala.collection.immutable.Map<java.lang.String, java.lang.Object>> generateNodeToWeight (org.apache.hadoop.conf.Configuration conf, scala.collection.Map<java.lang.String, scala.collection.Set<org.apache.spark.scheduler.SplitInfo>> input) { throw new RuntimeException(); }
  public  java.lang.String lookupRack (org.apache.hadoop.conf.Configuration conf, java.lang.String host) { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Set<java.lang.String>> fetchCachedHostsForRack (java.lang.String rack) { throw new RuntimeException(); }
  public  void populateRackInfo (org.apache.hadoop.conf.Configuration conf, java.lang.String hostname) { throw new RuntimeException(); }
}
