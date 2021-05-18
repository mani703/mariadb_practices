 -- subquery
 -- 1) from절의 서브쿼리
 select now() as n, sysdate() as b, 3 + 1 as c;
 select s.n, s.b, s.c
   from (select now() as n, sysdate() as b, 3 + 1 as c) s;
 
 
 -- 예제:
 -- 현재 Fai Bale이 근무하는 부서에서 근무하는 직원의 사번, 전체 이름을 
 -- 출력해보세요.
 select b.dept_no
   from employees a,
        dept_emp b
  where a.emp_no = b.emp_no
    and b.to_date = '9999-01-01'
    and concat(a.first_name, ' ', a.last_name) = 'Fai Bale';
 
 select a.emp_no, a.first_name
   from employees a,
		dept_emp b
  where a.emp_no = b.emp_no
    and b.dept_no = 'd004';

    
 select a.emp_no, a.first_name
   from employees a,
		dept_emp b
  where a.emp_no = b.emp_no
    and b.dept_no = (select b.dept_no
                       from employees a,
							dept_emp b
                      where a.emp_no = b.emp_no
                        and b.to_date = '9999-01-01'
						and concat(a.first_name, ' ', a.last_name) = 'Fai Bale');

 -- 2-1) where 절의 서브쿼리: 단일행
 -- 딘일행 연산자: =, >, <, >=, <=, <>, !=
 
 -- 실습문제 1:
 -- 현재 전체사원의 평균 연봉보다 적은 급여를 받는 사원의  이름, 급여를 나타내세요.
select avg(salary)
  from salaries
 where to_date = '9999-01-01' ;
 
  select a.first_name, b.salary
    from employees a, salaries b
   where a.emp_no = b.emp_no
     and b.to_date = '9999-01-01'
     and b.salary < (select avg(salary)
                       from salaries
                      where to_date = '9999-01-01')
order by b.salary desc;                     

-- 실습문제 2:
-- 현재 가장적은 평균 급여를 받고 있는 직책의 평균 급여를 구하세요
-- engineer 34510
-- 1) 직책별 평균급여
-- 2) 가장 적은 평균 급여

 
 
