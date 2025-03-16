select a.id as id, count(b.parent_id) as child_count
from ecoli_data as a
left join ecoli_data as b on a.id= b.parent_id
group by a.id
order by 1