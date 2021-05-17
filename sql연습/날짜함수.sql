-- 함수: 날짜 함수

-- CURDATE(), CURRENT_DATE
select CURDATE(), CURRENT_DATE;

-- CURTIME(), CURRENT_TIME
select CURTIME(), CURRENT_TIME;

-- now() vs sysdate()
select now(), sysdate();
select now(), sleep(2), now();
select sysdate(), sleep(2), sysdate();


