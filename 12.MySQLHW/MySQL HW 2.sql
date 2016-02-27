/*1*/
select avg(salary) as 'Avarage salary in Sales'
from hr.employees where (department_id=80);

/*2*/
select count(department_id) as 'People in Sales'
from hr.employees where (department_id=80);

/*3*/
select count(distinct location_id) as 'Offices locations'
from hr.departments;

/*4*/
select count(manager_id) as 'Departments with manager'
from hr.departments where manager_id is not null;

/*5*/
select count(manager_id) as 'Departments without manager'
from hr.departments where manager_id is null;

/*6*/
select d.department_name, avg(e.salary) as 'Avarage salary'
from hr.employees e
join hr.departments d
on d.department_id=e.department_id
group by d.department_name;

/*7*/
select d.department_name, count(e.employee_id) as 'Number of employees', l.city
from hr.employees e
join hr.departments d
on e.department_id=d.department_id
join hr.locations l
on d.location_id=l.location_id
group by d.department_name, l.city;

/*8*/
select d.department_name, concat(m.first_name,' ', m.last_name) as Manager, count(e.employee_id) as 'Number of people managed'
from hr.employees e
join hr.employees m
on m.employee_id=e.manager_id
join hr.departments d
on e.department_id=d.department_id
group by d.department_name, Manager;

/*9*/
select d.department_name, concat(m.first_name,' ', m.last_name) as Manager, count(e.employee_id) as 'Number of people managed', l.city
from hr.employees e
join hr.employees m
on m.employee_id=e.manager_id
join hr.departments d
on e.department_id=d.department_id
join hr.locations l
on l.location_id=d.location_id
group by d.department_name, Manager
having count(e.employee_id)=5;

/*10*/
select r.region_name, count(e.employee_id) as 'Number of employees'
from hr.employees e
join hr.departments d
on e.department_id=d.department_id
join hr.locations l
on d.location_id=l.location_id
join hr.countries c
on c.country_id=l.country_id
right join hr.regions r
on r.region_id=c.region_id
group by r.region_name;

/*11*/
select d.department_name, j.job_title, count(e.employee_id) as 'Number of employees'
from hr.employees e
join hr.departments d
on d.department_id=e.department_id
join hr.jobs j
on j.job_id=e.job_id
group by d.department_name, j.job_title;

/*12*/
select concat(e.first_name,' ',e.last_name) as 'Employee', e.salary
from hr.employees e
where e.salary =
(select min(e.salary) from hr.employees e);


/*13*/
select concat(e.first_name, ' ', e.last_name) as Employee, e.salary
from hr.employees e
where e.salary<
(select min(salary)*1.1 from hr.employees);

/*14*/
select d.department_name, concat(e.first_name, ' ', e.last_name) as Employee, max(e.salary) as 'Highest salary'
from hr.employees e
join hr.departments d
on e.department_id=d.department_id
group by d.department_name;

/*15*/
select e.last_name
from hr.employees e
where length(e.last_name)=5;

/*16*/
select first_name, last_name
from hr.employees
where substring(first_name,1,1)=substring(last_name,1,1);

/*17*/
select d.department_name, coalesce(concat(e.first_name,' ',e.last_name), 'No manager') as Manager 
from hr.departments d
left join hr.employees e
on (d.manager_id=e.employee_id);

/*18*/
select concat(e.first_name,' ',e.last_name) as Employee, count(m.manager_id=e.employee_id) as'People managed'
from hr.employees e
join hr.employees m
on m.employee_id=e.employee_id
group by Employee;

SELECT concat(m.first_name, ' ', m.last_name) as Employee, COUNT(e.employee_id) as 'People managed',
if(COUNT(e.employee_id)=0, 'Just employee', if(COUNT(e.employee_id)=1, 'Junior mananger', 'Manager')) as 'Message'
FROM hr.employees m
LEFT JOIN hr.employees e 
ON e.manager_id=m.employee_id
GROUP BY Employee;

/*19*/
select DATE_FORMAT( NOW(), '%H:%i:%s  %d-%m-%Y') as 'Current time and date';

select date_add(current_date(), interval 1 week) as 'Date after a week';

/*20*/
CREATE TABLE users (
  user_id int(20) unsigned not null auto_increment,
  username varchar(10) NOT NULL ,
  pass_word varchar(20) not null,
  full_name varchar(30) not null,
  last_login_time timestamp,
  PRIMARY KEY (user_id)  
);

DELIMITER $$
CREATE TRIGGER fill_full_name 
    BEFORE INSERT ON users
    FOR EACH ROW 
BEGIN
    INSERT INTO users (full_name) values (new.full_name);
END$$
DELIMITER ;

insert into users (user_id, username, pass_word, full_name)
values (null, 'Maya', '123','Maya Stoikova');

/*21*/
create view users_from_today
as
select * from users
where date_sub(curdate(), interval 1 day)<=last_login_time;

/*22*/
create table groups(
  group_id int(20) unsigned not null auto_increment,
  group_name varchar(50) NOT NULL ,
  PRIMARY KEY (group_id),
  UNIQUE KEY (group_name)
);


/*23*/
alter table users add (group_id int(15));

ALTER TABLE users
ADD CONSTRAINT fk_groups
FOREIGN KEY (group_id)
REFERENCES groups(group_id);

/*24*/
insert into groups
values(null, 'Polish users');

insert into groups
values(null, 'Bulgarian users');

insert into users 
values (null,'Penka', '256','Pena Pavlova',now(),2);

insert into users 
values (null,'Gosho', '48687','Gosho Goshev',now(),2);

insert into users 
values (null,'Lenka', '54668','Lenka Laptsova',now(),1);

insert into users 
values (null,'Mateusz', '87645','Mateusz Kubasziak',now(),1);

update users set group_id=2 where user_id=1;
update users set group_id=2 where user_id=2;

/*25*/
insert into users(user_id, username, pass_word,full_name)
select null, email, ' ', concat(first_name, ' ', last_name)
from hr.employees;

/*26
1129 users added to table users
*/

/*27*/
update users 
set pass_word = null
where last_login_time<='2006-03-10';

/*28*/
delete from users
where pass_word is null;

/*29*/
select username from users
where username like 's%';

/*30*/
create table workhours(
id int(20) unsigned primary key auto_increment,
da_te datetime not null,
task varchar(50) not null,
hours int(10) not null,
comment varchar(200)
);

/*31*/
alter table workhours add (employee_id int(15));

ALTER TABLE workhours
ADD CONSTRAINT fk_employee
FOREIGN KEY (employee_id)
REFERENCES hr.employees(employee_id);

/*32*/
insert into workhours values (null, now(), 'answer all emails', 5, 'no comment',8);
insert into workhours values (null, now(), 'invite employees to sign annexes', 12, '50 employees have to sign',1);
insert into workhours values (null, now(), 'invite new employees to sign contract', 2, 'no comment',18);
insert into workhours values (null, now(), 'accounts in the holiday system for new employees', 3, 'no comment',6);
insert into workhours values (null, now(), 'take documents for sigsntures', 1, 'no comment',82);

/*33*/
select avg(w.hours), c.country_name
from hr.countries c
join hr.locations l
on l.country_id=c.country_id
join hr.departments d
on d.location_id=l.location_id
join hr.employees e
on d.department_id=e.department_id
join workinghours w
on w.employee_id=e.employee_id
group by c.county_name;

/*34*/
select d.department_name
from hr.departments d
join hr.employees e
on e.department_id=d.department_id
join workhours w
on w.employee_id=e.employee_id
where date_sub(curdate(), interval 1 week)<=w.da_te
and w.hours > 8;

/*35*/
select concat(e.first_name, ' ', e.last_name), d.department_name, c.country_name
from hr.countries c
join hr.locations l
on l.country_id=c.country_id
join hr.departments d
on d.location_id=l.location_id
join hr.employees e
on d.department_id=e.department_id
join workhours w
on w.employee_id=e.employee_id
where sum(w.hours) > 40 
group by d.department_name, c.country_name;






















