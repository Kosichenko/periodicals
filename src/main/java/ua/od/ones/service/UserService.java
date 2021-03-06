package ua.od.ones.service;

import ua.od.ones.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends GenericService<User>{

    @Override
    User create(User user);

    @Override
    boolean update(User user);

    @Override
    Optional<User> getById(long id);

    @Override
    List<User> getAll();

    Optional<User> getByName(String test);
}
