package mapstruct;


import java.util.List;

public class Car {
    private Long id;

    private List<Owner> ownerList;

    public Car() {
    }

    public Car(Long id, List<Owner> ownerList) {
        this.id = id;
        this.ownerList = ownerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Owner> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Owner> ownerList) {
        this.ownerList = ownerList;
    }
}
