package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class EmployeeAdded extends AbstractEvent {

    private Long id;

    public EmployeeAdded(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdded() {
        super();
    }
}
