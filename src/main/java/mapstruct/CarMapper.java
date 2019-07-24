package mapstruct;

import jdk.jfr.Name;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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


}
