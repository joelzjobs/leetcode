SELECT
    e.Id, e.Company, e.Salary
FROM
    Employee AS e,
    Employee AS a
WHERE
    e.Company = a.Company
GROUP BY e.Company , e.Salary
HAVING SUM(CASE
    WHEN e.Salary = a.Salary THEN 1
    ELSE 0
END) >= ABS(SUM(SIGN(e.Salary - a.Salary)))
ORDER BY e.Id;
