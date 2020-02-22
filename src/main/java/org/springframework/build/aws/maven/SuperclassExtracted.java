package org.springframework.build.aws.maven;

import org.apache.maven.wagon.repository.Repository;

public class SuperclassExtracted {

	protected static String getBucketName(Repository repository) {
	    return repository.getHost();
	}

	protected String fieldToPushDown = "field to push down";

	public SuperclassExtracted() {
		super();
	}
	
	

}