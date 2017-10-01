# Spring_Mybatis
1、原始dao开发，接口实现类继承SqlSessionDaoSupport，通过this.getSqlSession()获取sqlSession<br/>
2、mapper代理开发（mapper的配置：在applicationContext.xml中单个配置以及批量扫描）<br/>
   单个配置：class为org.mybatis.spring.mapper.MapperFactoryBean，property name为mapperInterface<br/>
   批量扫描：class为org.mybatis.spring.mapper.MapperScannerConfigurer，property name为basePackage<br/>
3、mysql_db下是mysq数据库源文件<br/>
4、测试程序<br/>
