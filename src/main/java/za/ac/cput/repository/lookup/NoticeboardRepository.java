package za.ac.cput.repository.lookup;

//216266882 Mogamad Tawfeeq Cupido
//2022/08/07


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.lookup.NoticeBoard;
@Repository
public interface NoticeboardRepository extends JpaRepository<NoticeBoard, String> {

}