select year(os.sales_date) as year, month(os.sales_date) as month, ui.gender, count(distinct ui.user_id) as users
from user_info as ui join online_sale as os on os.user_id = ui.user_id
where ui.gender is not null
group by year, month, ui.gender
order by year, month, ui.gender