package org.apache.spark.deploy.yarn;
/**
 * An application master that runs the user's driver program and allocates executors.
 */
public  class ApplicationMaster implements org.apache.spark.Logging {
  public  class AppMasterShutdownHook implements java.lang.Runnable {
    public   AppMasterShutdownHook (org.apache.spark.deploy.yarn.ApplicationMaster appMaster) { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
  static private  int ALLOCATE_HEARTBEAT_INTERVAL () { throw new RuntimeException(); }
  static private  java.util.concurrent.CopyOnWriteArrayList<org.apache.spark.deploy.yarn.ApplicationMaster> applicationMasters () { throw new RuntimeException(); }
  static public  java.util.concurrent.atomic.AtomicReference<org.apache.spark.SparkContext> sparkContextRef () { throw new RuntimeException(); }
  static public  void register (org.apache.spark.deploy.yarn.ApplicationMaster master) { throw new RuntimeException(); }
  /**
   * Called from YarnClusterScheduler to notify the AM code that a SparkContext has been
   * initialized in the user code.
   */
  static public  boolean sparkContextInitialized (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  static public  org.apache.hadoop.yarn.api.records.ApplicationAttemptId getApplicationAttemptId () { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
  public   ApplicationMaster (org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public   ApplicationMaster (org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public   ApplicationMaster (org.apache.spark.deploy.yarn.ApplicationMasterArguments args) { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId () { throw new RuntimeException(); }
  private  java.lang.Thread userThread () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.YarnAllocationHandler yarnAllocator () { throw new RuntimeException(); }
  private  boolean isFinished () { throw new RuntimeException(); }
  private  java.lang.String uiAddress () { throw new RuntimeException(); }
  private  java.lang.String uiHistoryAddress () { throw new RuntimeException(); }
  private  int maxAppAttempts () { throw new RuntimeException(); }
  private  boolean isLastAMRetry () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient () { throw new RuntimeException(); }
  private  int maxNumExecutorFailures () { throw new RuntimeException(); }
  private  boolean registered () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  private  void addAmIpFilter () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.protocolrecords.RegisterApplicationMasterResponse registerApplicationMaster () { throw new RuntimeException(); }
  private  java.lang.Thread startUserClass () { throw new RuntimeException(); }
  private  void waitForSparkContextInitialized () { throw new RuntimeException(); }
  private  void allocateExecutors () { throw new RuntimeException(); }
  private  void allocateMissingExecutor () { throw new RuntimeException(); }
  private  void checkNumExecutorsFailed () { throw new RuntimeException(); }
  private  java.lang.Thread launchReporterThread () { throw new RuntimeException(); }
  public  void finishApplicationMaster (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, java.lang.String diagnostics) { throw new RuntimeException(); }
  /**
   * Clean up the staging directory.
   */
  private  void cleanupStagingDir () { throw new RuntimeException(); }
}
