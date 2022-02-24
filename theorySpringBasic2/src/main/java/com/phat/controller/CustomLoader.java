package com.phat.controller;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomLoader implements ResourceLoaderAware{
private ResourceLoader reLoader;//when new then resource loader not value
	public void setResourceLoader(ResourceLoader resourceLoader) {
		
		reLoader = resourceLoader;//because this method not initialize
		//structure auto write it will be retrieve name after set above through by .type will link together
		//it will finding set function link with application context
	}
	public Resource  getResource(String path) {//use to query 
		return reLoader.getResource(path);
	}
	
}
