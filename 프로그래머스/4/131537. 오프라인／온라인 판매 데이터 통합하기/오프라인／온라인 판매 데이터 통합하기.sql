SELECT 
    DATE_FORMAT(sales_date, "%Y-%m-%d") AS sales_date, 
    product_id, 
    user_id, 
    SUM(sales_amount) AS sales_amount
FROM online_sale
WHERE sales_date BETWEEN '2022-03-01' AND '2022-03-31'
GROUP BY sales_date, product_id, user_id

UNION ALL

SELECT 
    DATE_FORMAT(sales_date, "%Y-%m-%d") AS sales_date, 
    product_id, 
    NULL AS user_id, 
    SUM(sales_amount) AS sales_amount
FROM offline_sale
WHERE sales_date BETWEEN '2022-03-01' AND '2022-03-31'
GROUP BY sales_date, product_id

ORDER BY sales_date, product_id, user_id;
