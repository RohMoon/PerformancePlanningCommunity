package moon.aggregations.v1.order.presentation.dto.req;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CreateOrderDto {

    private int price;
    private int deliveryFee;
    private int isTaxation;

    @NotNull
    private String address;

    @Valid
    @NotNull
    private List<CreateOrderItemDto> items;
}
