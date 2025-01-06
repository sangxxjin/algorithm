select distinct crcrh.car_id from car_rental_company_rental_history as crcrh
join car_rental_company_car as crcc on crcrh.car_id = crcc.car_id
where month(crcrh.start_date) = 10 and crcc.car_type = "세단"
order by crcc.car_id desc