select mp.member_name as member_name, rr.review_text as review_text, date_format(rr.review_date,"%Y-%m-%d") as review_date
from member_profile as mp join rest_review as rr on mp.member_id = rr.member_id
where mp.member_id = (select member_id from rest_review group by member_id order by count(*) desc limit 1)
order by rr.review_date, rr.review_text