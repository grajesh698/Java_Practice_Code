package InterviewSampleCode;

public class N_HighestSalaryinDBTable {

	public static void main(String[] args) {
		
		//Pring 8th Highestsalary form DB
	
/*
 * 		//No duplicate
		select DISTINCT sal from employee order by sal desc LIMIT n-1
		
		//With duplicate		
		select Top(8) salary from(select Top(8) salary from employee Orderedby salary DESC) As emp Orderedby salary ASC
		
		select * from employee as emp1 where (n-1)=(select count(dist (emp2.salary)) from emplyee as emp2 where emp2.salary>emp1.salary)

		select salary FROM employee ORDER BY salary desc limit n-1,1
*/
	}
}