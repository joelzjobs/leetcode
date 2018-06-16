SELECT dept_name, COUNT(student_id) AS student_number FROM
department AS d LEFT JOIN student AS s ON d.dept_id = s.dept_id
GROUP BY dept_name
ORDER BY student_number DESC, dept_name;