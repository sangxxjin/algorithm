SELECT fh.flavor AS flavor
FROM first_half AS fh 
JOIN july AS j ON fh.flavor = j.flavor
GROUP BY fh.flavor
ORDER BY SUM(fh.total_order) + SUM(j.total_order) DESC
LIMIT 3;
