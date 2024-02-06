package com.xworkz.mvcapp.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

//taronto
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.xworkz.mvcapp")
@PropertySource(ignoreResourceNotFound =true ,value = {"classpath:application.properties"})
public class MvcConfiguration {

    @Autowired
    Environment environment;
    public  MvcConfiguration(){
        System.out.println("invoking constructer of MvcConfiguration");
    }

//bean object creation
    @Bean
  public ViewResolver getViewResolver(){
     return  new InternalResourceViewResolver("/",".jsp");

  }

  //Integrate Spring with ORM(JPA)
  @Bean
  public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){

    final LocalContainerEntityManagerFactoryBean bean= new LocalContainerEntityManagerFactoryBean();
//      bean.setPersistenceUnitName("com.xworkz");
       bean.setDataSource(dataSource());
       bean.setPackagesToScan(new String[]{"com.xworkz.mvcapp.dto"});
      HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
      bean.setJpaVendorAdapter(adapter);
      bean.setJpaProperties(getHibernateProperties());
      return bean;
  }

  @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        dataSource.setConnectionProperties(getHibernateProperties());

       return dataSource;
    }
    @Bean
    public Properties getHibernateProperties(){

        Properties properties =new Properties();

        properties.put("hibernate.dialect",environment.getProperty("hibernate.dialect"));
        properties.put("hibernate.hbm2ddl.auto",environment.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.show_sql",environment.getProperty("hibernate.show_sql"));

        return properties;
    }

}
