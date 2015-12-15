package org.apache.spark.scheduler.cluster;
/**
 * This is a simple extension to ClusterScheduler - to ensure that appropriate initialization of ApplicationMaster, etc is done
 */
private  class YarnClusterScheduler extends org.apache.spark.scheduler.TaskSchedulerImpl {
  public   YarnClusterScheduler (org.apache.spark.SparkContext sc, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  public   YarnClusterScheduler (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getRackForHost (java.lang.String hostPort) { throw new RuntimeException(); }
  public  void postStartHook () { throw new RuntimeException(); }
}
