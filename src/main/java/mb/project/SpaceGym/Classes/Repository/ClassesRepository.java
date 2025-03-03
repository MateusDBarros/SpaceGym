package mb.project.SpaceGym.Classes.Repository;

import mb.project.SpaceGym.Classes.Models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Long> {
    @Override
    boolean existsById(Long aLong);
}
