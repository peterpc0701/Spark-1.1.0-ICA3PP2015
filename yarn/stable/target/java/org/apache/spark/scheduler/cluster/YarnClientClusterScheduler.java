package org.apache.spark.scheduler.cluster;
/**
 * This scheduler launches executors through Yarn - by calling into Client to launch ExecutorLauncher as AM.
 */
private  class YarnClientClusterScheduler extends org.apache.spark.scheduler.TaskSchedulerImpl {
  public   YarnClientClusterScheduler (org.apache.spark.SparkContext sc, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  public   YarnClientClusterScheduler (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getRackForHost (java.lang.String hostPort) { throw new RuntimeException(); }
}
