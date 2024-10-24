SELECT oa.user_id, oa.product_id 
FROM online_sale AS oa
GROUP BY oa.user_id, oa.product_id
HAVING COUNT(oa.product_id) > 1
order by oa.user_id,oa.product_id desc