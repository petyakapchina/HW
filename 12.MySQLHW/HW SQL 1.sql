/*1
*/
select * from hr.departments;
/*2
*/
select department_name from hr.departments;
/*3
*/
select concat(e.first_name, ' ', e.last_name) as 'Full name', e.salary, e.salary/12 as 'by month',
e.salary/240 as 'by day', e.salary/1930 as 'by hour'
from hr.employees e;
/*4
*/
select concat(e.first_name, ' ', e.last_name) as 'Full name',
concat(e.email,'@mail.somecompany.com') as 'Full email address'
from hr.employees e;
/*5
*/
select distinct salary from hr.employees 
order by salary;
/*6
*/
select department_name from hr.departments
union
select region_name from hr.regions
union
select country_name from hr.countries
union
select city from hr.locations;
/*7
*/
select * from hr.employees e
where (e.job_id like 'AC_MGR');
/*8
*/
select concat(first_name, ' ', last_name) as Name
from hr.employees
where (first_name like 'Sa%');
/*9
*/
select concat(first_name, ' ', last_name) as Name
from hr.employees
where (last_name like '%ei%');
/*10
*/
select concat(first_name, ' ', last_name) as Name, salary
from hr.employees
where (salary between 3000 and 5000);
/*11
*/
select concat(first_name, ' ', last_name) as Name, salary
from hr.employees
where (salary between 2000 and 5000) or (salary between  10000 and 15000);
/*12
*/
select concat(first_name, ' ', last_name) as Name, salary
from hr.employees
where (salary in(2500, 4000, 5000));
/*13
*/
select * from hr.locations
where (postal_code is null) or (state_province is null);
/*14
*/
select concat(first_name, ' ', last_name) as Name, salary
from hr.employees
where salary>=10000
order by salary desc;
/*15
*/
select concat(first_name, ' ', last_name) as Name, hire_date
from hr.employees
order by hire_date 
limit 10;
/*16
*/
select d.department_name, l.city
from hr.departments d
natural join hr.locations l;
/*17
*/
select d.department_name, l.city
from hr.departments d
join hr.locations l
using (location_id);
/*18
*/
select d.department_name, l.city
from hr.departments d
join hr.locations l
on (d.location_id=l.location_id);
/*19
*/
select d.department_name, l.city, concat(e.first_name, ' ', e.last_name) as Manager
from hr.departments d
join hr.locations l
on (d.location_id=l.location_id)
join hr.employees e
on (d.manager_id=e.employee_id);
/*20
*/
select l.city, d.department_name
from hr.departments d
right outer join hr.locations l 
on(l.location_id=d.location_id);
/*21
*/
select l.city, d.department_name
from hr.locations l 
left outer join hr.departments d
on(l.location_id=d.location_id);
/*22
*/
select l.city, d.department_name
from hr.locations l, hr.departments d
where(l.location_id=d.location_id);
/*23
*/
select d.department_name, concat(e.first_name, ' ', last_name) as Manager
from  hr.departments d
join hr.employees e
where (d.manager_id=e.employee_id);
/*24
*/
select d.department_name, concat(e.first_name, ' ', last_name) as Manager, l.city
from hr.departments d
join hr.employees e
on (d.manager_id=e.employee_id)
join hr.locations l
on (d.location_id=l.location_id);
/*25
*/
select d.department_name, concat(e.first_name, ' ', last_name) as Employee, e.salary, e.hire_date
from  hr.departments d
join hr.employees e
where (d.department_id=e.department_id and d.department_name in ('Finance','Sales')
and e.hire_date between '1995-01-01' and '2000-01-01')
order by e.hire_date;
/*26
*/
select d.department_name, concat(e.first_name, ' ', last_name) as Employee, jh.end_date
from hr.employees e
join hr.departments d
join hr.job_history jh
on(e.department_id=e.department_id and d.department_name like 'Sales'
 and e.employee_id=jh.employee_id);
 /*27
 */
select concat(e.first_name, ' ', e.last_name) as Employee, concat(m.first_name, ' ', m.last_name) as Manager
from hr.employees e
join hr.employees m
on(e.manager_id=m.employee_id);
/*28
*/
select e.first_name, e2.last_name
from hr.employees e
cross join hr.employees e2;
/*29
*/
select concat(e.first_name, ' ', e.last_name) as Employee,  j.job_title, d.department_name,
l.city, c.country_name, r.region_name
from hr.employees e
join hr.jobs j
on (e.job_id=j.job_id)
join hr.departments d
on (d.department_id=e.department_id)
join hr.locations l
on(l.location_id=d.location_id)
join hr.countries c
on(c.country_id=l.country_id)
join hr.regions r
on(r.region_id = c.region_id);
/*30
*/
select concat(e.first_name, ' ', e.last_name) as Employee,  
j.job_title, concat(m.first_name, ' ', m.last_name) as Manager,
d.department_name, l.city, c.country_name, r.region_name
from hr.employees e
join hr.employees m
on(e.manager_id=m.employee_id)
join hr.jobs j
on (e.job_id=j.job_id)
join hr.departments d
on (d.department_id=e.department_id)
join hr.locations l
on(l.location_id=d.location_id)
join hr.countries c
on(c.country_id=l.country_id)
join hr.regions r
on(r.region_id = c.region_id)
order by e.first_name;
/*31
*/
select * from hr.job_history mgr
where (mgr.job_id = 'AC_MGR') and 
exists (select acc.employee_id from hr.job_history acc
where acc.job_id='AC_ACCOUNT' and
mgr.employee_id=acc.employee_id and
acc.end_date<mgr.start_date);