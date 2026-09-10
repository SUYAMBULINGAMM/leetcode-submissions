# Write your MySQL query statement below
SELECT x , y , z , 
    CASE
        WHEN x + y + z > 2 * GREATEST(x,y,z) THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;        