package mapstruct;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ownerList", qualifiedByName = "withoutIdDto")
    CarDto carToCarDto(Car car);

    @Named("withoutIdDto")
    @Mapping(target = "id", ignore = true)
    OwnerDto mapOwnerDtoWithoutId(Owner owner);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ownerList", qualifiedByName = "withoutId")
    Car copyCar(Car car);

    @Named("withoutId")
    @Mapping(target = "id", ignore = true)
    Owner mapOwnerWithoutId(Owner owner);


    //https://stackoverflow.com/questions/57189819/mapstruct-ignore-fields-from-nested-collection-not-working-when-cloning-the
    //workaround is to provide a ```List<T> map ( List<T> o )``` mapping with @IterableMapping
    // commented to keep the tests fail
    //    @IterableMapping(qualifiedByName = "withoutId")
    //    List<Owner> copyOwners(List<Owner> owners);
}
