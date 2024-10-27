select ii.ingredient_type, sum(fh.total_order) as total_order from icecream_info as ii 
join first_half as fh on ii.flavor = fh.flavor
group by ii.ingredient_type
order by  total_order