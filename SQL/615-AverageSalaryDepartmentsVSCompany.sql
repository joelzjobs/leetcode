SELECT d.pay_month, d.department_id, 
CASE WHEN d.department_avg > c.company_avg THEN 'higher'
     WHEN d.department_avg < c.company_avg THEN 'lower'
     ELSE 'same'
     END AS comparison 
FROM ((SELECT LEFT(s.pay_date, 7) AS pay_month, e.department_id, AVG(s.amount) AS department_avg FROM salary AS s JOIN employee AS e ON s.employee_id = e.employee_id GROUP BY pay_month, e.department_id) AS d LEFT JOIN 
(SELECT LEFT(pay_date, 7) AS pay_month, AVG(amount) AS company_avg FROM salary GROUP BY pay_month) AS c ON d.pay_month = c.pay_month)
ORDER BY d.pay_month DESC, d.department_id;
