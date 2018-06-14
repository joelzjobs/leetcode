SELECT IF(id%2=0, id-1, IF(id<(SELECT COUNT(*) FROM seat), id+1, id)) AS id, student FROM seat ORDER BY id;
