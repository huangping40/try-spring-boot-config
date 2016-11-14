Spring Boot @ConfigurationProperties sample
===========================================

结论：
 @ConfigurationProperties 比 @Value 优先级高。规则是: 第一：prefix+name, 第二：value. 不存在prefix + value情况。
 @Value 如果写了， key必须存在。
 
 