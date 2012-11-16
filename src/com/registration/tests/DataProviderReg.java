package com.registration.tests;

import org.testng.annotations.DataProvider;

public class DataProviderReg {

	@DataProvider(name = "create", parallel = true)
	  public static Object[][] createData() {
		  return new Object[][] { { new String ("Lero1"), ("Lero2"), ("Lero3")}, // первый массив данных
				 { new String ("123"), ("456"), ("789")}, // второй массив данных
				{ new String ("Nat1"), ("Nat2"), ("Nat3")} // третий массив данных
		  };	  

	  	};
	  	
		@DataProvider(name = "step1", parallel = true)
		  public static Object[][] createDataStep1() {
			  return new Object[][] { 
				
				//Санкт-Петербург
				 { new String  ("//div[@id='edit-city-wrapper']/span/ul/li[2]"),
					  		   ("Санкт-Петербург"),
				  			   ("+7 (812)"),
							   ("xpath=(//span[@name='abc-numbers'])[2]"),}, 
						 
				//Екатеринбург 		               
		 		  { new String ("//div[@id='edit-city-wrapper']/span/ul/li[3]"), 
						  	   ("Екатеринбург"),
						  	   ("+7 (343)"),
			            	   ("xpath=(//span[@name='abc-numbers'])[3]"),},
								            	   
				//Нижний Новгород
				  { new String ("//div[@id='edit-city-wrapper']/span/ul/li[4]"),
						  	   ("Нижний Новгород"),
						  	   ("+7 (831)"),
				               ("xpath=(//span[@name='abc-numbers'])[4]"),},

				//Калининград		            		  
		 		 { new String ("//div[@id='edit-city-wrapper']/span/ul/li[5]"), 
	            			  ("Калининград"),
	            			  ("+7 (401)"),
	            			  ("xpath=(//span[@name='abc-numbers'])[5]"),},

  				//Самара		            		  
 		 		 { new String ("//div[@id='edit-city-wrapper']/span/ul/li[6]"), 
 	            			  ("Самара"),
 	            			  ("+7 (846)"),
 	            			  ("xpath=(//span[@name='abc-numbers'])[6]"),},
	         	            			  
				//Ростов-на-Дону	            			  
				 { new String ("//div[@id='edit-city-wrapper']/span/ul/li[7]"), 
            				  ("Ростов-на-Дону"),
            				  ("+7 (863)"),
            				  ("xpath=(//span[@name='abc-numbers'])[7]"),}, 
						            				  
				//Казань		            	   
		 		 { new String ("//div[@id='edit-city-wrapper']/span/ul/li[8]"), 
		            		  ("Казань"),
						 	  ("+7 (843)"),
		            		  ("xpath=(//span[@name='abc-numbers'])[8]"),},
																								            				  
				//Москва
				  {new String ("css=li"), 
					  		  ("Москва"),
					  		  ("+7 (499)"),
					  		  ("css=span[name=\"abc-numbers\"]"),}, 
  
												  		  
		  	}; 
	 }; 
		
	 
	 @DataProvider(name = "step1find", parallel = true)
	  public static Object[][] createDataStep1Find() {
		  return new Object[][] { 
			
			//Варианты ввода чисел
				 { new String  ("*12*"), ("12"),},  
				 { new String  ("*123*"), ("12-3"),}, 
				 { new String  ("*1234*"), ("12-34"),}, 
		  	}; 
	 }; 
	 
	 
	 
	 @DataProvider(name = "step2", parallel = true)
	  public static Object[][] createDataStep2() {
		  return new Object[][] { 
			
				     //(String ("lastn"),  ("name"),  ("middlen"),  ("mail"),  ("sfera"),  ("num"))
				 { new String  ("Тестов"), ("Тест"), ("Тестович"), ("test@test.ru"), ("//div[@id='edit-company-scope-wrapper']/span/ul/li[2]"), ("0"),},  
				 { new String   ("123"), ("456"), ("789"), ("111@111.com"), ("//div[@id='edit-company-scope-wrapper']/span/ul/li[3]"), ("-e"),}, 
		  	}; 
	 }; 
	 
	 
	/*	@DataProvider(name = "GroupProvider", parallel = true)
		  public static Object[][] createGroup1() {
			  return new Object[][] { 
					  
				  {new Object[]{(createGroup())},
				  		}
				  };
			};
			
			public static GroupDataEx createGroup() {
				  return new GroupDataEx (
						  "css=li", 
				  		  "+7 (499)",
				  		  "css=span[name=\"abc-numbers\"]");
			} */
		}
