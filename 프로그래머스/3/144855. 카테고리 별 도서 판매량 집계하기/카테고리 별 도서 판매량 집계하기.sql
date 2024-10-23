select b.category, sum(bs.sales) as total_sales 
from book as b join book_sales as bs on b.book_id = bs.book_id
WHERE bs.sales_date BETWEEN '2022-01-01' AND '2022-01-31'
group by b.category
order by b.category