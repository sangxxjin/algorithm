select month(start_date) as month, car_id, count(history_id)as records
from car_rental_company_rental_history
WHERE start_date >= '2022-08-01' AND start_date < '2022-11-01' 
and car_id in 
(select car_id 
 from car_rental_company_rental_history
WHERE start_date >= '2022-08-01' AND start_date < '2022-11-01'
group by car_id
having count(car_id)>=5)
group by month(start_date), car_id
order by month(start_date), car_id desc