package com.mkyong.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EHCacheManager {
	private CacheManager cacheManager;
	private Cache cache;
	public EHCacheManager() {
		cacheManager = CacheManager.newInstance();
		cache = cacheManager.getCache("cache1");
	}
	public void addToCache(String key, Person person) {
		cache.put(new Element(key,person));
	}
	public Person getFromCache(String key) {
		Element element = cache.get(key);
		Person person = (Person) (element == null ? null : element.getObjectValue());
		return person;
	}
	void destroyEHCacheManager() {
		cacheManager.shutdown();
	}
}
