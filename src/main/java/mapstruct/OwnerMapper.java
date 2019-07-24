package mapstruct;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface OwnerMapper {

    @Named("ownerWithoutId")
    @Mapping(target = "id", ignore = true)
    OwnerDto mapOwnerWithoutId(Owner owner);

    @IterableMapping(qualifiedByName = "ownerWithoutId")
    @Named("ownerListWithoutId") //it has name so that it won't be picked by the  carToCarDto() method
    List<OwnerDto> mapOwnerWithoutId(List<Owner> owner);
}
