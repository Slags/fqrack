package com.fqcoder.fqrack.shiro.config;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName: ShiroFilterMapFactory
 * @author fuce
 * @date 2018年8月26日
 *
 */
public class ShiroFilterMapFactory {

	public static Map<String, String> shiroFilterMap() {
//		设置路径映射，注意这里要用LinkedHashMap 保证有序
		LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
		//对所有用户认证
		filterChainDefinitionMap.put("/static/**", "anon");
		filterChainDefinitionMap.put("/login", "anon");
		filterChainDefinitionMap.put("/logout", "logout");
		//前端
		filterChainDefinitionMap.put("/", "anon");
		filterChainDefinitionMap.put("/index", "anon");//任务调度暂时放开
		

		//对所有页面进行认证
		filterChainDefinitionMap.put("/**","authc");
		return filterChainDefinitionMap;
	}
}
