-- 코드를 입력하세요
SELECT p.product_code as product_code, sum(os.sales_amount * p.price) as sales from PRODUCT as p join offline_sale as os on p.product_id = os.product_id
group by p.product_id order by sum(os.sales_amount * p.price) desc, p.product_code