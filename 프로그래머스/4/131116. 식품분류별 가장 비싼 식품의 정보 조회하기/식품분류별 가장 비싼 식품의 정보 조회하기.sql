SELECT fp.category, fp.price AS max_price, fp.product_name
FROM food_product fp
JOIN (
    SELECT category, MAX(price) AS max_price
    FROM food_product
    WHERE category IN ('과자','국','김치','식용유')
    GROUP BY category
) AS max_fp
ON fp.category = max_fp.category AND fp.price = max_fp.max_price
ORDER BY max_price DESC;
