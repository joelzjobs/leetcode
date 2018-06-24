SELECT d.Name AS Department, e1.Name AS Employee, e1.Salary FROM
Employee AS e1 JOIN Department AS d ON e1.DepartmentId = d.Id
WHERE (SELECT COUNT(DISTINCT e2.Salary) FROM Employee AS e2 
       WHERE e2.DepartmentId = e1.DepartmentId AND
       e2.Salary > e1.Salary) < 3;
