package mapstruct;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarMapperTest {

    @Test
    void shouldCopyWithoutId_DTO() {
        //given
        Car originalCar = getTestCar();
        //when
        CarDto dupCar = CarMapper.INSTANCE.carToCarDto(originalCar);

        //then
        assertThat(dupCar.getId()).isNull();

        assertThat(dupCar.getOwnerList().get(0).getId()).isNull();
        assertThat(dupCar.getOwnerList().get(1).getId()).isNull();

    }

    @Test
    void shouldCopyWithoutId() {
        //given
        Car originalCar = getTestCar();
        //when
        Car dupCar = CarMapper.INSTANCE.copyCar(originalCar);

        //then
        assertThat(dupCar.getId()).isNull();

        assertThat(dupCar.getOwnerList().get(0).getId()).isNull();
        assertThat(dupCar.getOwnerList().get(1).getId()).isNull();

    }

    private Car getTestCar() {
        List<Owner> owners = new ArrayList<>();
        owners.add(new Owner(10L, "Ram"));
        owners.add(new Owner(12L, "Shyam"));
        return new Car(1L, owners);
    }

}
