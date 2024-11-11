SELECT ugb.title AS title, ugb.board_id AS board_id, ugr.reply_id AS reply_id, ugr.writer_id AS writer_id, ugr.contents AS contents, DATE_FORMAT(ugr.created_date, '%Y-%m-%d') AS created_date 
FROM used_goods_board AS ugb JOIN used_goods_reply AS ugr ON ugb.board_id = ugr.board_id 
WHERE ugb.created_date BETWEEN '2022-10-01' AND '2022-10-31' 
ORDER BY ugr.created_date ASC, ugb.title ASC;
