SELECT fi.id, fni.fish_name, fi.length
FROM fish_info AS fi
JOIN fish_name_info AS fni ON fi.fish_type = fni.fish_type
WHERE fi.length = (
    SELECT MAX(length)
    FROM fish_info
    WHERE fish_type = fi.fish_type
)
and fi.length>10
ORDER BY fi.id;