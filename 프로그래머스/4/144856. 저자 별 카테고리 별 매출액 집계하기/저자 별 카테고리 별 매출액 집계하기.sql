select a.author_id, a.author_name, b.category, sum(b.price * bs.sales)as total_sales 
from author as a
join book as b on a.author_id = b.author_id
join book_sales as bs on bs.book_id = b.book_id
WHERE YEAR(bs.sales_date) = 2022 
  AND MONTH(bs.sales_date) = 1
GROUP BY a.author_id, b.category
order by a.author_id, b.category desc