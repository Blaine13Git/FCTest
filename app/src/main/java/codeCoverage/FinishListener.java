package codeCoverage;

public interface FinishListener {
	void onActivityFinished();
	void dumpIntermediateCoverage(String filePath);
}
