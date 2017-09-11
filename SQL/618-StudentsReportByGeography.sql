SET @r1=0, @r2=0, @r3=0;
SELECT MIN(America) AS America, MIN(Asia) AS Asia, MIN(Europe) AS Europe
FROM (SELECT CASE continent WHEN 'America' THEN @r1:=@r1+1
                            WHEN 'Asia' THEN @r2:=@r2+1
                            WHEN 'Europe' THEN @r3:=@r3+1 END AS RowNum,
             CASE WHEN continent='America' THEN name END AS America,
             CASE WHEN continent='Asia' THEN name END AS Asia,
             CASE WHEN continent='Europe' THEN name END AS Europe
     FROM student ORDER BY name) AS T
GROUP BY RowNum;
