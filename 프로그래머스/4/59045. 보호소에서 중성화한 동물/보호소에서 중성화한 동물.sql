select ao.animal_id as animal_id, ao.animal_type as animal_type, ao.name as name
from animal_ins as ai
join animal_outs as ao on ai.animal_id = ao.animal_id
where ai.sex_upon_intake like 'Intact%' and (ao.sex_upon_outcome like 'Spayed%' or ao.sex_upon_outcome like 'Neutered%')
order by ao.animal_id