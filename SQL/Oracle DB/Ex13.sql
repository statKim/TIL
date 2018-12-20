-- 수학 함수
-- ROUND 함수 : 반올림한 값을 구하는 함수
-- ROUND(값,자리수) : 자릿수 아래서 반올림하여 자릿수까지 출력
-- 양수 값 : 소수점 오른쪽 자릿수
-- 음수 값 : 소수점 왼쪽 자릿수

-- 고객별 평균 주문액을 백원 단위에서 반올림하여 출력(천원자리까지 출력)
SELECT BS.clientNo, ROUND(AVG(B.bookPrice * BS.bsQty)) AS "평균 주문액",
                    ROUND(AVG(B.bookPrice * BS.bsQty),0) AS "1자리까지 출력",
                    ROUND(AVG(B.bookPrice * BS.bsQty),-1) AS "10자리까지 출력",
                    ROUND(AVG(B.bookPrice * BS.bsQty),-2) AS "100자리까지 출력",
                    ROUND(AVG(B.bookPrice * BS.bsQty),-3) AS "1000자리까지 출력"
FROM book B, bookSale BS
WHERE b.bookno = bs.bookno
GROUP BY bs.clientno;

--REPLACE() : 문자열을 치환하는 함수
--도서명에 '안드로이드'가 포함된 도서에 대해 도서명에 포함된 '안드로이드'를 'Android'로 변경해서 출력
SELECT bookNo, REPLACE(bookName,'안드로이드','Android') bookName, bookAuthor, bookPrice
FROM book
WHERE bookName LIKE '%안드로이드%';

--book 테이블 확인 => 실제 값 변경 X
SELECT bookNo, bookName FROM book;

--LENGTH() : 글자의 수를 반환하는 함수, 단위가 바이트(byte)가 아닌 문자 단위
--LENGTHB() : 바이트 수 반환

--'서울 출판사'에서 출판한 도서의 도서명과 도서명의 글자 수, 바이트 수 출력
SELECT b.bookname AS "도서명", LENGTH(B.bookname) AS "길이",
                                LENGTHB(b.bookname) AS "바이트"
FROM book B, publisher P
WHERE B.pubNo = p.pubno AND P.pubname = '서울 출판사';

--SUBSTR() : 지정한 길이만큼만 문자열을 반환하는 함수
--SUBSTR(전체 문자열, 시작, 길이)

--저자에서 성만 출력
SELECT SUBSTR(bookAuthor,1,1) AS "성"
FROM book;

--저자에서 이름만 출력
SELECT SUBSTR(bookAuthor,2,2) AS "이름"
FROM book;

--저자 중 성이 '손'인 모든 저자 출력
SELECT bookAuthor
FROM book
WHERE SUBSTR(bookAuthor,1,1) = '손';

--저자 중에서 같은 성을 가진 사람이 몇 명이나 되는지 알아보기 위하여 성 별로 그룹지어 인원수 출력
SELECT SUBSTR(bookAuthor,1,1) AS "성", COUNT(*) AS "인원수"
FROM book
GROUP BY SUBSTR(bookAuthor,1,1);

--현재 날짜 출력
SELECT SYSDATE FROM DUAL;
SELECT SYSDATE-1 어제, SYSDATE 오늘, SYSDATE+1 내일 FROM DUAL;

--현재 날짜와 시간 출력
SELECT CURRENT_DATE, CURRENT_TIMESTAMP FROM DUAL;

--날짜 + 숫자 : 그 날짜로부터 그 기간만큼 지난 날짜 계산
--예약일에 7일 더한 날을 입금 마감일로
SELECT bDate, bDate +7 AS "임금 마감일" FROM booking; -- 오른쪽 위에 SQL연습으로 바꾸고 실행

--현재 날짜에서 년, 월, 일 추출
SELECT EXTRACT(YEAR FROM SYSDATE) 년,
        EXTRACT(MONTH FROM SYSDATE) 월,
        EXTRACT(DAY FROM SYSDATE) 일
FROM DUAL;
