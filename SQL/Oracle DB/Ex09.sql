-- 도서명 순으로 도서 검색 (기본 : 오름차순(ASC 생략))
SELECT * FROM book
ORDER BY bookName;

-- 도서명 순으로 도서 검색 (내림차순 DESC)
SELECT * FROM book
ORDER BY bookName DESC;

-- 도서 테이블에서 재고 수량을 기준으로 내림차순 정렬하여 도서명, 저자, 재고 출력
SELECT bookName, bookAuthor, bookStock FROM book
ORDER BY bookStock DESC;

-- 도서 테이블에서 재고 수량을 기준으로 내림차순 정렬하여 도서명, 저자, 재고 출력
-- 재고 수량이 동일한 경우, 저자명으로 오름차순 2차 정렬
SELECT bookName, bookAuthor, bookStock FROM book
ORDER BY bookStock DESC, bookAuthor ASC;
