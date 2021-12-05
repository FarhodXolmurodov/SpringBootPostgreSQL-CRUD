package uz.farkhod.springboot.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.farkhod.springboot.postgresql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
