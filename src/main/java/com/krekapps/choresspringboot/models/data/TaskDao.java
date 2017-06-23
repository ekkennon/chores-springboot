package com.krekapps.choresspringboot.models.data;

import com.krekapps.choresspringboot.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by raefo on 22-Jun-17.
 */

@Repository
@Transactional
public interface TaskDao extends CrudRepository<Task, Integer> {
}
