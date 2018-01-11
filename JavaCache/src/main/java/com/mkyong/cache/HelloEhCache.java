
package com.mkyong.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class HelloEhCache{
	CacheManager cacheManager = new CacheManager();
	 public HelloEhCache() {
	 Cache cache = cacheManager.getCache("cache1");
	 int cacheSize = cache.getKeys().size();
	 cache.put(new Element("" + cacheSize, cacheSize));
	 for (Object key : cache.getKeys()) {
	 System.out.println("Key:" + key);
	 }
	 }
	public static void main(String[] args) {
		new HelloEhCache();

//		//1. Create a cache manager
//		CacheManager cm = CacheManager.newInstance();
//		
//		//2. Get a cache called "cache1", declared in ehcache.xml
//		Cache cache = cm.getCache("cache1");
//		
//		//3. Put few elements in cache
//		cache.put(new Element("1","Jan"));
//		cache.put(new Element("2","Feb"));
//		cache.put(new Element("3","Mar"));
//		Person person1 = new Person(1,"shayan","jiwa");
//		cache.put(new Element("4",person1));
//		
//		//4. Get element from cache
//		Element ele = cache.get("4");
//		
//		//5. Print out the element
//		String output = (ele == null ? null : ele.getObjectValue().toString());
//		System.out.println(output);
//		
//		//6. Is key in cache?
//		System.out.println(cache.isKeyInCache("3"));
//		System.out.println(cache.isKeyInCache("10"));
//		
//		//7. shut down the cache manager
//		cm.shutdown();
//		EHCacheManager em = new EHCacheManager();
//		em.addToCache("1", new Person(1,"shayan","jiwa"));
//		em.addToCache("2", new Person(2,"kaisar","raja"));
//		System.out.println("Getting Person with id 1 " + em.getFromCache("1"));
//		System.out.println("Getting Person with id 2 " + em.getFromCache("2"));
	}
	
}