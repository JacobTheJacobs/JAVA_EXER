

public  class Employee {
		
		//props
		private String name;
		private Double payHour;
		private Double[] workedHours= new Double[25];
		final private Double minWage=5300.0;
	
		
		//constructor
		public Employee(String name, Double pay, Double[] workedHours) {
			this.name = name;
			this.payHour = pay;
			this.workedHours = workedHours;
		}


		//getters
		public String getName() {
			return name;
		}
		public Double getPay() {
			return payHour;
		}
		public Double[] getWorkedHours() {
			return workedHours;
		}

		
		//setters
		public void setPay(Double pay) {
			this.payHour = pay;
		}
		public void setWorkedHours(Double[] workedHours) {
			this.workedHours = workedHours;
		}
		
		
		
		//get month income for employee
		public Double getMonthIncome() {
			//init var
			Double wage=0.0;
			
			//get the 25% of wage rate
			Double t = ((this.payHour)/100)*25;
			
			//loop over the working hours
			for(int i=0;i<this.workedHours.length;i++) {
				
				//check if employee has more then 8 hours
				if(this.workedHours[i]>8.0) {
					
					//calculate the salary for first 8 hours
					wage+=((this.workedHours[i])-(this.workedHours[i]-8))*this.payHour;
					
					//add the 25% after 8 hours
					wage+=(this.workedHours[i]-8)*t;
					
				//if employee has 8 hours exact or less	
				}else {
					wage+=this.workedHours[i]*this.payHour;
				}
				
			}
			return wage;
		}
		
		
		public String compareIncome(Employee emp) {
			
			Double emp1Inc = getMonthIncome();
			Double emp2Inc = emp.getMonthIncome();
			
			if(emp1Inc>emp2Inc) {
				return this.name;
			}else {
				return emp.getName();
			}
		}
		
		public boolean checkIncome() {
			
			Double emp1Inc = getMonthIncome();
			
			if(emp1Inc>this.minWage) {
				return true;
			}else {
				return false;
			}
		}
		
		
		//to string
		public String toString() {
			String s= "\n Name :" + this.name + "\n Hour Rate : "+ this.payHour + "\n Month Working Hours \n --------------------------- ";
			for(int i =0; i<this.workedHours.length;i++) {
				s+="\n "+ this.workedHours[i] + " working hours for day "+ (i+1);
			}
			return s;
			
		}
		
		
		
	}



----------------------------------------------------------------------------------------------------------------------------------------------------------
  
  
  import java.util.Random;

public class TestEmployee {
	
	//get avg salary of 2 employees
	public static Double getAvgIncome(Employee a, Employee b) {
		
		//get employee 1 salary
		Double a1 = a.getMonthIncome();
		//get employee 2 salary
		Double b1= b.getMonthIncome();
		
		//return avg
		return (a1+b1)/2;
		
	}
	
	
	//init 20 employees
	public static Employee[] init() {
		//create salary array
		Double[] salary = { 7.0, 6.0, 8.0, 8.0, 4.0,
				
				7.0, 6.0, 8.0, 8.0, 4.0,
				
				7.0, 6.0, 8.0, 8.0, 4.0,
				
				7.0, 6.0, 8.0, 8.0, 4.0,
				
				7.0, 6.0, 8.0, 8.0, 4.0};
		
		//create 2 salary array
		Double[] salary2 = { 8.0, 8.0, 8.0, 8.0, 8.0,
				
				8.0, 8.0, 8.0, 8.0, 8.0,
				
				8.0, 8.0, 8.0, 8.0, 8.0,
				
				8.0, 8.0, 8.0, 8.0, 8.0,
				
				8.0, 8.0, 8.0, 8.0, 8.0};

		//create names array				
		String[] name = {"James", "Marry", "Tammy", "Sammy", "Rammy",
						 "Manny", "Danny", "Kenny", "Benny", "Janny",
						 "Penny","Nanny", "Lanny", "Shabby", "Tobby",
						 "Venny","Wanny", "Ganny", "Zhabby", "Yobby",};
		//create wage 
		Double wage = 27.0;
		
		//init 20 employees
		Employee[] employees = new Employee[20];
		
		//insert the eployees to array
		for(int i =0; i<employees.length;i++) {
			
			//create new employee
			employees[i]= new Employee(name[i], wage, salary);
			
			//set last 10 employees with bigger salary
			if(i>10)
				employees[i].setWorkedHours(salary2);
		}
		
		//return the employees
		return employees;
		
	}
	
	
	//number of salarys that are bigger than min wage
	public static int numOfEmployeesBiggerSalary(Employee[] employees) {
		//count var
		int c=0;
		//loop over the employees array
		for(int i =0 ; i <employees.length;i++) {
			//check if the income is bigger then minimum wage
			if(employees[i].checkIncome())
				c++;
		}
		//return the number of employees
		return c;
	}
	
	
	//get avg salary of all employees
		public static Double allEmployeesAvgSalary(Employee[] employees) {
			//count var
			Double c=0.0;
			//loop over the employees array
			for(int i =0 ; i <employees.length-1;i+=2) {
				//check if the income is bigger then minimum wage
				c+=getAvgIncome(employees[i],employees[i+1]);
			}
			//divide by 10 because we get avg from 2 employees
			return c/10;
			
		}
		

		
	
	public static void main(String[]args) {
		
		
		
		
		//init employees array
		Employee[] employees= init();
		
		
		//employee 1
		Employee emp1 = new Employee("John",27.0 ,new Double[]{ 7.0, 6.0, 8.0, 8.0, 4.0,
				
																7.0, 6.0, 8.0, 8.0, 4.0,
																
																7.0, 6.0, 8.0, 8.0, 4.0,
																
																7.0, 6.0, 8.0, 8.0, 4.0,
																
																7.0, 6.0, 8.0, 8.0, 4.0
																
		});
		
		
		//employee 2
		Employee emp2 = new Employee("Bob",27.0 ,new Double[]{  8.0, 8.0, 8.0, 8.0, 8.0,
				
																8.0, 8.0, 8.0, 8.0, 8.0,
																
																8.0, 8.0, 8.0, 8.0, 8.0,
																
																8.0, 8.0, 8.0, 8.0, 8.0,
																
																8.0, 8.0, 8.0, 8.0, 8.0});
		
		
		//to string
		System.out.println(emp1.toString());
		System.out.println();
		System.out.println(emp2.toString());
		System.out.println();
		
		
		//get monthly income
		System.out.println("Employee 1 Salary");
		System.out.println(emp1.getMonthIncome());
		System.out.println();
		System.out.println("Employee 2 Salary");
		System.out.println(emp2.getMonthIncome());
		System.out.println();
		
		
		
		//check who is making more salary
		System.out.println("Making more Salary is Employee");
		System.out.println(emp1.compareIncome(emp2));
		System.out.println();
		System.out.println("Making more Salary is Employee Compare Again");
		System.out.println(emp2.compareIncome(emp1));
		System.out.println();
		
		
		//check if the salary is bigger the minimum
		System.out.println("Is the income bigger then min wage which is 5300");
		System.out.println(emp1.checkIncome());
		System.out.println();
		System.out.println("Is the income bigger then min wage which is 5300");
		System.out.println(emp2.checkIncome());
		System.out.println();
		
		//outter mothods
		//get avg of 2 employees
		System.out.println();
		System.out.println("Get average salary of 2 employees");
		System.out.println(getAvgIncome(emp1,emp2));
		
		//number of employees that there salary is bigger then minumum
		System.out.println();
		System.out.println("Number of employees with salary bigger then minimum wage");
		System.out.println(numOfEmployeesBiggerSalary(employees));
		
		//getting all the avrage salary of all the employees
		System.out.println();
		System.out.println("All the eployees average salary");
		System.out.println(allEmployeesAvgSalary(employees));
		
	}
	

}










---------------------------------------------------------------------------------------------------------------------------------------------------
  
  import java.util.Random;

public class TestTraveler {
	
	//get all the places that traveler visit
	public static void getTravelerPlacesVisited(Traveler a, Traveler b) {
		
		//get employee 1 salary
		int Aplaces= a.getCountPlaceVisted();
		System.out.println("The number of the places Traveler A visited: " + Aplaces);
		
		int Bplaces= b.getCountPlaceVisted();
		System.out.println("The number of the places Traveler B visited: " + Bplaces);
		
	}
	
	
	//init 20 travelers
	public static Traveler[] init() {
		Random r = new Random();

		//create names array				
		String[] name = {"James", "Marry", "Tammy", "Sammy", "Rammy",
						 "Manny", "Danny", "Kenny", "Benny", "Janny",
						 "Penny","Nanny", "Lanny", "Shabby", "Tobby",
						 "Venny","Wanny", "Ganny", "Zhabby", "Yobby",};

		//init 20 travelers
		Traveler[] trvs = new Traveler[20];
		
		//insert the travelers to array
		for(int i =0; i<trvs.length;i++) {
			
			//create new traveler
			trvs[i]= new Traveler(name[i], r.nextInt(55-21)+21);
			
			trvs[i].addPlace("New-York");
			trvs[i].addPlace("Australia");
			trvs[i].addPlace("Russia");
			trvs[i].addPlace("Israel");
			trvs[i].addPlace("London");

			//add more places to last 10 travelers
			if(i>10) {
				trvs[i].addPlace("Canada");
				trvs[i].addPlace("Mexico");
				trvs[i].addPlace("Spain");
			}
			//add more places to last 5 travelers
			if(i>14) {
				trvs[i].addPlace("Africa");
				trvs[i].addPlace("China");
			}
			//add more places to last 2 travelers
			if(i>18)
				trvs[i].addPlace("Japan");
		}
		
		//return the travelers
		return trvs;
		
	}
	
	
	//get minimum age of travelers group
	public static int getMinAgeOfGroup(Traveler[] trvs) {
		//age var
		String name="";
		int age=trvs[0].getAge();
		//loop over the travelers array
		for(int i =1 ; i <trvs.length;i++) {
			//compare age
			if(trvs[i].getAge()<age) {
				age=trvs[i].getAge();
			}
		}
		//return min age
		return age;
		
	}
	
	
	  //get avg  of all travelers places
		public static int allTravelersAvgPlaces(Traveler[] trvs) {
			//count var
			int c=0;
			//loop over the travelers array
			for(int i =0 ; i <trvs.length;i++) {
				//get all places traveler visited
				c+=trvs[i].getCountPlaceVisted();
			}
			//divide by 20 
			return c/20;
			
		}
		

		
	
	public static void main(String[]args) {
		
		
		
		
		//init travelers array
		Traveler[] travelers= init();
		
		
		//traveler 1
		Traveler trv1 = new Traveler("John",41);
		
		
		//traveler 2
		Traveler trv2 = new Traveler("Bob",31);
		

		trv1.addPlace("New-York");
		trv1.addPlace("Australia");
		trv1.addPlace("Russia");
		trv1.addPlace("Israel");
		trv1.addPlace("London");
		trv1.addPlace("Canada");
		trv1.addPlace("Mexico");
		trv1.addPlace("Spain");
		trv1.addPlace("Africa");
		trv1.addPlace("China");
		trv1.addPlace("Japan");
		

		trv2.addPlace("Israel");
		trv2.addPlace("Antartica");
		trv2.addPlace("Africa");
		trv2.addPlace("India");
		trv2.addPlace("China");
		trv2.addPlace("Mongolia");
		
		
		//check who is more younger traveler
		System.out.println("The Younger Traveler");
		System.out.println(trv1.compareAge(trv2));
		System.out.println();
		
		//show who visted the most places
		System.out.println("The Most Travlled Traveler");
		System.out.println(trv1.comparePlaces(trv2));
		System.out.println();
		
		//show all the common places travelers been
		System.out.println("The Common Places the travelers Been");
		trv1.comparePlacesTwoTravelersBeen(trv2);
		System.out.println();
		
		//to string
		System.out.println(trv1.toString());
		System.out.println();
		System.out.println(trv2.toString());
		System.out.println();
		
		
		//get all the places that traveler visit
		getTravelerPlacesVisited(trv1, trv2);
		System.out.println();
		
		
		//get minimum age of travelers group
		System.out.println("The Younger Traveler of group");
		System.out.println(getMinAgeOfGroup(travelers));
		
		
		//get avg  of all travelers places
		System.out.println("The average number of places the group visited");
		System.out.println(allTravelersAvgPlaces(travelers));
		
		
	}
	

}

















--------------------------------------------------------------------------------------------------------------------------------------------------
  
  
  
  

public  class Traveler {
		

		//props
		//taveler name
		private String name;
		//taveler age
		private int age;
		//taveler max size of array
		final private int MAX_PLACES_SIZE=200;
		//taveler place visit
		private String[] placeVisted;
		//taveler count size of array
		private int countPlaceVisted;
	
		
		//constructor
		public Traveler(String name, int age) {
			this.name = name;
			this.age = age;
			this.placeVisted = new String[this.MAX_PLACES_SIZE];;
			this.countPlaceVisted = 0;
		}



		//getters
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String[] getPlaceVisted() {
			return placeVisted;
		}
		public int getCountPlaceVisted() {
			return countPlaceVisted;
		}

		
		//setter
		public void setAge(int age) {
			this.age = age;
		}

		
		//add place to visited places of the tourist
		public boolean addPlace(String name) {
			//check if can add new place to array
			if(this.countPlaceVisted ==this.MAX_PLACES_SIZE) {
				return false;
			}
			//increment and add
			this.placeVisted[countPlaceVisted++]=name;
			return true;
		}
		
		
		//check whoever is younger traveler
		public String compareAge(Traveler b) {
			//check age
			if(this.age<b.getAge()) {
				return this.name;
			}else {
				return b.getName();
			}
			
		}
		
		//check whoever been in most places
		public String comparePlaces(Traveler b) {
			//check count of places
			if(this.countPlaceVisted>b.getCountPlaceVisted()) {
				return this.name;
			}else {
				return b.getName();
			}
			
		}
		
		//check whatever places two traveler where
		public void comparePlacesTwoTravelersBeen(Traveler b) {
			//check age
			String[] placesBVisted=b.getPlaceVisted();
			//create travler places a index
			int aIndex =0;
			//create travler places b index
			int bindex =0;
			//loop over the array
			for(;aIndex<this.countPlaceVisted;aIndex++) {
				
				//print the same places
				if(this.placeVisted[aIndex].equals(placesBVisted[bindex])) {
					System.out.println(this.placeVisted[aIndex]);
				}
				//if last element of array then increment
				if(aIndex==this.countPlaceVisted-1) {
					aIndex=0;
					bindex++;
				}
				//if last element of array of b then end loop
				if(bindex==placesBVisted.length) {
					break;
				}
			}
			
		}
		
		
		//to string
		public String toString() {
			String s= "\n Name :" + this.name + "\n Age : "+ this.age + 
					"\n Places Visted So Far\n --------------------------- ";
			for(int i =0; i<this.countPlaceVisted;i++) {
				s+="\n "+ this.placeVisted[i] + " index => "+ (i+1);
			}
			return s;
			
		}
	
		
	}

	
----------------------------------------------------------------------------------------------------------------------------------------------------------------
	
