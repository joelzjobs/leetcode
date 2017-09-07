SELECT id, IF(p_id IS NULL, 'Root', IF(id IN (SELECT p_id FROM tree), 'Inner', "Leaf")) AS Type FROM tree ORDER BY id; 
