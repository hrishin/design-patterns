package impl;

import java.util.logging.Logger;

import iface.CloudManager;

public class GoogleCloudManager implements CloudManager {

	private Logger LOGGER = Logger.getLogger(GoogleCloudManager.class.getName());

	public Integer launchComputeInstance(String computeSize) {
		LOGGER.info("Launching Google compute Instance of " + computeSize
				+ " size");
		return 123;
	}

	public void storeObject(Object data) {
		LOGGER.info("Putting onject on google cloud storage " + data.toString());
	}

	public String getComputeStatus(Integer id) {
		LOGGER.info("getting google compute status having id: " + id);
		return "RUNNING";
	}

}
