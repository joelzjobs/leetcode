SELECT name FROM salesperson WHERE name NOT IN (SELECT p.name FROM orders AS o JOIN salesperson AS p ON o.sales_id = p.sales_id JOIN company AS c ON o.com_id = c.com_id WHERE c.name = 'RED');
