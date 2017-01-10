#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ${package}.model.MobileInternet;

public interface MobileInternetRepository extends CrudRepository<MobileInternet, Integer> {
	@Query("select mi FROM MobileInternet mi INNER JOIN FETCH mi.user WHERE mi.user.msisdn = :username")
	public Optional<MobileInternet> findByUserName(@Param("username") String msisdn);
}
