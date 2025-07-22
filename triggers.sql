CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    customer_name TEXT NOT NULL,
    dish TEXT NOT NULL,
    quantity INTEGER NOT NULL CHECK (quantity > 0),
    price NUMERIC(10, 2) NOT NULL CHECK (price >= 0),
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE order_log (
    log_id SERIAL PRIMARY KEY,
    order_id INT NOT NULL,
    log_time TIMESTAMP DEFAULT NOW()
);


CREATE OR REPLACE FUNCTION log_order_insert()
RETURNS TRIGGER AS $$
BEGIN

RAISE NOTICE 'New order inserted with order_id = %', NEW.order_id;

    INSERT INTO order_log(order_id, log_time)
    VALUES (NEW.order_id, NOW());
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;



CREATE TRIGGER after_order_insert
AFTER INSERT ON orders
FOR EACH ROW
EXECUTE FUNCTION log_order_insert();


INSERT INTO orders (customer_name, dish, quantity, price) VALUES ('Jane Doe', 'pizza', 3, 999);



