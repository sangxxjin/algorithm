SELECT a.apnt_no as apnt_no, p.pt_name as pt_name, p.pt_no as pt_no, d.mcdp_cd as mcdp_cd, d.dr_name as dr_name, a.apnt_ymd AS apnt_ymd
from patient as p join appointment as a on a.pt_no = p.pt_no
join doctor as d on d.dr_id = a.mddr_id
where date(apnt_ymd) = '2022-04-13' and d.mcdp_cd = 'CS' and a.apnt_cncl_yn = 'N'
order by apnt_ymd