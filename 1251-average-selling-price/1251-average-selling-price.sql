# select p.product_id, round(sum(units*price)/ sum(units),2)  as average_price from 
#  prices p JOIN  unitsSold us ON p.product_id=us.product_id AND us.purchase_date between p.start_date and p.end_date group by p.product_id;


SELECT 
    p.product_id, 
    ROUND(COALESCE(SUM(us.units * p.price) / SUM(us.units), 0), 2) AS average_price
FROM 
    prices p 
LEFT JOIN 
    unitsSold us 
ON 
    p.product_id = us.product_id 
    AND us.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY 
    p.product_id;
