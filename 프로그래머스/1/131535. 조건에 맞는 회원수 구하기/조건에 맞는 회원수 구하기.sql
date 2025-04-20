select count(user_id) as users
from user_info
where age>=20 and age<30 and joined like '2021%'