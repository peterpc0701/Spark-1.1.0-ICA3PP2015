package org.apache.spark.metrics.sink;
public  class GangliaSink implements org.apache.spark.metrics.sink.Sink {
  public  java.util.Properties property () { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry registry () { throw new RuntimeException(); }
  // not preceding
  public   GangliaSink (java.util.Properties property, com.codahale.metrics.MetricRegistry registry, org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  public  java.lang.String GANGLIA_KEY_PERIOD () { throw new RuntimeException(); }
  public  int GANGLIA_DEFAULT_PERIOD () { throw new RuntimeException(); }
  public  java.lang.String GANGLIA_KEY_UNIT () { throw new RuntimeException(); }
  public  java.util.concurrent.TimeUnit GANGLIA_DEFAULT_UNIT () { throw new RuntimeException(); }
  public  java.lang.String GANGLIA_KEY_MODE () { throw new RuntimeException(); }
  public  info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode GANGLIA_DEFAULT_MODE () { throw new RuntimeException(); }
  public  java.lang.String GANGLIA_KEY_TTL () { throw new RuntimeException(); }
  public  int GANGLIA_DEFAULT_TTL () { throw new RuntimeException(); }
  public  java.lang.String GANGLIA_KEY_HOST () { throw new RuntimeException(); }
  public  java.lang.String GANGLIA_KEY_PORT () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> propertyToOption (java.lang.String prop) { throw new RuntimeException(); }
  public  java.lang.String host () { throw new RuntimeException(); }
  public  int port () { throw new RuntimeException(); }
  public  int ttl () { throw new RuntimeException(); }
  public  info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode mode () { throw new RuntimeException(); }
  public  int pollPeriod () { throw new RuntimeException(); }
  public  java.util.concurrent.TimeUnit pollUnit () { throw new RuntimeException(); }
  public  info.ganglia.gmetric4j.gmetric.GMetric ganglia () { throw new RuntimeException(); }
  public  com.codahale.metrics.ganglia.GangliaReporter reporter () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void report () { throw new RuntimeException(); }
}
