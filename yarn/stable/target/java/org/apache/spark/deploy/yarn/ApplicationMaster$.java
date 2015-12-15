package org.apache.spark.deploy.yarn;
// no position
public  class ApplicationMaster$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ApplicationMaster$ MODULE$ = null;
  public   ApplicationMaster$ () { throw new RuntimeException(); }
  private  int ALLOCATE_HEARTBEAT_INTERVAL () { throw new RuntimeException(); }
  private  java.util.concurrent.CopyOnWriteArrayList<org.apache.spark.deploy.yarn.ApplicationMaster> applicationMasters () { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicReference<org.apache.spark.SparkContext> sparkContextRef () { throw new RuntimeException(); }
  public  void register (org.apache.spark.deploy.yarn.ApplicationMaster master) { throw new RuntimeException(); }
  /**
   * Called from YarnClusterScheduler to notify the AM code that a SparkContext has been
   * initialized in the user code.
   */
  public  boolean sparkContextInitialized (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationAttemptId getApplicationAttemptId () { throw new RuntimeException(); }
  public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
}
