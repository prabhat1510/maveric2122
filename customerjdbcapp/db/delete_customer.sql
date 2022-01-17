USE `training`;
DROP procedure IF EXISTS `delete_customer`;

DELIMITER $$
USE `training`$$
CREATE PROCEDURE delete_customer (custId int)
BEGIN
 DELETE FROM CUSTOMER WHERE customerId=custId;
END$$

DELIMITER ;

