-- book 테이블에서 모든 행 검색하여 출력
-- 모든 열 출력
SELECT * FROM book;

-- 도서명과 가격만 검색하여 출력
SELECT bookName, bookPrice FROM book;

-- 저자만 검색하여 출력 (중복되는 행은 한 번만 출력)
SELECT bookAuthor FROM book;
SELECT DISTINCT bookAuthor FROM book;   -- 중복 제거해줌

-- 저자가 '홍길동'인 도서의 도서명, 저자 출력
SELECT bookName,bookAuthor FROM book
WHERE bookAuthor = '홍길동';

-- 가격이 30000 이상인 행의 도서명, 가격, 재고 출력
SELECT bookName,bookPrice,bookStock FROM book
WHERE bookPrice >= 30000;

-- 재고가 3~5 사이인 도서의 도서명, 재고 출력
SELECT bookName, bookStock FROM book
WHERE bookStock>=3 AND bookStock<=5;

-- 범위 (BEETWEEN)
-- 재고가 3~5 사이인 도서의 도서명, 재고 출력(바로 위와 같은 경우)
SELECT bookName, bookStock FROM book
WHERE bookStock BETWEEN 3 AND 5;

-- 리스트에 포함(IN, NOT IN)
-- 출판사명이 '서울 출판사'(pubNo='1')와 '도서출판 멀티'(pubNo='2')인 도서의 도서명, 출판사번호 출력
SELECT bookName, pubNo FROM book
WHERE pubNo IN('1','2');

-- 출판사명이 '도서출판 멀티'(pubNo='2')가 아닌 도서의 도서명, 출판사번호 출력
SELECT bookName, pubNo FROM book
WHERE pubNo NOT IN('2');

-- NULL (IS NULL, IS NOT NULL)
--모든 고객 데이터 출력
SELECT clientName, clientHobby FROM client;

--취미에 NULL값이 들어 있는 행만 출력
SELECT clientName, clientHobby FROM client
WHERE clientHobby IS NULL;

--취미에 NULL값이 아닌 행만 출력
SELECT clientName, clientHobby FROM client
WHERE clientHobby IS NOT NULL;

--취미에 공백이 들어있는 행만 출력
SELECT clientName, clientHobby FROM client
WHERE clientHobby = ' ';

-- 논리 (AND, OR)
-- 저자가 '홍길동'이면서 재고가 3권이상인 모든 도서 출력
SELECT * FROM book
WHERE bookAuthor = '홍길동' AND bookstock >= 3;

-- 저자가 '홍길동'이거나 '성춘향'인 모든 도서 출력
SELECT * FROM book
WHERE bookauthor = '홍길동' OR bookauthor = '성춘향';

-- 패턴 매칭 (LIKE)
-- 출판사 테이블에서 출판사명에 '출판사'가 포함된 모든 행 출력
SELECT * FROM publisher
WHERE pubname LIKE '%출판사%';

-- 고객 테이블에서 출생년도가 1990년대인 모든 행 출력
SELECT * FROM client
WHERE clientbirth LIKE '199%';

-- 고객 테이블에서 이름이 4글자인 모든 행 출력
SELECT * FROM client
WHERE clientname LIKE '____';

-- 도서 테이블에서 도서명에 '안드로이드'가 들어있지 않은 도서의 도서명 출력
SELECT bookName FROM book
WHERE bookName NOT LIKE ('%안드로이드%');

