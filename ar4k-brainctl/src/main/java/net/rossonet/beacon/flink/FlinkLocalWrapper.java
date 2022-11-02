package net.rossonet.beacon.flink;

import java.io.IOException;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FlinkLocalWrapper implements FlinkWrapper {

	private final StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment
			.getExecutionEnvironment();

	@Override
	public void close() throws IOException {
		stopFlink();

	}

	public StreamExecutionEnvironment getExecutionEnvironment() {
		return executionEnvironment;
	}

	@Override
	public void startFlink() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopFlink() {
		executionEnvironment.clearJobListeners();
	}

}
