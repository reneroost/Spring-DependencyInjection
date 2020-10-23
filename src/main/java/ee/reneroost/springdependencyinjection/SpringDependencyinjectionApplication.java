package ee.reneroost.springdependencyinjection;

import ee.reneroost.springdependencyinjection.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext kontekst = SpringApplication.run(SpringDependencyinjectionApplication.class, args);

		System.out.println("------------ I18n");
		I18nController i18nController = (I18nController) kontekst.getBean("i18nController");
		System.out.println(i18nController.ytleTere());

//		System.out.println("------------ Minu");
//		MinuKontroller minuKontroller = (MinuKontroller) kontekst.getBean("minuKontroller");
//		System.out.println(minuKontroller.ytleTere());
//
//		System.out.println("------------ Property");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) kontekst.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.saaTervitus());
//
//		System.out.println("------------ Setter");
//		SetterInjectedController setterInjectedController = (SetterInjectedController) kontekst.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.saaTervitus());
//
//		System.out.println("------------ Constructor");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) kontekst.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.saaTervitus());
	}

}
