select ao.ANIMAL_ID, ao.NAME 
from ANIMAL_OUTS as ao 
left join ANIMAL_INS as ai on ai.ANIMAL_ID = ao.ANIMAL_ID 
where ai.ANIMAL_ID is null
