package ru.saintd.springstore.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.saintd.springstore.persist.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query("from Address a where a.name = :addressName")
    Address findOneByUserName(String addressName);
}
