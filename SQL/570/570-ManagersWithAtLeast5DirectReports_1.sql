SELECT Name FROM Employee WHERE Id IN 
(SELECT ManagerId FROM Employee GROUP BY ManagerId HAVING COUNT(*) > 4);