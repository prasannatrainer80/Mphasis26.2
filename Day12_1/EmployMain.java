package com.java.spr;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class EmployMain {
	public static void main(String[] args) {
		 Employ employ1 = new Employ();
	     employ1.setEmpno(1);
	     employ1.setName("Prasanna");
	     employ1.setBasic(85823);
	     
	     Employ employ2 = new Employ();
	     employ2.setEmpno(2);
	     employ2.setName("Sagar");
	     employ2.setBasic(88723);
	     
	     ExpressionParser parser = new SpelExpressionParser();
	      EvaluationContext context = new StandardEvaluationContext(employ1);
	      Expression exp = parser.parseExpression("name");

	      String name = (String) exp.getValue(context);
	      System.out.println(name);

	      exp = parser.parseExpression("basic > 90000");
	      boolean result = exp.getValue(employ2, Boolean.class);
	      System.out.println(result); 

	}
}
