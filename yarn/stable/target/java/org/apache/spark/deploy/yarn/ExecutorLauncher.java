package org.apache.spark.deploy.yarn;
/**
 * An application master that allocates executors on behalf of a driver that is running outside
 * the cluster.
 * <p>
 * This is used only in yarn-client mode.
 */
public  class ExecutorLauncher implements org.apache.spark.Logging {
  public  class MonitorActor implements akka.actor.Actor {
    public   MonitorActor (java.lang.String driverUrl) { throw new RuntimeException(); }
    public  akka.actor.ActorSelection driver () { throw new RuntimeException(); }
    public  void preStart () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
  public   ExecutorLauncher (org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public   ExecutorLauncher (org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  public   ExecutorLauncher (org.apache.spark.deploy.yarn.ApplicationMasterArguments args) { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId () { throw new RuntimeException(); }
  private  java.lang.Thread reporterThread () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.YarnAllocationHandler yarnAllocator () { throw new RuntimeException(); }
  private  boolean driverClosed () { throw new RuntimeException(); }
  private  boolean isFinished () { throw new RuntimeException(); }
  private  boolean registered () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient () { throw new RuntimeException(); }
  private  int maxNumExecutorFailures () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager () { throw new RuntimeException(); }
  public  akka.actor.ActorSystem actorSystem () { throw new RuntimeException(); }
  public  akka.actor.ActorRef actor () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.protocolrecords.RegisterApplicationMasterResponse registerApplicationMaster () { throw new RuntimeException(); }
  private  void addAmIpFilter () { throw new RuntimeException(); }
  private  void waitForSparkMaster () { throw new RuntimeException(); }
  private  void allocateExecutors () { throw new RuntimeException(); }
  private  void allocateMissingExecutor () { throw new RuntimeException(); }
  private  void checkNumExecutorsFailed () { throw new RuntimeException(); }
  private  java.lang.Thread launchReporterThread (long _sleepTime) { throw new RuntimeException(); }
  public  void finishApplicationMaster (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, java.lang.String appMessage) { throw new RuntimeException(); }
}
