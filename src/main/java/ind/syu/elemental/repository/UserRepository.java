package ind.syu.elemental.repository;

import ind.syu.elemental.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {


}
