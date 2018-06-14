SELECT DISTINCT c1.seat_id FROM cinema c1, cinema c2 WHERE (c1.free=1 AND c2.free=1) AND (c2.seat_id=c1.seat_id+1 OR c2.seat_id=c1.seat_id-1);
