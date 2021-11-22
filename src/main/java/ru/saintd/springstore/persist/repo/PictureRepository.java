package ru.saintd.springstore.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.saintd.springstore.persist.model.Picture;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
}
