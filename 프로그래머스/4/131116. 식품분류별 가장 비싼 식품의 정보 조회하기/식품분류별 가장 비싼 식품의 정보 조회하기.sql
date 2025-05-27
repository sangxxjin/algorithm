SELECT category, price AS max_price, product_name
FROM (
  SELECT *,
         ROW_NUMBER() OVER (PARTITION BY category ORDER BY price DESC) AS rn
  FROM food_product
  WHERE category IN ('과자','국','김치','식용유')
) ranked
WHERE rn = 1
ORDER BY max_price DESC;
