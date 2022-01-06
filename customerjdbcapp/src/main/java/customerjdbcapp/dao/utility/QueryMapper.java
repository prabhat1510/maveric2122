package customerjdbcapp.dao.utility;

public interface QueryMapper {

	public static final String ADD_CUSTOMER="INSERT INTO Customer(customerId,customerName,birthDate,mobile,email) VALUES (?,?,?,?,?)";
}
