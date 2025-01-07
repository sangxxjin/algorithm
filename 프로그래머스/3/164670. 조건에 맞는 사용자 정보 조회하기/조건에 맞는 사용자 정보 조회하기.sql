SELECT ugu.user_id, 
       ugu.nickname, 
       CONCAT(ugu.city, ' ', ugu.street_address1, ' ', ugu.street_address2) AS "전체주소",
       CONCAT(SUBSTRING(tlno, 1, 3), '-', SUBSTRING(tlno, 4, 4), '-', SUBSTRING(tlno, 8)) AS "전화번호"
FROM used_goods_user AS ugu
JOIN used_goods_board AS ugb ON ugu.user_id = ugb.writer_id
GROUP BY ugu.user_id
HAVING COUNT(ugb.writer_id) >= 3
ORDER BY ugu.user_id DESC;