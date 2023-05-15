package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DepartmentAdded extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdded(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdded() {
        super();
    }
}
