select hour(datetime) as hour, count(animal_id) as count
from animal_outs
where hour(datetime) between 09 and 19
group by hour
order by hour
