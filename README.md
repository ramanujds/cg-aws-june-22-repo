# Notes

```text

JPA and Hibernate
----------------------

Java Persistence Api
Postgres

JDBC
---------
ORM - Object Relation Mapping

class Employee												employee
{																	----------
	int id;														id numeric
	String ename;												ename varchar
	LocalDate hiredate;										hiredate date
}

Employee emp1 = new Employee(....)					
persist(emp1)

find(101)

Steps :
------------
1. Create a maven project
2. Add database driver dependency
3. Add hibernate dependency
4. Create Entity class
5. Write persistence configuration
6. Write driver code to perform CRUD operation

```


