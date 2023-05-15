package untitled.domain;

import untitled.domain.EmployeeAdded;
import untitled.BasicApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Employee_table")
@Data

public class Employee  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private Boolean isManager;
    
    
    
    
    
    private Department ;
    
    
    
    
    
    private Rank ;
    
    
    
    @Embedded
    
    private DepartmentId departmentIds;
    
    
    
    @Embedded
    
    private DepartmentId departmentId;
    
    
    
    @Embedded
    
    private DepartmentId departmentId;
    
    
    
    @Embedded
    
    private RankId rankId;

    @PostPersist
    public void onPostPersist(){


        EmployeeAdded employeeAdded = new EmployeeAdded(this);
        employeeAdded.publishAfterCommit();

    }

    public static EmployeeRepository repository(){
        EmployeeRepository employeeRepository = BasicApplication.applicationContext.getBean(EmployeeRepository.class);
        return employeeRepository;
    }






}
