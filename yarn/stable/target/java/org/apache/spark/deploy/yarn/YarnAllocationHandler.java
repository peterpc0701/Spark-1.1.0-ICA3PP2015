package org.apache.spark.deploy.yarn;
/**
 * Acquires resources for executors from a ResourceManager and launches executors in new containers.
 */
private  class YarnAllocationHandler implements org.apache.spark.Logging {
  static public  java.lang.String ANY_HOST () { throw new RuntimeException(); }
  static public  int PRIORITY () { throw new RuntimeException(); }
  static public  int MEMORY_OVERHEAD () { throw new RuntimeException(); }
  static private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> hostToRack () { throw new RuntimeException(); }
  static private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.String>> rackToHostSet () { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.yarn.YarnAllocationHandler newAllocator (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.yarn.YarnAllocationHandler newAllocator (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.spark.deploy.yarn.ApplicationMasterArguments args, scala.collection.Map<java.lang.String, scala.collection.Set<org.apache.spark.scheduler.SplitInfo>> map, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.yarn.YarnAllocationHandler newAllocator (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, int maxExecutors, int executorMemory, int executorCores, scala.collection.Map<java.lang.String, scala.collection.Set<org.apache.spark.scheduler.SplitInfo>> map, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  static private  scala.Tuple2<scala.collection.immutable.Map<java.lang.String, java.lang.Object>, scala.collection.immutable.Map<java.lang.String, java.lang.Object>> generateNodeToWeight (org.apache.hadoop.conf.Configuration conf, scala.collection.Map<java.lang.String, scala.collection.Set<org.apache.spark.scheduler.SplitInfo>> input) { throw new RuntimeException(); }
  static public  java.lang.String lookupRack (org.apache.hadoop.conf.Configuration conf, java.lang.String host) { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Set<java.lang.String>> fetchCachedHostsForRack (java.lang.String rack) { throw new RuntimeException(); }
  static public  void populateRackInfo (org.apache.hadoop.conf.Configuration conf, java.lang.String hostname) { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient () { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId () { throw new RuntimeException(); }
  public  int maxExecutors () { throw new RuntimeException(); }
  public  int executorMemory () { throw new RuntimeException(); }
  public  int executorCores () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> preferredHostToCount () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> preferredRackToCount () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  // not preceding
  public   YarnAllocationHandler (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, int maxExecutors, int executorMemory, int executorCores, scala.collection.immutable.Map<java.lang.String, java.lang.Object> preferredHostToCount, scala.collection.immutable.Map<java.lang.String, java.lang.Object> preferredRackToCount, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.Set<org.apache.hadoop.yarn.api.records.ContainerId>> allocatedHostToContainersMap () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.hadoop.yarn.api.records.ContainerId, java.lang.String> allocatedContainerToHostMap () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> allocatedRackCount () { throw new RuntimeException(); }
  private  java.util.concurrent.CopyOnWriteArrayList<org.apache.hadoop.yarn.api.records.ContainerId> releasedContainerList () { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<org.apache.hadoop.yarn.api.records.ContainerId, java.lang.Object> pendingReleaseContainers () { throw new RuntimeException(); }
  private  int memoryOverhead () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger numPendingAllocate () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger numExecutorsRunning () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger executorIdCounter () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger lastResponseId () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger numExecutorsFailed () { throw new RuntimeException(); }
  public  int getNumPendingAllocate () { throw new RuntimeException(); }
  public  int getNumExecutorsRunning () { throw new RuntimeException(); }
  public  int getNumExecutorsFailed () { throw new RuntimeException(); }
  public  boolean isResourceConstraintSatisfied (org.apache.hadoop.yarn.api.records.Container container) { throw new RuntimeException(); }
  public  void releaseContainer (org.apache.hadoop.yarn.api.records.Container container) { throw new RuntimeException(); }
  public  void allocateResources () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> createRackResourceRequests (scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> hostContainers) { throw new RuntimeException(); }
  public  int allocatedContainersOnHost (java.lang.String host) { throw new RuntimeException(); }
  public  int allocatedContainersOnRack (java.lang.String rack) { throw new RuntimeException(); }
  public  void addResourceRequests (int numExecutors) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> createResourceRequests (scala.Enumeration.Value requestType, java.lang.String resource, int numExecutors, int priority) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> constructContainerRequests (java.lang.String[] hosts, java.lang.String[] racks, int numExecutors, int priority) { throw new RuntimeException(); }
}
