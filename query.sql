drop table user;

drop table product;
CREATE TABLE User (
    userId VARCHAR(25) PRIMARY KEY NOT NULL,
    userName VARCHAR(25),
    email VARCHAR(100),
    phoneNumber VARCHAR(25),
    city VARCHAR(25)
);

insert into user values ('U1001','Dileep','dileep.raj@bizruntime.com','9902535566','Bangalore'),
						('U1002','Dhinesh','dhinesh.raja@bizruntime.com','9902535566','Pune'),
						('U1003','Raja','raja.d@bizruntime.com','9902535566','Chennai'),
                        ('U1004','Abhishek','abhishekkumar.raj@bizruntime.com','9902535566','Delhi'),
                        ('U1005','Mehulk','mehulk.patel@bizruntime.com','9902535566','Mumbai'),
                        ('U1006','Govardhan','govardhan.n@bizruntime.com','9902535566','Bangalore'),
                        ('U1007','Chhoturam','chhoturam.jat@bizruntime.com','9902535566','Pune'),
                        ('U1008','ChandrabHUSHAN','chandrabhushan.kumar@bizruntime.com','9902535566','Chennai'),
                        ('U1009','Raja Ram','rajaram.manu@bizruntime.com','9902535566','Delhi'),
                        ('U1010','Jagdish','jagdish.khetre@bizruntime.com','9902535566','Mumbai'),
                        ('U1011','Rohan','rohan.desai@bizruntime.com','9902535566','Bangalore');
                        
SELECT 
    *
FROM
    user;
DELETE FROM user 
WHERE
    userId = 'U1111';

CREATE TABLE Product (
    productId VARCHAR(25) PRIMARY KEY,
    productName VARCHAR(25),
    productCategory VARCHAR(25),
    price DOUBLE
);
insert into product values('Pro001','MotoxPlay','Mobile',20000),
						  ('Pro002','OnePlusOne','Mobile',15000),
                          ('Pro003','OnePlusTwo','Mobile',13000),
                          ('Pro004','iPhone4s','Mobile',30000),
                          ('Pro005','iPhone5','Mobile',21000),
                          ('Pro006','SamsungNote7','Mobile',40000),
                          ('Pro007','MotoG','Mobile',15000),
                          ('Pro008','Asus-Rog','Laptop',80000),
                          ('Pro009','Dell Latitude','Laptop',60000),
                          ('Pro010','HP Gratitude','Laptop',210000),
                          ('Pro011','AppleMacPro','Laptop',120000),
                          ('Pro012','AppleMacHome','Laptop',90000),
                          ('Pro013','LG Washing MC','WashingMachin',30000),
                          ('Pro014','LGTV','TV',40000);
insert into product value('Pro015','Asus-Rog','TV',15000);
drop table availablecity;
CREATE TABLE availableCity (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    productId VARCHAR(25) REFERENCES product (productId),
    city VARCHAR(25)
);

insert into availablecity (availablecity.productId ,availablecity.city) value('Pro015','Mumbai');
insert into availablecity values(1,'Pro001','Pune'),(2,'Pro001','Bangalore'),(3,'Pro001','Delhi'),(4,'Pro001','Mumbai'),
								(5,'Pro002','Bangalore'),(6,'Pro002','Delhi'),
								(7,'Pro003','Delhi'),
                                (8,'Pro004','Pune'),(9,'Pro004','Bangalore'),(10,'Pro004','Delhi'),
                                (11,'Pro005','Mumbai'),(12,'Pro005','Chennai'),
                                (13,'Pro006','Mumbai'),
                                (14,'Pro007','Pune'),(15,'Pro007','Bangalore'),(16,'Pro007','Delhi'),(17,'Pro007','Mumbai'),
                                (18,'Pro008','Mumbai'),(19,'Pro008','Pune'),
                                (20,'Pro009','Chennai'),
                                (21,'Pro010','Bangalore'),(22,'Pro010','Delhi'),
                                (23,'Pro011','Pune'),(24,'Pro011','Bangalore'),(25,'Pro011','Delhi'),(26,'Pro011','Mumbai'),(27,'Pro011','Chennai'),
                                (28,'Pro012','Pune'),
                                (29,'Pro013','Pune'),(30,'Pro013','Bangalore'),(31,'Pro013','Delhi'),(32,'Pro013','Mumbai'),(33,'Pro013','Chennai'),
                                (34,'Pro014','Chennai');
SELECT 
    *
FROM
    availablecity;
DELETE FROM product 
WHERE
    product.productId = 'Pro015';
DELETE FROM availablecity 
WHERE
    availablecity.productId = 'Pro015';
SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    availablecity.city
FROM
    product
        INNER JOIN
    availablecity ON product.productId = availablecity.productId
GROUP BY availablecity.productId;




SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    availablecity.city
FROM
    product
        INNER JOIN
    availablecity
WHERE
    product.productId = (SELECT 
            availablecity.productId
        FROM
            availablecity);



	


drop table productavilcity;

CREATE TABLE productavilcity (
    productId VARCHAR(25) REFERENCES product (productId),
    id INT REFERENCES city (id),
    PRIMARY KEY (productId , id)
);	
 
insert into productavilcity values('Pro001',2),('Pro001',1),('Pro001',4),('Pro001',5),
								  ('Pro002',1),('Pro002',4),
                                  ('Pro003',4),
                                  ('Pro004',2),('Pro004',1),('Pro004',4),
                                  ('Pro005',5),('Pro005',3),
                                  ('Pro006',5),
                                  ('Pro007',2),('Pro007',1),('Pro007',4),('Pro007',5),
                                  ('Pro008',5),('Pro008',2),
                                  ('Pro009',3),
                                  ('Pro010',1),('Pro010',4),
                                  ('Pro011',2),('Pro011',1),('Pro011',4),('Pro011',5),('Pro011',3),
                                  ('Pro012',2),
                                  ('Pro013',2),('Pro013',1),('Pro013',4),('Pro013',5),('Pro013',3),
                                  ('Pro014',3);


insert into productavilcity values(1,'Pro001',2),(2,'Pro001',1),(3,'Pro001',4),(4,'Pro001',5),
								  (5,'Pro002',1),(6,'Pro002',4),
                                  (7,'Pro003',4),
                                  (8,'Pro004',2),(9,'Pro004',1),(10,'Pro004',4),
                                  (11,'Pro005',5),(12,'Pro005',3),
                                  (13,'Pro006',5),
                                  (14,'Pro007',2),(15,'Pro007',1),(16,'Pro007',4),(17,'Pro007',5),
                                  (18,'Pro008',5),(19,'Pro008',2),
                                  (20,'Pro009',3),
                                  (21,'Pro010',1),(22,'Pro010',4),
                                  (23,'Pro011',2),(24,'Pro011',1),(25,'Pro011',4),(26,'Pro011',5),(27,'Pro011',3),
                                  (28,'Pro012',2),
                                  (29,'Pro013',2),(30,'Pro013',1),(31,'Pro013',4),(32,'Pro013',5),(33,'Pro013',3),
                                  (34,'Pro014',3); 
 
drop table city;
CREATE TABLE city (
    id INT PRIMARY KEY NOT NULL,
    avilablecity VARCHAR(25)
);
 
insert into city values (1,'Bangalore'),(2,'Pune'),(3,'Chennai'),(4,'Delhi'),(5,'Mumbai');

SELECT 
    product.productId,
    product.productName,
    product.price,
    product.productCategory
FROM
    product
WHERE
    product.productId IN (SELECT 
            product.productId
        FROM
            productavilcity
        WHERE
            productavilcity.id IN (SELECT 
                    productavilcity.id
                FROM
                    city
                WHERE
                    productavilcity.id = city.id));
                    

(SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    productavilcity.productId
FROM
    product
        INNER JOIN
    productavilcity
WHERE
    product.productId = productavilcity.productId) UNION (SELECT 
    city.avilablecity, productavilcity.productId
FROM
    productavilcity
        INNER JOIN
    city
WHERE
    productavilcity.id = city.id);


begin;
UPDATE user 
SET 
    userName = 'Jagdishl'
WHERE
    userId = 'U1010';
SELECT 
    *
FROM
    user;
    
rollback;    
commit;



select * from product;


SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    city.avilablecity
FROM
    product
        INNER JOIN
    (productavilcity
    INNER JOIN city ON productavilcity.id = city.id) ON productavilcity.productId = product.productId;
    
    
SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    city.avilablecity
FROM
    product
        INNER JOIN
    (productavilcity
    INNER JOIN city ON productavilcity.id = city.id) ON productavilcity.productId = product.productId
        AND city.avilablecity = (SELECT 
            user.city
        FROM
            user
        WHERE
            user.userId = 'U1001');

SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    city.avilablecity
FROM
    product
        INNER JOIN
    (productavilcity
    INNER JOIN city ON productavilcity.id = city.id) ON productavilcity.productId = product.productId
        AND city.avilablecity = (SELECT 
            user.city
        FROM
            user
        WHERE
            user.userId = 'U1001'
                AND product.productCategory = 'Mobile');

SELECT 
    product.productId,
    product.productName,
    product.productCategory,
    product.price,
    GROUP_CONCAT(availablecity.city)
FROM
    product
        INNER JOIN
    availablecity
WHERE
    product.productId = availablecity.productId
GROUP BY availablecity.productId