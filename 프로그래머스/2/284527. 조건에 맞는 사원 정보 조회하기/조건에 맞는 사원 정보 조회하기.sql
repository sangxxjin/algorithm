select sum(score) as score, he.emp_no, he.emp_name, he.position, he.email from hr_grade as hg
join hr_employees as he on hg.emp_no = he.emp_no
where hg.year = "2022"
group by hg.emp_no
order by sum(score) desc
limit 1
