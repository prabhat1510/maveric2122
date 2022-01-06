package customerjdbcapp.dao.utility;

public interface QueryMapper {

	public static final String ADD_CUSTOMER="INSERT INTO Customer(customerId,customerName,birthDate,mobile,email) VALUES (?,?,?,?,?)";
	public static final String GET_CUSTOMER_BY_ID = "SELECT * FROM CUSTOMER WHERE customerId=?";
	public static final String GET_ALL_CUSTOMERS = "SELECT * FROM CUSTOMER";
}
