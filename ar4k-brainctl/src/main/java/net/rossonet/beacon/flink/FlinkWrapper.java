package net.rossonet.beacon.flink;

public interface FlinkWrapper extends AutoCloseable {

	void startFlink();

	void stopFlink();

}