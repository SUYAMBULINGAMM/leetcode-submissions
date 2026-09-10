# Write your MySQL query statement below
select e1.name as Employee from Employee e join Employee e1 on e.id = e1.managerId where e.salary<e1.salary;