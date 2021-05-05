package hello.core.beandefinition;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class BeanDefinitionTest {
    AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
    /*xml 테스트해보려면
    GenericXmlApplicationContext ac=new GenericXmlApplicationContext("appConfig.xml");
    */
    @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplicationBean(){
        String[] beanDefinitnionNames=ac.getBeanDefinitionNames();
        for (String beanDefinitnionName : beanDefinitnionNames) {
            BeanDefinition beanDefinition=ac.getBeanDefinition(beanDefinitnionName);
            if(beanDefinition.getRole()==BeanDefinition.ROLE_APPLICATION){
                System.out.println("beanDefinitnionName = " + beanDefinitnionName +
                        "beanDefinition = " + beanDefinition);
            }
        }

    }
}
