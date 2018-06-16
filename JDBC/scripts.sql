select * from employees.employees where first_name = 'Ramzi' and last_name = 'Erde';

--10021	1960-02-20	Ramzi	Erde	M	1988-02-10


select * from titles where emp_no = '10021';


select e.emp_no , e.first_name, e.last_name , t.title , s.from_date , s.to_date , s.salary  from employees e
  join titles t ON e.emp_no = t.emp_no
  join salaries s ON e.emp_no = s.emp_no
where e.first_name = 'Ramzi' and e.last_name = 'Erde';

select e.emp_no , e.first_name, e.last_name , d.dept_name from employees e
  join dept_emp emp ON e.emp_no = emp.emp_no
  join departments d ON emp.dept_no = d.dept_no
where e.first_name = 'Ramzi' and e.last_name = 'Erde';


select d.dept_name Department_Name , count(*) Total_employees from employees e
  join dept_emp emp ON e.emp_no = emp.emp_no
  join departments d ON emp.dept_no = d.dept_no

GROUP BY d.dept_name;




select * from departments