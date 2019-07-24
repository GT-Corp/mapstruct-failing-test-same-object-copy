package mapstruct;

import java.util.ArrayList;
import java.util.List;

class CarDto {

    Long id;

    List<OwnerDto> ownerList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OwnerDto> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<OwnerDto> ownerList) {
        this.ownerList = ownerList;
    }
}


