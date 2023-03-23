package dao;

import presentation.modele.Client;


<<<<<<< HEAD
import java.sql.Connection;
=======
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
import java.util.List;

public interface IDao<T, ID> {

<<<<<<< HEAD
    SingConection singCon=SingConection.getInstance();
    static Connection Con= singCon.getCon();

=======
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
    List<T> findAll();
    T       findById(ID id);


    T       save(T t);
    List<T> saveAll(List<T> liste);
    T       update(T t);

    Boolean delete(T t);
    Boolean deleteById(ID id);

}
