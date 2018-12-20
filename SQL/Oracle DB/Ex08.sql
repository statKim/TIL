SELECT * FROM client;

-- 1. 고객 테이블에서 고객명, 생년월일, 성별 출력
SELECT clientName, clientbirth, clientgender FROM client;

--2.고객 테이블에서 주소만 검색하여 출력(중복되는행은 한번만 출력)
SELECT DISTINCT clientaddress FROM client;

--3.고객 테이블에서 취미가 '축구'이거나 '등산'인 고객의 고객명, 취미 출력
SELECT clientname, clienthobby FROM client
WHERE clienthobby IN ('축구','등산');

--4.도서 테이블에서 저자의 두번째 위치에 '길'이 들어있는 저자명 출력(중복되는 행은 한번만 출력)
SELECT DISTINCT bookauthor FROM book
WHERE bookauthor LIKE '_길%';

--5.도서테이블에서 발행일이 2017년인 도서의 도서명, 저자, 발행일 출력
SELECT bookname, bookAuthor, bookdate FROM book
WHERE bookdate LIKE '2017%';

--6.도서판매 테이블에서 고객번호 1,2 를 제외한 모든 행 출력
SELECT * FROM bookSale
WHERE clientno NOT IN ('1','2');

--7.고객테이블에서 취미가 NULL이 아니면서 주소거 '서울'인 고객의 고객명, 주소, 취미 출력
SELECT clientname, clientAddress, clienthobby  FROM client
WHERE (clienthobby IS NOT NULL) AND (clientaddress = '%서울%');

--8.도서테이블에서 가격이 25000이상이면서 저자 이름에 '길동'이 들어가는 도서의 도서명, 저자, 가격, 재고 출력
SELECT bookname,bookauthor,bookprice,bookstock  FROM book
WHERE bookprice >= 25000 AND bookauthor LIKE '%길동%';

--9.도서 테이블에서 가격이 20000~25000원인 모든 행 출력
SELECT * FROM book
WHERE bookprice BETWEEN 20000 AND 25000;

--10.도서테이블에서 저자명에 '길동'이 들어있지 않는 도서의 도서명, 저자 출력
SELECT bookname, bookauthor FROM book
WHERE bookauthor NOT LIKE '%길동%';