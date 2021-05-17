-- select 연습
select * from departments;
select dept_no, dept_name from departments;

-- alias(as, 생략 가능)
-- 예제 : employees 테이블에서 직원의 이름, 성별, 입사일을 출력
select first_name as name,
       gender as 성별,
       hire_date as 입사일 
  from employees;

-- concat
-- 예제 : employees 테이블에서 직원의 전체이름, 
--       성별,
--       입사일
--       출력
select concat(first_name, ' ', last_name) as 전체이름, 
	   gender as 성별,
       hire_date as 입사일 
  from employees;

-- distict
-- 예제 1:  titles 테이블에서 모든 직급의 이름 출력
select title from titles;
-- 예제 2: titles 테이블에서 직급은 어떤 것들이 있는지 직급이름을
--        한 번씩만 출력
select distinct(title) from titles;

