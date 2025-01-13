select count(fi.id) as fish_count 
from fish_info as fi
where time like "2021%"
