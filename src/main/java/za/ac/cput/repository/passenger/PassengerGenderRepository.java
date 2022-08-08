/* PassengerGenderRepository.java
 Author: Hilary Cassidy Nguepi Nangmo (220346887)
 Date: 6 April 2022
*/
package za.ac.cput.repository.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.passenger.PassengerGender;

import java.util.HashSet;
import java.util.Set;
@Repository
public interface PassengerGenderRepository extends JpaRepository<PassengerGender,String>
{

}

