package com.test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.test"})
public class SpringConfigure {
	  @Bean (name="BeanComp")
	  public BeanComp config() { BeanComp bean=new BeanComp();
	  bean.setField1("field1"); bean.setField2("field2"); return bean;
  }
}
