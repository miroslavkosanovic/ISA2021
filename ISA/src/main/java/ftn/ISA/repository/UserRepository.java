package ftn.ISA.repository;

import ftn.ISA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByMail(String Mail);

    @Transactional
    @Modifying
    @Query("UPDATE User u" + " set u.enabled = TRUE WHERE u.mail = ?1")
    int enableUser(String mail);

    User findByMailAndPassword(String mail, String password) throws Exception;
}
