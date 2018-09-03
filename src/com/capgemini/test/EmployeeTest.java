package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
class EmployeeTest {
	Employee details; 
		@BeforeEach
		void setUp() {
			 details = new Employee("Raju",1234567,45000,15);
		}


		@Test
		void testCalculateSalary() {
			assertEquals(69050.00,details.actualSalary());
		}

}