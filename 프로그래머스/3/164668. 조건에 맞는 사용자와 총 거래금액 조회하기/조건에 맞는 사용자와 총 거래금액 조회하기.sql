select ugu.user_id as user_id, ugu.nickname as nickname, sum(ugb.price) as total_sales
from used_goods_board as ugb join used_goods_user as ugu on ugb.writer_id = ugu.user_id
where ugb.status = 'done'
group by ugu.user_id, ugu.nickname
having sum(ugb.price) >= 700000
order by total_sales