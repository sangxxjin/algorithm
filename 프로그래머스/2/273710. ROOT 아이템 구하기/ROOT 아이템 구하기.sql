select ii.item_id, ii.item_name from item_info as ii 
where ii.item_id in (select item_id from item_tree where parent_item_id is null)  
order by ii.item_id

